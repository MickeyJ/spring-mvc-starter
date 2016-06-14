package com.webapp.api;

import com.webapp.models.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ApiController {

  private static final String template = "%s";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/api/user", method = RequestMethod.POST)
  public UserModel api(@RequestParam(value="name", defaultValue="Bob") String name) {
    return new UserModel(
        counter.incrementAndGet(),
        String.format(template, name)
    );
  }

}
