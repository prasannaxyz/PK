
package org.PK.Spring.Rest.Services.Update;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataAccessValue implements Serializable {

	private static final long serialVersionUID = 4071520814894151602L;

	private Long roleDataAccessValueOId;

	private Long roleDataAccessOId;

	private String dataAccessMappingValue;

	private Boolean readAccess = Boolean.FALSE;

	private Boolean createAccess = Boolean.FALSE;

	private Boolean updateAccess = Boolean.FALSE;

	private Boolean daleteAccess = Boolean.FALSE;

	public Long getRoleDataAccessValueOId() {
		return roleDataAccessValueOId;
	}

	public void setRoleDataAccessValueOId(Long roleDataAccessValueOId) {
		this.roleDataAccessValueOId = roleDataAccessValueOId;
	}

	public Long getRoleDataAccessOId() {
		return roleDataAccessOId;
	}

	public void setRoleDataAccessOId(Long roleDataAccessOId) {
		this.roleDataAccessOId = roleDataAccessOId;
	}


	public String getDataAccessMappingValue() {
		return dataAccessMappingValue;
	}

	public void setDataAccessMappingValue(String dataAccessMappingValue) {
		this.dataAccessMappingValue = dataAccessMappingValue;
	}

	public Boolean getReadAccess() {
		return readAccess;
	}

	public void setReadAccess(Boolean readAccess) {
		this.readAccess = readAccess;
	}

	public Boolean getCreateAccess() {
		return createAccess;
	}

	public void setCreateAccess(Boolean createAccess) {
		this.createAccess = createAccess;
	}

	public Boolean getUpdateAccess() {
		return updateAccess;
	}

	public void setUpdateAccess(Boolean updateAccess) {
		this.updateAccess = updateAccess;
	}

	public Boolean getDaleteAccess() {
		return daleteAccess;
	}

	public void setDaleteAccess(Boolean daleteAccess) {
		this.daleteAccess = daleteAccess;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (!(other instanceof DataAccessValue)) {
			return false;
		}
		DataAccessValue otherObject = ((DataAccessValue) other);
		return new EqualsBuilder().append(this.getRoleDataAccessValueOId(), otherObject.getRoleDataAccessValueOId())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(CommonConstants.HASH_CODE_INITIAL_ODD_NUMBER,
				CommonConstants.HASH_CODE_MULTIPLIER).append(this.getRoleDataAccessValueOId()).build();
	}

}
