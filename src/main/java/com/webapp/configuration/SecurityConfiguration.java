package com.webapp.configuration;

import com.webapp.TodoApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.getEnvironment().setActiveProfiles("development");
    context.register(TodoApplication.class);
    System.out.println(context.getEnvironment().getActiveProfiles()[0] +"\n");

    httpSecurity.csrf().disable();
    httpSecurity.authorizeRequests().antMatchers("/").permitAll();
  }

}
