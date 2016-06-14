package com.webapp.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

  @RequestMapping("/about")
  public String about(Model model){
    int[] array = {1,2,3,4,5};

    model.addAttribute("title", "About");
    model.addAttribute("array", array);

    return "about";
  }

}