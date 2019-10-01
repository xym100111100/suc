package rebue.suc.Ro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class UserDriverRo {

	private Long id;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 用户名字(微信昵称)
	 */
	private String userName;
	
	/**
	 * 用户头像
	 */
	private String userFace;

	/**
	 * 评论
	 */
	private String comment;

	/**
	 * 评分
	 */
	private Integer rate;
}
