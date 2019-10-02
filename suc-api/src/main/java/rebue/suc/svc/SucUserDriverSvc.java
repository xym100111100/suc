package rebue.suc.svc;

import com.github.pagehelper.PageInfo;
import rebue.robotech.svc.BaseSvc;
import rebue.suc.Ro.UserDriverRo;
import rebue.suc.jo.SucUserDriverJo;
import rebue.suc.mo.SucUserDriverMo;

/**
 * 用户驾校信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface SucUserDriverSvc extends BaseSvc<java.lang.Long, SucUserDriverMo, SucUserDriverJo> {

    PageInfo<UserDriverRo> listUserComment(SucUserDriverMo mo, Integer pageNum, Integer pageSize);
}
