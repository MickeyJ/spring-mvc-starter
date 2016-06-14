package com.webapp.controllers

import spock.lang.Specification


class CustomErrorControllerTest extends Specification {
  CustomErrorController error = new CustomErrorController()

  def "getErrorPath => /error"() {
    expect: error.getErrorPath() == "/error"
  }

  def "getErrorView => error"() {
    expect: error.getErrorView() == "error"
  }
}
