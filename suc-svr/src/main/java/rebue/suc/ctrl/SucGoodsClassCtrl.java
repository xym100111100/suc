package rebue.suc.ctrl;

import java.util.List;

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
import rebue.suc.mo.SucGoodsClassMo;
import rebue.suc.svc.SucGoodsClassSvc;

/**
 * 用户商品分类
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
@Slf4j
public class SucGoodsClassCtrl {

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Resource
	private SucGoodsClassSvc svc;

	/**
	 * 添加用户商品分类
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PostMapping("/suc/goods-class")
	IdRo add(@RequestBody final SucGoodsClassMo mo) throws Exception {
		log.info("received post:/suc/goods-class");
		log.info("goodsClassCtrl.add: {}", mo);
		final IdRo ro = new IdRo();
		try {
			final int result = svc.add(mo);
			if (result == 1) {
				final String msg = "添加成功";
				log.info("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult(ResultDic.SUCCESS);
				ro.setId(mo.getId().toString());
				return ro;
			} else {
				final String msg = "添加失败";
				log.error("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult(ResultDic.FAIL);
				return ro;
			}
		} catch (final DuplicateKeyException e) {
			final String msg = "添加失败，唯一键重复：" + e.getCause().getMessage();
			log.error(msg + ": mo-" + mo, e);
			ro.setMsg(msg);
			ro.setResult(ResultDic.FAIL);
			return ro;
		} catch (final RuntimeException e) {
			final String msg = "添加失败，出现运行时异常";
			log.error(msg + ": mo-" + mo, e);
			ro.setMsg(msg);
			ro.setResult(ResultDic.FAIL);
			return ro;
		}
	}

	/**
	 * 修改用户商品分类
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PutMapping("/suc/goods-class")
	Ro modify(@RequestBody final SucGoodsClassMo mo) throws Exception {
		log.info("received put:/suc/goods-class");
		log.info("goodsClassCtrl.modify: {}", mo);
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
	 * 删除用户商品分类
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@DeleteMapping("/suc/goods-class")
	Ro del(@RequestParam("id") final java.lang.Long id) {
		log.info("received delete:/suc/goods-class");
		log.info("goodsClassCtrl.del: {}", id);
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
	 * 查询用户商品分类
	 *
	 */
	@GetMapping("/suc/goods-class")
	List<SucGoodsClassMo> list(final SucGoodsClassMo mo) {
		log.info("查询用户商品分类-{}",mo);
		return svc.list(mo);
	}

	/**
	 * 获取单个用户商品分类
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@GetMapping("/suc/goods-class/get-by-id")
	SucGoodsClassMo getById(@RequestParam("id") final java.lang.Long id) {
		log.info("received get:/suc/goods-class/get-by-id");
		log.info("goodsClassCtrl.getById: {}", id);
		return svc.getById(id);
	}
}
