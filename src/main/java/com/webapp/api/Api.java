package com.webapp.api;

public class Api {

  private final long id;
  private final String firstName;

  public Api(long id, String firstName) {
    this.id = id;
    this.firstName = firstName;
  }

  public long getId() {
    return id;
  }

  public String getUserName() {
    return firstName;
  }

}
