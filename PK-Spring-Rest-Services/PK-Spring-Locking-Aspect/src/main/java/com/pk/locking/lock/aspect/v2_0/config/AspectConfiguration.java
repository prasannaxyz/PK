package com.pk.locking.lock.aspect.v2_0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pk.locking.lock.aspect.v2_0.aspect.CrewProLockingAspect;

/*
 * https://stackoverflow.com/questions/42606002/spring-boot-spring-security-componentscan-or-import
*/
@Configuration
public class AspectConfiguration {

	@Bean(name = "com.pk.locking.lock.aspect.v2_0.config.crewProLockingAspect")
	public CrewProLockingAspect crewProLockingAspect() {
		return new CrewProLockingAspect();
	}

}
