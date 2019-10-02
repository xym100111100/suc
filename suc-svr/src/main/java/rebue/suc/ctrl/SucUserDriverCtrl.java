package rebue.suc.ctrl;

import com.github.dozermapper.core.Mapper;
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
import rebue.suc.Ro.OneUserDriverRo;
import rebue.suc.Ro.UserDriverRo;
import rebue.suc.mo.SucTainingAddrMo;
import rebue.suc.mo.SucUserDriverMo;
import rebue.suc.svc.SucTainingAddrSvc;
import rebue.suc.svc.SucUserDriverSvc;

/**
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
@Slf4j
public class SucUserDriverCtrl {

	/**
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@Resource
	private SucUserDriverSvc svc;

	@Resource
	private SucTainingAddrSvc sucTainingAddrSvc;
	@Resource
	private Mapper dozerMapper;

	/**
	 * 添加
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PostMapping("/suc/user-driver")
	IdRo add(@RequestBody final SucUserDriverMo mo) throws Exception {
		log.info("received post:/suc/user-driver");
		log.info("userDriverCtrl.add: {}", mo);
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
	 * 修改
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@PutMapping("/suc/user-driver")
	Ro modify(@RequestBody final SucUserDriverMo mo) throws Exception {
		log.info("received put:/suc/user-driver");
		log.info("userDriverCtrl.modify: {}", mo);
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
	@DeleteMapping("/suc/user-driver")
	Ro del(@RequestParam("id") final java.lang.Long id) {
		log.info("received delete:/suc/user-driver");
		log.info("userDriverCtrl.del: {}", id);
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
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@GetMapping("/suc/user-driver")
	PageInfo<UserDriverRo> listUserComment(final SucUserDriverMo mo,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		log.info("received get:/suc/user-driver");
		log.info("userDriverCtrl.list: {},pageNum-{},pageSize-{}", mo, pageNum, pageSize);
		if (pageNum == null) {
			pageNum = 1;
		}
		if (pageSize == null) {
			pageSize = 5;
		}
		log.info("list SucUserDriverMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
		if (pageSize > 50) {
			final String msg = "pageSize不能大于50";
			log.error(msg);
			throw new IllegalArgumentException(msg);
		}
		final PageInfo<UserDriverRo> result = svc.listUserComment(mo, pageNum, pageSize);
		log.info("result: " + result);
		return result;
	}

	/**
	 * 获取单个
	 *
	 * @mbg.generated 自动生成，如需修改，请删除本行
	 */
	@GetMapping("/suc/user-driver/get-by-id")
	SucUserDriverMo getById(@RequestParam("id") final java.lang.Long id) {
		log.info("received get:/suc/user-driver/get-by-id");
		log.info("userDriverCtrl.getById: {}", id);
		return svc.getById(id);
	}

	/**
	 * 获取一个学生驾校信息
	 *
	 */
	@GetMapping("/suc/user-driver/get-one")
	OneUserDriverRo getOne(final SucUserDriverMo mo) {
		log.info("获取一个学生驾校信息.get-one: {}", mo);
		SucUserDriverMo userDriverResult = svc.getOne(mo);
		log.info("获取一个学生驾校结果-: {}", userDriverResult);
		if (userDriverResult != null) {
			SucTainingAddrMo tainingResult = sucTainingAddrSvc.getById(userDriverResult.getTainingId());
			OneUserDriverRo result = dozerMapper.map(userDriverResult, OneUserDriverRo.class);
			result.setTainingName(tainingResult.getTrainingAddr());
			log.info("获取一个学生驾校即将返回的结果-: {}", result);
			return result;
		} else {
			return new OneUserDriverRo();
		}

	}
}
