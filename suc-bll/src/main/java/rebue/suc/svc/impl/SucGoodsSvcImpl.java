package rebue.suc.svc.impl;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.dozermapper.core.Mapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.Ro;
import rebue.robotech.svc.impl.BaseSvcImpl;
import rebue.suc.Ro.UserGoodsRo;
import rebue.suc.To.SucGoodsTo;
import rebue.suc.dao.SucGoodsDao;
import rebue.suc.jo.SucGoodsJo;
import rebue.suc.mapper.SucGoodsMapper;
import rebue.suc.mo.SucGoodsClassMo;
import rebue.suc.mo.SucGoodsImgMo;
import rebue.suc.mo.SucGoodsMo;
import rebue.suc.mo.SucUserMo;
import rebue.suc.svc.SucGoodsClassSvc;
import rebue.suc.svc.SucGoodsImgSvc;
import rebue.suc.svc.SucGoodsSvc;
import rebue.suc.svc.SucUserSvc;

/**
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
public class SucGoodsSvcImpl extends BaseSvcImpl<java.lang.Long, SucGoodsJo, SucGoodsDao, SucGoodsMo, SucGoodsMapper>
		implements SucGoodsSvc {

	@Resource
	private Mapper dozerMapper;

	@Resource
	private SucGoodsImgSvc sucGoodsImgSvc;

	@Resource
	private SucGoodsClassSvc sucGoodsClassSvc;

	@Resource
	private SucUserSvc sucUserSvc;

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int add(SucGoodsMo mo) {
		log.info("sucGoodsSvc.add: 添加 mo-{}", mo);
		// 如果id为空那么自动生成分布式id
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		return super.add(mo);
	}

	/**
	 * 添加商品
	 */
	@Override
	public Ro addGoods(SucGoodsTo to) {
		SucGoodsMo mo = dozerMapper.map(to, SucGoodsMo.class);
		mo.setState(true);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 14);
		Date date = new Date();
		;
		try {
			date = sf.parse(sf.format(c.getTime()));
			mo.setAotuDownTime(date);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		add(mo);
		// 添加商品图片
		for (SucGoodsImgMo item : to.getFileList()) {
			SucGoodsImgMo goodsMo = new SucGoodsImgMo();
			goodsMo.setImgPath(item.getImgPath());
			goodsMo.setGoodId(mo.getId());
			log.info("添加商品的参数为:goodsMo-{}", goodsMo);
			if (sucGoodsImgSvc.add(goodsMo) != 1) {
				log.error("添加商品失败");
				throw new RuntimeException("error");
			}

		}
		Ro result = new Ro();
		result.setMsg("添加成功");
		result.setResult(ResultDic.SUCCESS);
		return result;
	}

	/**
	 * 分页查询用户商品和商品图片
	 */
	@Override
	public PageInfo<UserGoodsRo> listGoods(SucGoodsMo mo, Integer pageNum, Integer pageSize) {
		log.info("listGoods: 查询用户商品参数为 mo-{},pageNum-{},pageSize-{}", mo, pageNum, pageSize);
		PageInfo<UserGoodsRo> result = PageHelper.startPage(pageNum, pageSize)
				.doSelectPageInfo(() -> _mapper.listGoods(mo));
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
		}

		return result;
	}

	@Override
	public PageInfo<UserGoodsRo> listGoodsByGoodIds(String goodIds, Integer pageNum, Integer pageSize) {
		log.info("获取商品ids获取商品参数为-{}", goodIds);
		return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> _mapper.listGoodsByGoodIds(goodIds));
	}
}
