package com.webapp.controllers;

import com.webapp.models.UserModel;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
  private static final String PATH = "/";
  private static final String VIEW = "index";

  @RequestMapping(value=PATH)
  public String index(Model model){

    UserModel user = new UserModel(1, "Joe");

    model.addAttribute("user", user);
    model.addAttribute("title", "Home");
    model.addAttribute("message", "Sup User");

    return VIEW;
  }

  public String getPath(){ return PATH; }
  public String getView(){ return VIEW; }

}
