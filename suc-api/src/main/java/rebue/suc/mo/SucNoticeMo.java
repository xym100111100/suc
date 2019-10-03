package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
用户需求公告

数据库表: SUC_NOTICE

@mbg.generated 自动生成的注释，如需修改本注释，请删除本行
*/
@JsonInclude(Include.NON_NULL)
public class SucNoticeMo implements Serializable {
    /**
    公告ID
    
    数据库字段: SUC_NOTICE.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long id;

    /**
    用户ID
    
    数据库字段: SUC_NOTICE.USER_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long userId;

    /**
    公告内容
    
    数据库字段: SUC_NOTICE.NOTICE_CONTENT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String noticeContent;

    /**
    自动下线时间
    
    数据库字段: SUC_NOTICE.AUTO_DOWN_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date autoDownTime;

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
    公告ID
    
    数据库字段: SUC_NOTICE.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getId() {
        return id;
    }

    /**
    公告ID
    
    数据库字段: SUC_NOTICE.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    用户ID
    
    数据库字段: SUC_NOTICE.USER_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getUserId() {
        return userId;
    }

    /**
    用户ID
    
    数据库字段: SUC_NOTICE.USER_ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
    公告内容
    
    数据库字段: SUC_NOTICE.NOTICE_CONTENT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
    公告内容
    
    数据库字段: SUC_NOTICE.NOTICE_CONTENT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    /**
    自动下线时间
    
    数据库字段: SUC_NOTICE.AUTO_DOWN_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Date getAutoDownTime() {
        return autoDownTime;
    }

    /**
    自动下线时间
    
    数据库字段: SUC_NOTICE.AUTO_DOWN_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setAutoDownTime(Date autoDownTime) {
        this.autoDownTime = autoDownTime;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", noticeContent=").append(noticeContent);
        sb.append(", autoDownTime=").append(autoDownTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SucNoticeMo other = (SucNoticeMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}