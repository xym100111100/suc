package rebue.suc.svc;

import org.springframework.web.bind.annotation.RequestBody;

import rebue.robotech.svc.BaseSvc;
import rebue.suc.Ro.UserLoginRo;
import rebue.suc.jo.SucUserJo;
import rebue.suc.mo.SucUserMo;

/**
 * 用户表
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface SucUserSvc extends BaseSvc<java.lang.Long, SucUserMo, SucUserJo> {
	
	/**
	 * 用户登录
	 * @param mo
	 * @return
	 */
	UserLoginRo userLogin(@RequestBody final SucUserMo mo) ;
}
