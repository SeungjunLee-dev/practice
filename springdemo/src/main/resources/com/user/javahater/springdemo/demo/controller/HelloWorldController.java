package com.user.javahater.springdemo.demo.controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller; import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMappin g;
import
com.user.wongi5.springdemo.demo.model.HelloWorld;
@Controller
public class HelloWorldController { @RequestMapping("/helloworld")
public String handler(Model model) {
HelloWorld helloWorld = new
HelloWorld();
helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
helloWorld.setDateTime(LocalDateTime.now().toSt ring());
helloWorld);
       }
}
model.addAttribute("helloWorld", return "helloworld";