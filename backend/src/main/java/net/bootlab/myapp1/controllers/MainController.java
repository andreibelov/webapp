package net.bootlab.myapp1.controllers;

import java.util.Map;
import org.joda.time.DateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final String MESSAGE = "Welcome to " + "our super coolest website everrrr!\n";

    @GetMapping("/api/v2/welcome2")
    public String root(Map<String, Object> model) {

        return MESSAGE +"</br>"+ DateTime.now().toString();
    }

}
