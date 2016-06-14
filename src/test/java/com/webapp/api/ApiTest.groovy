package com.webapp.api

import spock.lang.Specification

class ApiTest extends Specification {

  def "GetId"() {

    expect: new Api(2, "Joe").id == 2

  }

  def "GetUser"() {

    expect: new Api(1, "Bob").userName == "Bob"

  }

}
