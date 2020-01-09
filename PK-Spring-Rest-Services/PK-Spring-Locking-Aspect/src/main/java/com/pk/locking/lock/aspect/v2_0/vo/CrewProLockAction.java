package com.pk.locking.lock.aspect.v2_0.vo;

public enum CrewProLockAction {
  INSERT("Create"),
  UPDATE("Update"),
  DELETE("Delete");
  
  private String value;

  CrewProLockAction(final String value) {
    this.value = value;
  }

  public String value() {
    return this.value;
  }
}
