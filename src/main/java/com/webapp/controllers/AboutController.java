package com.webapp.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
  private static final String PATH = "/about";
  private static final String VIEW = "about";

  @RequestMapping(value=PATH)
  public String about(Model model){

    model.addAttribute("array", makeArray(16));
    model.addAttribute("title", "About");

    return VIEW;
  }

  public int[] makeArray(int count){
    int[] array = new int[count];
    for(int i = 0; i < count; i++) array[i] = i + 1;
    return array;
  }

  public String getPath(){ return PATH; }
  public String getView(){ return VIEW; }

}