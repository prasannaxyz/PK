package com.pk.locking.lock.aspect.v2_0.autoconfigure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.pk.locking.lock.aspect.v2_0.business.AppCommonLockingAspectBusinessPackageMarker;
import com.pk.locking.lock.aspect.v2_0.config.AspectConfiguration;

@ComponentScan(basePackageClasses ={
		AppCommonLockingAspectBusinessPackageMarker.class
})
@Import({
	AspectConfiguration.class
})
@Configuration
@EnableAspectJAutoProxy
public class LockingUtilConfiguration {

}
