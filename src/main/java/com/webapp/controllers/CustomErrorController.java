package com.webapp.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {
  private static final String PATH = "/error";
  private static final String VIEW = "error";

  @RequestMapping(value=PATH)
  public String error() {
    return VIEW;
  }

  @Override
  public String getErrorPath() { return PATH; }
  public String getErrorView() {
    return VIEW;
  }
}
