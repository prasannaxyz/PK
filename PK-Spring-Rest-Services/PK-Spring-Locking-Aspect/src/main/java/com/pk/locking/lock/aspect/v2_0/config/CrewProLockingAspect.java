package com.pk.locking.lock.aspect.v2_0.config;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockActionAware;

@Aspect
public class CrewProLockingAspect {

	@Pointcut("execution(public * *(..))")
	public void anyPublicMethod() {
		// creating an empty method with @Pointcut annotation and then using it
		// as expression in advice.
	}

	@AfterReturning(value = "anyPublicMethod() && @annotation(crewProLock)", returning = "retVal")
	public void doLock(CrewProLock crewProLock, CrewProLockActionAware retVal) {
		System.out.println("Executing locking Aspect");
		System.out.println(retVal.getLockingRecords().get(0).getSessionId());
	}

}
