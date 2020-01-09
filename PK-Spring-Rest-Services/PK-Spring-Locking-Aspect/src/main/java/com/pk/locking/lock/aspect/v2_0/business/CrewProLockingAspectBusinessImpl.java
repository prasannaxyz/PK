package com.pk.locking.lock.aspect.v2_0.business;

import org.springframework.stereotype.Service;

import com.pk.locking.lock.aspect.v2_0.config.CrewProLock;
import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockActionAware;

@Service("com.pk.locking.lock.aspect.v2_0.business.crewProLockingAspectBusiness")
public class CrewProLockingAspectBusinessImpl implements CrewProLockingAspectBusiness {

	public void doLock(CrewProLock crewProLock, CrewProLockActionAware retVal) {

	}
}
