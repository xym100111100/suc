package rebue.suc.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 数据库表: SUC_USER_DRIVER
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class SucUserDriverMo implements Serializable {

    /**
     *    用户驾校ID
     *
     *    数据库字段: SUC_USER_DRIVER.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    用户ID
     *
     *    数据库字段: SUC_USER_DRIVER.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long userId;

    /**
     *    状态(0：已作废 1:已报名 2：已签协议 3：已验证确实是报名已拿证学员4：已经完成：)
     *
     *    数据库字段: SUC_USER_DRIVER.STATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Byte state;

    /**
     *    驾校训练场ID
     *
     *    数据库字段: SUC_USER_DRIVER.TAINING_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long tainingId;

    /**
     *    驾校报名时间
     *
     *    数据库字段: SUC_USER_DRIVER.SIGNUP_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date signupTime;

    /**
     *    作废时间
     *
     *    数据库字段: SUC_USER_DRIVER.CANCEL_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date cancelTime;

    /**
     *    签约时间
     *
     *    数据库字段: SUC_USER_DRIVER.SIGNING_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date signingTime;

    /**
     *    完成时间
     *
     *    数据库字段: SUC_USER_DRIVER.FINISH_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date finishTime;

    /**
     *    作废原因
     *
     *    数据库字段: SUC_USER_DRIVER.CANCEL_REASON
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String cancelReason;

    /**
     *    评论
     *
     *    数据库字段: SUC_USER_DRIVER.COMMENT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String comment;

    /**
     *    评分
     *
     *    数据库字段: SUC_USER_DRIVER.RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long rate;

    /**
     *    推荐人（一般来说应该是驾校的全职人/兼职人/我们承诺人）
     *
     *    数据库字段: SUC_USER_DRIVER.RECOMMENDER
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String recommender;

    /**
     *    用户名字(不是suc中的微信名称，是用户在报名的时候填写的姓名)
     *
     *    数据库字段: SUC_USER_DRIVER.USER_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String userName;

    /**
     *    手机号码
     *
     *    数据库字段: SUC_USER_DRIVER.MOBILE_PHONE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long mobilePhone;

    /**
     *    合约图片路径
     *
     *    数据库字段: SUC_USER_DRIVER.CONTRACT_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String contractPath;

    /**
     *    驾校ID
     *
     *    数据库字段: SUC_USER_DRIVER.DRIVER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long driverId;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    用户驾校ID
     *
     *    数据库字段: SUC_USER_DRIVER.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    用户驾校ID
     *
     *    数据库字段: SUC_USER_DRIVER.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    用户ID
     *
     *    数据库字段: SUC_USER_DRIVER.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *    用户ID
     *
     *    数据库字段: SUC_USER_DRIVER.USER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *    状态(0：已作废 1:已报名 2：已签协议 3：已验证确实是报名已拿证学员4：已经完成：)
     *
     *    数据库字段: SUC_USER_DRIVER.STATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getState() {
        return state;
    }

    /**
     *    状态(0：已作废 1:已报名 2：已签协议 3：已验证确实是报名已拿证学员4：已经完成：)
     *
     *    数据库字段: SUC_USER_DRIVER.STATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     *    驾校训练场ID
     *
     *    数据库字段: SUC_USER_DRIVER.TAINING_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getTainingId() {
        return tainingId;
    }

    /**
     *    驾校训练场ID
     *
     *    数据库字段: SUC_USER_DRIVER.TAINING_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setTainingId(Long tainingId) {
        this.tainingId = tainingId;
    }

    /**
     *    驾校报名时间
     *
     *    数据库字段: SUC_USER_DRIVER.SIGNUP_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getSignupTime() {
        return signupTime;
    }

    /**
     *    驾校报名时间
     *
     *    数据库字段: SUC_USER_DRIVER.SIGNUP_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSignupTime(Date signupTime) {
        this.signupTime = signupTime;
    }

    /**
     *    作废时间
     *
     *    数据库字段: SUC_USER_DRIVER.CANCEL_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     *    作废时间
     *
     *    数据库字段: SUC_USER_DRIVER.CANCEL_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     *    签约时间
     *
     *    数据库字段: SUC_USER_DRIVER.SIGNING_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getSigningTime() {
        return signingTime;
    }

    /**
     *    签约时间
     *
     *    数据库字段: SUC_USER_DRIVER.SIGNING_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSigningTime(Date signingTime) {
        this.signingTime = signingTime;
    }

    /**
     *    完成时间
     *
     *    数据库字段: SUC_USER_DRIVER.FINISH_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     *    完成时间
     *
     *    数据库字段: SUC_USER_DRIVER.FINISH_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     *    作废原因
     *
     *    数据库字段: SUC_USER_DRIVER.CANCEL_REASON
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     *    作废原因
     *
     *    数据库字段: SUC_USER_DRIVER.CANCEL_REASON
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     *    评论
     *
     *    数据库字段: SUC_USER_DRIVER.COMMENT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getComment() {
        return comment;
    }

    /**
     *    评论
     *
     *    数据库字段: SUC_USER_DRIVER.COMMENT
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *    评分
     *
     *    数据库字段: SUC_USER_DRIVER.RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getRate() {
        return rate;
    }

    /**
     *    评分
     *
     *    数据库字段: SUC_USER_DRIVER.RATE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRate(Long rate) {
        this.rate = rate;
    }

    /**
     *    推荐人（一般来说应该是驾校的全职人/兼职人/我们承诺人）
     *
     *    数据库字段: SUC_USER_DRIVER.RECOMMENDER
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRecommender() {
        return recommender;
    }

    /**
     *    推荐人（一般来说应该是驾校的全职人/兼职人/我们承诺人）
     *
     *    数据库字段: SUC_USER_DRIVER.RECOMMENDER
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRecommender(String recommender) {
        this.recommender = recommender;
    }

    /**
     *    用户名字(不是suc中的微信名称，是用户在报名的时候填写的姓名)
     *
     *    数据库字段: SUC_USER_DRIVER.USER_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getUserName() {
        return userName;
    }

    /**
     *    用户名字(不是suc中的微信名称，是用户在报名的时候填写的姓名)
     *
     *    数据库字段: SUC_USER_DRIVER.USER_NAME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *    手机号码
     *
     *    数据库字段: SUC_USER_DRIVER.MOBILE_PHONE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getMobilePhone() {
        return mobilePhone;
    }

    /**
     *    手机号码
     *
     *    数据库字段: SUC_USER_DRIVER.MOBILE_PHONE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setMobilePhone(Long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     *    合约图片路径
     *
     *    数据库字段: SUC_USER_DRIVER.CONTRACT_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getContractPath() {
        return contractPath;
    }

    /**
     *    合约图片路径
     *
     *    数据库字段: SUC_USER_DRIVER.CONTRACT_PATH
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setContractPath(String contractPath) {
        this.contractPath = contractPath;
    }

    /**
     *    驾校ID
     *
     *    数据库字段: SUC_USER_DRIVER.DRIVER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getDriverId() {
        return driverId;
    }

    /**
     *    驾校ID
     *
     *    数据库字段: SUC_USER_DRIVER.DRIVER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", state=").append(state);
        sb.append(", tainingId=").append(tainingId);
        sb.append(", signupTime=").append(signupTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", signingTime=").append(signingTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", comment=").append(comment);
        sb.append(", rate=").append(rate);
        sb.append(", recommender=").append(recommender);
        sb.append(", userName=").append(userName);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", contractPath=").append(contractPath);
        sb.append(", driverId=").append(driverId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
        SucUserDriverMo other = (SucUserDriverMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}
