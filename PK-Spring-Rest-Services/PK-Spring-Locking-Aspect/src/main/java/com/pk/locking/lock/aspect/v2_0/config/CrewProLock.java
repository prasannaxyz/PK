package com.pk.locking.lock.aspect.v2_0.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockAction;
import com.pk.locking.lock.aspect.v2_0.vo.CrewProLockType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CrewProLock {
	
	CrewProLockAction action();
	
	CrewProLockType type();
	
	boolean readOnly() default false;

}
