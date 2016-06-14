package com.webapp.models

import spock.lang.Specification

class UserModelTest extends Specification {

  def "GetId"() {
    expect: new UserModel(2, "Joe").id == 2
  }

  def "GetUser"() {
    expect: new UserModel(1, "Bob").userName == "Bob"
  }

}