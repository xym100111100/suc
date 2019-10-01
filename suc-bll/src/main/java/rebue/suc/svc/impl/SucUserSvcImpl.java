package rebue.suc.svc.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.robotech.svc.impl.BaseSvcImpl;
import rebue.suc.Ro.UserLoginRo;
import rebue.suc.dao.SucUserDao;
import rebue.suc.jo.SucUserJo;
import rebue.suc.mapper.SucUserMapper;
import rebue.suc.mo.SucUserMo;
import rebue.suc.svc.SucUserSvc;

/**
 * 用户表
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
public class SucUserSvcImpl extends BaseSvcImpl<java.lang.Long, SucUserJo, SucUserDao, SucUserMo, SucUserMapper>
		implements SucUserSvc {

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int add(SucUserMo mo) {
		log.info("sucUserSvc.add: 添加用户表 mo-{}", mo);
		// 如果id为空那么自动生成分布式id
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		return super.add(mo);
	}

	@Override
	public UserLoginRo userLogin(SucUserMo mo) {
		UserLoginRo ro = new UserLoginRo();
		SucUserMo getUserMo = new SucUserMo();
		getUserMo.setWxOpenid(mo.getWxOpenid());
		log.info("获取用户的参数为: getUserMo-", getUserMo);
		SucUserMo userResult = super.getOne(mo);
		log.info("获取用户的结果为: userResult-", userResult);
		if (userResult == null) {
			log.info("用户不存在，添加新用户");
			mo.setModifiedTimestamp(new Date().getTime());
			log.info("添加新用户参数为:{}", mo);
			if (add(mo) != 1) {
				ro.setMsg("添加新用户失败");
				ro.setResult((byte) -1);
			} else {
				ro.setMsg("添加新用户成功");
				ro.setResult((byte) 1);
				ro.setNewUser(true);
				ro.setSucUserMo(mo);
			}
		} else {
			log.info("用户存在，更新用户信息");
			SucUserMo editMo = new SucUserMo();
			editMo.setId(userResult.getId());
			editMo.setModifiedTimestamp(new Date().getTime());
			editMo.setWxFacePath(mo.getWxFacePath());
			editMo.setWxName(mo.getWxName());
			if(super.modify(editMo) != 1) {
				ro.setMsg("更新用戶信息失败");
				ro.setResult((byte) -1);
			}else {
				ro.setMsg("更新用戶信息成功");
				ro.setResult((byte) 1);
				ro.setNewUser(false);
				ro.setSucUserMo(super.getById(editMo.getId()));
			}
		}
		return ro;
	}
}
