package rebue.suc.ctrl;

import com.github.pagehelper.PageInfo;

import java.util.List;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
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
import rebue.suc.mo.SucLoveMo;
import rebue.suc.svc.SucLoveSvc;

/**
 * 用户喜欢的商品
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
@Slf4j
public class SucLoveCtrl {

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Resource
	private SucLoveSvc svc;

	/**
	 * 添加用户喜欢的商品
	 *
	 */
	@PostMapping("/suc/love")
	Ro add(@RequestBody final SucLoveMo mo) throws Exception {
		log.info("received post:/suc/love");
		log.info("loveCtrl.add: {}", mo);
		final IdRo ro = new IdRo();
		try {
			final int result = svc.add(mo);
			if (result == 1) {
				final String msg = "添加成功";
				log.info("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult(ResultDic.SUCCESS);
				return ro;
			} else if (result == -1) {
				final String msg = "已有商品";
				log.error("{}: mo-{}", msg, mo);
				ro.setMsg(msg);
				ro.setResult(ResultDic.SUCCESS);
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
	 * 修改用户喜欢的商品
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PutMapping("/suc/love")
	Ro modify(@RequestBody final SucLoveMo mo) throws Exception {
		log.info("received put:/suc/love");
		log.info("loveCtrl.modify: {}", mo);
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
	 * 删除用户喜欢的商品
	 */
	@PutMapping("/suc/love/by-ids")
	Ro delByIds(@RequestBody List<String> checkedGoods) {
		log.info(" delByIds:/suc/love");
		log.info("根据用户idss删除用户喜欢的商品参数为: {}", checkedGoods);
		final int result = svc.delByIds(checkedGoods);
		if (result > 0) {
			final String msg = "删除成功";
			log.info("{}: id-{}", msg, checkedGoods);
			return new Ro(ResultDic.SUCCESS, msg);
		} else {
			final String msg = "删除失败，找不到该记录";
			log.error("{}: id-{}", msg, checkedGoods);
			return new Ro(ResultDic.FAIL, msg);
		}
	}

	/**
	 * 查询用户喜欢的商品
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@GetMapping("/suc/love")
	PageInfo<UserGoodsRo> list(final SucLoveMo mo, @RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		log.info("received get:/suc/love");
		log.info("loveCtrl.list: {},pageNum-{},pageSize-{}", mo, pageNum, pageSize);
		if (pageNum == null) {
			pageNum = 1;
		}
		if (pageSize == null) {
			pageSize = 7;
		}
		log.info("list SucLoveMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
		if (pageSize > 50) {
			final String msg = "pageSize不能大于50";
			log.error(msg);
			throw new IllegalArgumentException(msg);
		}
		final PageInfo<UserGoodsRo> result = svc.listLoveGoods(mo, pageNum, pageSize);
		log.info("result: " + result);
		return result;
	}

	/**
	 * 获取单个用户喜欢的商品
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@GetMapping("/suc/love/get-by-id")
	SucLoveMo getById(@RequestParam("id") final java.lang.Long id) {
		log.info("received get:/suc/love/get-by-id");
		log.info("loveCtrl.getById: {}", id);
		return svc.getById(id);
	}

	@GetMapping("/suc/love/get-count-by-user-id")
	int getLovaCount(@RequestParam("userId") final java.lang.Long userId) {
		log.info("loveCtrl.getLovaCount: userId-{}", userId);
		SucLoveMo mo = new SucLoveMo();
		mo.setUserId(userId);
		List<SucLoveMo> result = svc.list(mo);
		log.info("loveCtrl.getLovaCount: result-{}", result);
		return result.size();
	}

}
