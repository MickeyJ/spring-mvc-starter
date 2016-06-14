package com.webapp.controllers

import spock.lang.Specification

class IndexControllerTest extends Specification {
  IndexController index = new IndexController();

  def "getPath => /"() {
    expect: index.getPath() == "/"
  }

  def "getView => index"() {
    expect: index.getView() == "index"
  }
}
