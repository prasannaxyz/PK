package com.pk.locking.lock.aspect.v2_0.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * Per recommendation {@link ComponentScan#basePackageClasses()} defining this
 * marker interface to allow for the entire package to be for spring beans.
 * 
 */
public interface AppCommonLockingAspectConfigPackageMarker {
	/**
	   * No methods this is just a marker interface
	*/
}
