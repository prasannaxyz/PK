package com.pk.locking.lock.aspect.v2_0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectConfiguration {
	
	@Bean(name="com.pk.locking.lock.aspect.v2_0.config.crewProLockingAspect")
	public CrewProLockingAspect crewProLockingAspect(){
		return new CrewProLockingAspect();
	}

}
