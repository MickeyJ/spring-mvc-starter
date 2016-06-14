package com.webapp.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

  @RequestMapping("/about")
  public String about(Model model){

    model.addAttribute("array", makeArray(20));
    model.addAttribute("title", "About");

    return "about";
  }

  public int[] makeArray(int count){
    int[] array = new int[count];
    for(int i = 0; i < count; i++){
      array[i] = i + 1;
    }
    return array;
  }

}