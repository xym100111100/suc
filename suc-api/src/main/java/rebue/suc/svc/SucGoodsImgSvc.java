package rebue.suc.svc;

import rebue.robotech.svc.BaseSvc;
import rebue.suc.jo.SucGoodsImgJo;
import rebue.suc.mo.SucGoodsImgMo;

/**
 * 商品图片
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface SucGoodsImgSvc extends BaseSvc<java.lang.Long, SucGoodsImgMo, SucGoodsImgJo> {
	
	int deleteByGoodId(Long goodId);
}
