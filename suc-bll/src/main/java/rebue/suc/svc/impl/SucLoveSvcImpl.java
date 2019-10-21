package rebue.suc.svc.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;

import rebue.robotech.svc.impl.BaseSvcImpl;
import rebue.suc.Ro.UserGoodsRo;
import rebue.suc.dao.SucLoveDao;
import rebue.suc.jo.SucLoveJo;
import rebue.suc.mapper.SucLoveMapper;
import rebue.suc.mo.SucGoodsClassMo;
import rebue.suc.mo.SucGoodsImgMo;
import rebue.suc.mo.SucLoveMo;
import rebue.suc.mo.SucUserMo;
import rebue.suc.svc.SucGoodsClassSvc;
import rebue.suc.svc.SucGoodsImgSvc;
import rebue.suc.svc.SucGoodsSvc;
import rebue.suc.svc.SucLoveSvc;
import rebue.suc.svc.SucUserSvc;

/**
 * 用户喜欢的商品
 *
 * 在单独使用不带任何参数的 @Transactional 注释时， propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED， 而且事务不会针对受控异常（checked exception）回滚。
 *
 * 注意： 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Service
@Slf4j
public class SucLoveSvcImpl extends BaseSvcImpl<java.lang.Long, SucLoveJo, SucLoveDao, SucLoveMo, SucLoveMapper>
		implements SucLoveSvc {

	@Resource
	private SucGoodsSvc sucGoodsSvc;

	@Resource
	private SucGoodsImgSvc sucGoodsImgSvc;

	@Resource
	private SucGoodsClassSvc sucGoodsClassSvc;

	@Resource
	private SucUserSvc sucUserSvc;

	/**
	 * 已被修改为如果存在就返回-1
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int add(SucLoveMo mo) {
		// 添加前先查询是否已经有了
		log.info("查询是否已经存在的参数为mo-{}", mo);
		SucLoveMo isExist = super.getOne(mo);
		log.info("查询是否已经存在的结果为isExist-{}", isExist);
		if (isExist != null) {
			return -1;
		}
		// 添加创建时间
		mo.setCreatTime(new Date());
		log.info("sucLoveSvc.add: 添加用户喜欢的商品 mo-{}", mo);
		// 如果id为空那么自动生成分布式id
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		return super.add(mo);
	}

	@Override
	public PageInfo<UserGoodsRo> listLoveGoods(SucLoveMo mo, Integer pageNum, Integer pageSize) {
		log.info("获取用户收藏的商品的参数为:{}", mo);
		List<SucLoveMo> sucLoveResult = super.list(mo);
		log.info("获取用户收藏的商品的结果为:{}", sucLoveResult);
		// 拼接的商品id
		String goodIds = "";
		if (sucLoveResult.size() != 0) {
			for (int i = 0; i < sucLoveResult.size(); i++) {
				if (i != 0 && i < sucLoveResult.size()) {
					goodIds += ",'" + sucLoveResult.get(i).getGoodsId() + "'";
				} else {
					goodIds += "'" + sucLoveResult.get(i).getGoodsId() + "'";
				}
			}
			log.info("查询未添加和已经添加的组织的参数为: {}", goodIds);
		} else {
			goodIds = "0";
		}

		PageInfo<UserGoodsRo> result = sucGoodsSvc.listGoodsByGoodIds(goodIds, pageNum, pageSize);
		for (final UserGoodsRo item : result.getList()) {
			// 获取商品图片
			SucGoodsImgMo imgMo = new SucGoodsImgMo();
			imgMo.setGoodId(item.getId());
			log.info("获取用户的图片的参数-{}", imgMo);
			List<SucGoodsImgMo> imgResult = sucGoodsImgSvc.list(imgMo);
			log.info("获取用户的图片的结果-{}", imgResult);
			item.setFileList(imgResult);
			// 获取商品分类名字
			log.info("获取商品分类名字的参数-{}", item.getClassId());
			SucGoodsClassMo classResult = sucGoodsClassSvc.getById(item.getClassId());
			log.info("获取商品分类名字的结果-{}", classResult);
			item.setClassName(classResult.getClassName());
			// 获取用户微信昵称
			log.info("获取用户的微信昵称的参数iuserId-{}", item.getUserId());
			SucUserMo userResult = sucUserSvc.getById(item.getUserId());
			log.info("获取用户的微信昵称的结果userResult-{}", userResult);
			item.setUserName(userResult.getWxName());
			item.setWxFacePath(userResult.getWxFacePath());
		}

		return result;
	}

	@Override
	public int delByIds(List<String> checkedGoods) {
		String goodIds = "";
		for (int i = 0; i < checkedGoods.size(); i++) {
			if (i != 0 && i < checkedGoods.size()) {
				goodIds += ",'" + checkedGoods.get(i) + "'";
			} else {
				goodIds += "'" + checkedGoods.get(i) + "'";
			}
		}
		log.info("拼接的商品ids为:goodIds-{}",goodIds);
		return _mapper.delByIds(goodIds);
	}
}
