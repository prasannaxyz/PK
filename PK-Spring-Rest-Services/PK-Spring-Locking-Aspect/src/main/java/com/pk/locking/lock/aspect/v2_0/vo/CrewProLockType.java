package com.pk.locking.lock.aspect.v2_0.vo;

public enum CrewProLockType {

	TRAIN("Train"), EMPLOYEE("Employee"), BID_GROUP("Bid Group");

	private String value;

	CrewProLockType(final String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

}
