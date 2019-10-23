package rebue.suc.Ro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class SucNoticeRo {
	
    private Long id;
    
    private Long userId;
    
    private String userName;
    
    private String wxFacePath;
    
    private String noticeContent;
    
    private String schoolName;
}
