
package com.pk.locking.lock.aspect.v2_0.vo;

import java.io.Serializable;

/**
 * @author bnagaraju
 *
 */
public class UserDetailVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
