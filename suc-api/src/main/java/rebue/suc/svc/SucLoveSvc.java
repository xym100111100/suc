package rebue.suc.svc;

import java.util.List;


import com.github.pagehelper.PageInfo;

import rebue.robotech.svc.BaseSvc;
import rebue.suc.Ro.UserGoodsRo;
import rebue.suc.jo.SucLoveJo;
import rebue.suc.mo.SucLoveMo;

/**
 * 用户喜欢的商品
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface SucLoveSvc extends BaseSvc<java.lang.Long, SucLoveMo, SucLoveJo> {

	PageInfo<UserGoodsRo> listLoveGoods(SucLoveMo mo, Integer pageNum, Integer pageSize);

	int delByIds(List<String> checkedGoods);
}
