package com.pk.locking.lock.aspect.v2_0.autoconfigure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.pk.locking.lock.aspect.v2_0.business.AppCommonLockingAspectBusinessPackageMarker;
import com.pk.locking.lock.aspect.v2_0.config.AppCommonLockingAspectConfigPackageMarker;

@ComponentScan(basePackageClasses ={
		AppCommonLockingAspectConfigPackageMarker.class,
		AppCommonLockingAspectBusinessPackageMarker.class
})
@Configuration
@EnableAspectJAutoProxy
public class LockingUtilConfiguration {

}
