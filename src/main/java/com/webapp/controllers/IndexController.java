package com.webapp.controllers;

import com.webapp.api.Api;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping("/")
  public String index(Model model){

    Api api = new Api(1, "Joe");

    model.addAttribute("title", "Home");
    model.addAttribute("user", api);
    model.addAttribute("message", "Sup");

    return "index";
  }

}
