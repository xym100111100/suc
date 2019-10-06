package rebue.suc.svc;

import com.github.pagehelper.PageInfo;

import rebue.robotech.svc.BaseSvc;
import rebue.suc.Ro.SucNoticeRo;
import rebue.suc.jo.SucNoticeJo;
import rebue.suc.mo.SucNoticeMo;

/**
 * 用户需求公告
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface SucNoticeSvc extends BaseSvc<java.lang.Long, SucNoticeMo, SucNoticeJo> {
	
	PageInfo<SucNoticeRo>   listNotice(SucNoticeMo mo,Integer pageNum,Integer pageSize);
}
