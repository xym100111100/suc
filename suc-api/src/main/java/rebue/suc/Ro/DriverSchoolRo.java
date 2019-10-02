package rebue.suc.Ro;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import rebue.suc.mo.SucDriverSchoolMo;
import rebue.suc.mo.SucTainingAddrMo;

@JsonInclude(Include.NON_NULL)
@Data
public class DriverSchoolRo {
	
	private  SucDriverSchoolMo  sucDriverSchoolMo;
	
	private List<SucTainingAddrMo> sucTainingAddrList;

}
