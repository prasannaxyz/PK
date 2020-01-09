package com.pk.locking.lock.aspect.v2_0.vo;

import java.io.Serializable;
import java.util.Date;

public class BidGroupVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String bulletinMasterId;
	
	private Date closeDateTime;

	public String getBulletinMasterId() {
		return bulletinMasterId;
	}

	public void setBulletinMasterId(String bulletinMasterId) {
		this.bulletinMasterId = bulletinMasterId;
	}

	public Date getCloseDateTime() {
		return closeDateTime;
	}

	public void setCloseDateTime(Date closeDateTime) {
		this.closeDateTime = closeDateTime;
	}

	
	
}
