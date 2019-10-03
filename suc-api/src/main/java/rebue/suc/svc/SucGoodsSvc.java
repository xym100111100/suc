package rebue.suc.svc;

import rebue.robotech.ro.Ro;
import rebue.robotech.svc.BaseSvc;
import rebue.suc.To.SucGoodsTo;
import rebue.suc.jo.SucGoodsJo;
import rebue.suc.mo.SucGoodsMo;

/**
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface SucGoodsSvc extends BaseSvc<java.lang.Long, SucGoodsMo, SucGoodsJo> {

	Ro addGoods(SucGoodsTo to);
}
