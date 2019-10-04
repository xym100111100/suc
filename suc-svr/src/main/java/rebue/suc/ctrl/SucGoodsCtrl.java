package rebue.suc.ctrl;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.IdRo;
import rebue.robotech.ro.Ro;
import rebue.suc.Ro.UserGoodsRo;
import rebue.suc.To.SucGoodsTo;
import rebue.suc.mo.SucGoodsMo;
import rebue.suc.svc.SucGoodsSvc;

/**
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
@Slf4j
public class SucGoodsCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private SucGoodsSvc svc;
    
    /**
     * 添加
     *
     */
    @PostMapping("/suc/goods")
    Ro add(@RequestBody final SucGoodsTo to) throws Exception {
        log.info("received post:/suc/goods");
        log.info("goodsCtrl.add: {}", to);
        final IdRo ro = new IdRo();
        try {
            final Ro result = svc.addGoods(to);
            if (result.getResult().getCode() == 1) {
                final String msg = "添加成功";
                log.info("{}: mo-{}", msg, to);
                ro.setMsg(msg);
                ro.setResult(ResultDic.SUCCESS);
                return ro;
            } else {
                final String msg = "添加失败";
                ro.setMsg(msg);
                ro.setResult(ResultDic.FAIL);
                return ro;
            }
        } catch (final DuplicateKeyException e) {
            final String msg = "添加失败，唯一键重复：" + e.getCause().getMessage();
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        } catch (final RuntimeException e) {
            final String msg = "添加失败，出现运行时异常";
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 修改
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/suc/goods")
    Ro modify(@RequestBody final SucGoodsMo mo) throws Exception {
        log.info("received put:/suc/goods");
        log.info("goodsCtrl.modify: {}", mo);
        try {
            if (svc.modify(mo) == 1) {
                final String msg = "修改成功";
                log.info("{}: mo-{}", msg, mo);
                return new Ro(ResultDic.SUCCESS, msg);
            } else {
                final String msg = "修改失败";
                log.error("{}: mo-{}", msg, mo);
                return new Ro(ResultDic.FAIL, msg);
            }
        } catch (final DuplicateKeyException e) {
            final String msg = "修改失败，唯一键重复：" + e.getCause().getMessage();
            log.error(msg + ": mo=" + mo, e);
            return new Ro(ResultDic.FAIL, msg);
        } catch (final RuntimeException e) {
            final String msg = "修改失败，出现运行时异常";
            log.error(msg + ": mo-" + mo, e);
            return new Ro(ResultDic.FAIL, msg);
        }
    }

    /**
     * 删除
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/suc/goods")
    Ro del(@RequestParam("id") final java.lang.Long id) {
        log.info("received delete:/suc/goods");
        log.info("goodsCtrl.del: {}", id);
        final int result = svc.del(id);
        if (result == 1) {
            final String msg = "删除成功";
            log.info("{}: id-{}", msg, id);
            return new Ro(ResultDic.SUCCESS, msg);
        } else {
            final String msg = "删除失败，找不到该记录";
            log.error("{}: id-{}", msg, id);
            return new Ro(ResultDic.FAIL, msg);
        }
    }

    /**
     * 查询
     *
     */
    @GetMapping("/suc/goods")
    PageInfo<UserGoodsRo> list(final SucGoodsMo mo, @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        log.info("received get:/suc/goods");
        log.info("goodsCtrl.list: {},pageNum-{},pageSize-{}", mo, pageNum, pageSize);
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }
        log.info("list SucGoodsMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            final String msg = "pageSize不能大于50";
            log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        final PageInfo<UserGoodsRo> result = svc.listGoods(mo, pageNum, pageSize);
        log.info("result: " + result);
        return result;
    }

    /**
     * 获取单个
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/suc/goods/get-by-id")
    SucGoodsMo getById(@RequestParam("id") final java.lang.Long id) {
        log.info("received get:/suc/goods/get-by-id");
        log.info("goodsCtrl.getById: {}", id);
        return svc.getById(id);
    }
}
