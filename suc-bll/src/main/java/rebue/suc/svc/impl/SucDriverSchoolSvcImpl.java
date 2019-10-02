package rebue.suc.svc.impl;

import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rebue.robotech.svc.impl.BaseSvcImpl;
import rebue.suc.Ro.DriverSchoolRo;
import rebue.suc.dao.SucDriverSchoolDao;
import rebue.suc.jo.SucDriverSchoolJo;
import rebue.suc.mapper.SucDriverSchoolMapper;
import rebue.suc.mo.SucDriverSchoolMo;
import rebue.suc.mo.SucTainingAddrMo;
import rebue.suc.svc.SucDriverSchoolSvc;
import rebue.suc.svc.SucTainingAddrSvc;

/**
 * 驾校信息
 *
 * 在单独使用不带任何参数的 @Transactional 注释时，
 * propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED，
 * 而且事务不会针对受控异常（checked exception）回滚。
 *
 * 注意：
 * 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Service
@Slf4j
public class SucDriverSchoolSvcImpl extends BaseSvcImpl<java.lang.Long, SucDriverSchoolJo, SucDriverSchoolDao, SucDriverSchoolMo, SucDriverSchoolMapper> implements SucDriverSchoolSvc {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(SucDriverSchoolMo mo) {
        log.info("sucDriverSchoolSvc.add: 添加驾校信息 mo-", mo);
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        return super.add(mo);
    }

    @Resource
    SucTainingAddrSvc sucTainingAddrSvc;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public DriverSchoolRo getOneById(Long id) {
        DriverSchoolRo result = new DriverSchoolRo();
        log.info("获取驾校的参数为id-{}", id);
        SucDriverSchoolMo sucDriverSchoolMo = super.getById(id);
        log.info("获取驾校的结果为id-{}", sucDriverSchoolMo);
        result.setSucDriverSchoolMo(sucDriverSchoolMo);
        SucTainingAddrMo sucTainingAddrMo = new SucTainingAddrMo();
        sucTainingAddrMo.setDeriverId(sucDriverSchoolMo.getId());
        log.info("获取驾校训练场地址的参数为sucTainingAddrMo-{}", sucTainingAddrMo);
        List<SucTainingAddrMo> sucTainingAddrResult = sucTainingAddrSvc.list(sucTainingAddrMo);
        log.info("获取驾校训练场地址的结果为sucTainingAddrResult-{}", sucTainingAddrResult);
        result.setSucTainingAddrList(sucTainingAddrResult);
        return result;
    }
}
