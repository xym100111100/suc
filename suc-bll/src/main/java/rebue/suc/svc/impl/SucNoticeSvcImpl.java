package rebue.suc.svc.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import rebue.robotech.svc.impl.BaseSvcImpl;
import rebue.suc.Ro.SucNoticeRo;
import rebue.suc.dao.SucNoticeDao;
import rebue.suc.jo.SucNoticeJo;
import rebue.suc.mapper.SucNoticeMapper;
import rebue.suc.mo.SucNoticeMo;
import rebue.suc.mo.SucUserMo;
import rebue.suc.svc.SucNoticeSvc;
import rebue.suc.svc.SucUserSvc;

/**
 * 用户需求公告
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
public class SucNoticeSvcImpl extends
		BaseSvcImpl<java.lang.Long, SucNoticeJo, SucNoticeDao, SucNoticeMo, SucNoticeMapper> implements SucNoticeSvc {

	/**
	 * 修改为如果用户公告已经有四个就不能再次添加
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int add(SucNoticeMo mo) {
		log.info("sucNoticeSvc.add: 添加用户需求公告 mo-{}", mo);
		SucNoticeMo addMo = new SucNoticeMo();
		addMo.setUserId(mo.getUserId());
		List<SucNoticeMo> result = super.list(addMo);
		if (result.size() > 4) {
			return -1;
		}
		// 如果id为空那么自动生成分布式id
		if (mo.getId() == null || mo.getId() == 0) {
			mo.setId(_idWorker.getId());
		}
		return super.add(mo);
	}

	@Resource
	private SucUserSvc sucUserSvc;

	@Override
	public PageInfo<SucNoticeRo> listNotice(SucNoticeMo mo, Integer pageNum, Integer pageSize) {
		PageInfo<SucNoticeRo> result = PageHelper.startPage(pageNum, pageSize)
				.doSelectPageInfo(() -> _mapper.listNotice(mo));
		for (final SucNoticeRo item : result.getList()) {
			// 获取用户微信昵称
			log.info("获取用户的微信昵称和头像的参数iuserId-{}", item.getUserId());
			SucUserMo userResult = sucUserSvc.getById(item.getUserId());
			log.info("获取用户的微信昵称和头像的结果userResult-{}", userResult);
			item.setUserName(userResult.getWxName());
			item.setWxFacePath(userResult.getWxFacePath());
		}

		return result;
	}

}
