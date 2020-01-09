package com.pk.locking.lock.aspect.v2_0.business;

import com.pk.locking.lock.aspect.v2_0.config.CrewProLock;
import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockActionAware;

public interface CrewProLockingAspectBusiness {
	
	void doLock(CrewProLock crewProLock, CrewProLockActionAware retVal);

}
