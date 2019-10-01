package rebue.suc.svc.impl;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import rebue.robotech.svc.impl.BaseSvcImpl;
import rebue.suc.Ro.UserDriverRo;
import rebue.suc.dao.SucUserDriverDao;
import rebue.suc.jo.SucUserDriverJo;
import rebue.suc.mapper.SucUserDriverMapper;
import rebue.suc.mo.SucUserDriverMo;
import rebue.suc.mo.SucUserMo;
import rebue.suc.svc.SucUserDriverSvc;
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
public class SucUserDriverSvcImpl
		extends BaseSvcImpl<java.lang.Long, SucUserDriverJo, SucUserDriverDao, SucUserDriverMo, SucUserDriverMapper>
		implements SucUserDriverSvc {

	@Resource
	SucUserSvc sucUserSvc;

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int add(SucUserDriverMo mo) {
		log.info("sucUserDriverSvc.add: 添加 mo-{}", mo);
		// 如果id为空那么自动生成分布式id
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		return super.add(mo);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public PageInfo<UserDriverRo> listUserComment(final SucUserDriverMo mo, Integer pageNum, Integer pageSize) {
		log.info("listUserComment: 查询用户评论参数为 mo-{},pageNum-{},pageSize-{}", mo, pageNum, pageSize);
		PageInfo<UserDriverRo> result = PageHelper.startPage(pageNum, pageSize)
				.doSelectPageInfo(() -> _mapper.listUserComment(mo));
		log.info("listUserComment: 查询用户评论结果为result.getList()--{}", result.getList());
		for (final UserDriverRo item : result.getList()) {
			log.info("获取用户的参数为id-{}", item.getUserId());
			SucUserMo userResult = sucUserSvc.getById(item.getUserId());
			log.info("获取用户的结果为-{}", userResult);
			item.setUserName(userResult.getWxName());
			item.setUserFace(userResult.getWxFacePath());
		}
		return result;
	}

}
