package org.PK.Spring.Rest.Services.Create.services;

import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.pk.locking.lock.aspect.v2_0.aspect.CrewProLock;
import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockAction;
import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockActionAware;
import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockType;
import com.pk.locking.lock.aspect.v2_0.vo.LockDetailsVO;
import com.pk.locking.lock.aspect.v2_0.vo.LockObject;

@Component
public class LockImplementationImpl implements LockImplementation {

	@CrewProLock(action = CrewProLockAction.INSERT, type = CrewProLockType.EMPLOYEE)
	public CrewProLockActionAware testAspect() {
		LockObject value = new LockObject();
		LockDetailsVO lock1 = new LockDetailsVO();
		lock1.setSessionId("Session1");
		LockDetailsVO lock2 = new LockDetailsVO();
		lock2.setSessionId("Session2");
		value.setLockingRecords(Lists.newArrayList(lock1, lock2));
		return value;
	}
}
