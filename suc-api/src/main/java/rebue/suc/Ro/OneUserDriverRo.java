package rebue.suc.Ro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * 
 * @author xym
 *
 */
@JsonInclude(Include.NON_NULL)
@Data
public class OneUserDriverRo {

	private Long id;
	
    private Long tainingId;
    
	private String tainingName;

	private Byte state;

	private String userName;
	
    private Long mobilePhone;
    
    private String recommender;
    
    private Long rate;
    
    private String comment;
    
    private String contractPath;

}
