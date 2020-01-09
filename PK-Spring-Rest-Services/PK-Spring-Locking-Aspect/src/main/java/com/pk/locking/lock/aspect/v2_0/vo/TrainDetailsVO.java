package com.pk.locking.lock.aspect.v2_0.vo;

import java.io.Serializable;
import java.util.Date;

public class TrainDetailsVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String trainSymbol;
	
	private Date ondutyDateTime;

	public String getTrainSymbol() {
		return trainSymbol;
	}

	public void setTrainSymbol(String trainSymbol) {
		this.trainSymbol = trainSymbol;
	}

	public Date getOndutyDateTime() {
		return ondutyDateTime;
	}

	public void setOndutyDateTime(Date ondutyDateTime) {
		this.ondutyDateTime = ondutyDateTime;
	}
	
	

	
}
