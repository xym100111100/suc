package rebue.suc.ctrl;

import com.github.pagehelper.PageInfo;

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
import rebue.suc.mo.SucTainingAddrMo;
import rebue.suc.svc.SucTainingAddrSvc;

/**
 * 训练场信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
@Slf4j
public class SucTainingAddrCtrl {

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Resource
	private SucTainingAddrSvc svc;

	/**
	 * 添加训练场信息
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PostMapping("/suc/taining-addr")
	IdRo add(@RequestBody final SucTainingAddrMo mo) throws Exception {
		log.info("received post:/suc/taining-addr");
		log.info("tainingAddrCtrl.add: {}", mo);
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
	 * 修改训练场信息
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PutMapping("/suc/taining-addr")
	Ro modify(@RequestBody final SucTainingAddrMo mo) throws Exception {
		log.info("received put:/suc/taining-addr");
		log.info("tainingAddrCtrl.modify: {}", mo);
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
	 * 删除训练场信息
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@DeleteMapping("/suc/taining-addr")
	Ro del(@RequestParam("id") final java.lang.Long id) {
		log.info("received delete:/suc/taining-addr");
		log.info("tainingAddrCtrl.del: {}", id);
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
	 * 查询训练场信息
	 *
	 */
	@GetMapping("/suc/taining-addr")
	List<SucTainingAddrMo> list(final SucTainingAddrMo mo) {
		log.info("received get:/suc/taining-addr");
		log.info("tainingAddrCtrl.list: {},", mo);
		return svc.list(mo);
	}

	/**
	 * 获取单个训练场信息
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@GetMapping("/suc/taining-addr/get-by-id")
	SucTainingAddrMo getById(@RequestParam("id") final java.lang.Long id) {
		log.info("received get:/suc/taining-addr/get-by-id");
		log.info("tainingAddrCtrl.getById: {}", id);
		return svc.getById(id);
	}
}
