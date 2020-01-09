package com.pk.locking.lock.aspect.v2_0.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author bnagaraju
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LockDetailsVO
        implements Serializable {

    private static final long serialVersionUID = 1L;
    private UserDetailVO userDetail;
    private String sessionId;
    private Date lockDateTime;
    private EmployeeVO employee;
    private TrainDetailsVO trainDetails;
    private BidGroupVO bidGroup;

    
    
    public UserDetailVO getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetailVO userDetail) {
		this.userDetail = userDetail;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	public Date getLockDateTime() {
		return lockDateTime;
	}
	public void setLockDateTime(Date lockDateTime) {
		this.lockDateTime = lockDateTime;
	}
	public EmployeeVO getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeVO employee) {
		this.employee = employee;
	}
	
	public BidGroupVO getBidGroup() {
		return bidGroup;
	}
	public void setBidGroup(BidGroupVO bidGroup) {
		this.bidGroup = bidGroup;
	}
	public TrainDetailsVO getTrainDetails() {
		return trainDetails;
	}
	public void setTrainDetails(TrainDetailsVO trainDetails) {
		this.trainDetails = trainDetails;
	}
	
	
    
}
