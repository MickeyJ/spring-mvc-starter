package com.webapp.controllers

import spock.lang.Specification

class AboutControllerTest extends Specification {
  AboutController about = new AboutController();

  def "getPath => /about"() {
    expect: about.getPath() == "/about"
  }

  def "getView => about"() {
    expect: about.getView() == "about"
  }
}
