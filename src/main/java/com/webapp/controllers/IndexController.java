package com.webapp.controllers;

import com.webapp.models.UserModel;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping("/")
  public String index(Model model){

    UserModel user = new UserModel(1, "Joe");

    model.addAttribute("user", user);
    model.addAttribute("title", "Home");
    model.addAttribute("message", "Sup");

    return "index";
  }

}
