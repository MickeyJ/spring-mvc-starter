package com.webapp.api;

import com.webapp.models.UserModel;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ApiUserController {
  private static UserModel[] userList = new UserModel[10];
  private static final String template = "%s";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/api/user", method = RequestMethod.POST)
  public Object[] postUser(@RequestParam(value="name", defaultValue="Bob") String name) {

    int count = (int) counter.incrementAndGet();

    userList[count - 1] = new UserModel(count, String.format(template, name));

    return userList;
  }

  @RequestMapping(value = "/api/user", method = RequestMethod.GET)
  public Object[] getUser() {

    return userList;
  }

}
