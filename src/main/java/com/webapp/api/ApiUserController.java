package com.webapp.api;

import com.webapp.models.UserModel;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class ApiUserController {
  private static UserModel[] userList = new UserModel[10];
  private static final String template = "%s";
  private final AtomicInteger counter = new AtomicInteger();

  @RequestMapping(value = "/api/user", method = RequestMethod.POST)
  public UserModel postUser(@RequestParam(value="name", defaultValue="Bob") String name) {

    int count = counter.incrementAndGet();

    userList[count - 1] = new UserModel(count, String.format(template, name));

    return userList[count - 1];
  }

  @RequestMapping(value = "/api/user", method = RequestMethod.GET)
  public Object[] getUser() {

    return userList;
  }


}
