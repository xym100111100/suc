package rebue.suc.svr.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rebue.sbs.feign.FeignConfig;
import rebue.suc.mo.SucUserMo;

@FeignClient(name = "suc-svr", configuration = FeignConfig.class, contextId = "suc-svr-user")
public interface SucUserSvc {

	@GetMapping("/suc/user/get-by-id")
	SucUserMo getById(@RequestParam("id") final java.lang.Long id);
	
	
	@GetMapping("/suc/user/get-by-ids")
	List<SucUserMo> getByIds(@RequestParam("ids") final String ids);

}
