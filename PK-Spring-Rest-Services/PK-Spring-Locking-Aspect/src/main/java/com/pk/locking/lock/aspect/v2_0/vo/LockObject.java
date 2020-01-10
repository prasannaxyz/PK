package com.pk.locking.lock.aspect.v2_0.vo;

import java.util.List;

public class LockObject implements CrewProLockActionAware {

	List<LockDetailsVO> lockingRecords;

	public void setLockingRecords(List<LockDetailsVO> lockingRecords) {
		this.lockingRecords = lockingRecords;
	}

	@Override
	public List<LockDetailsVO> getLockingRecords() {
		return lockingRecords;
	}

}
