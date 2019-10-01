package rebue.suc.Ro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import rebue.suc.mo.SucUserMo;

@JsonInclude(Include.NON_NULL)
@Data
public class UserLoginRo {
 
	private boolean isNewUser; 

	private String  msg;

	private byte result;

	private SucUserMo sucUserMo;

}
