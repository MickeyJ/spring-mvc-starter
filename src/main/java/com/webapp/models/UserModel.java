package com.webapp.models;

public class UserModel {

  private final long id;
  private final String firstName;

  public UserModel(long id, String firstName) {
    this.id = id;
    this.firstName = firstName;
  }

  public long getId() { return id; }

  public String getUserName() { return firstName; }

}
