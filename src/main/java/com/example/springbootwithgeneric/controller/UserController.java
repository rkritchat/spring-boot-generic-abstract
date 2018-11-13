package com.example.springbootwithgeneric.controller;

import com.example.springbootwithgeneric.task.UserTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserTask userTask;

    @GetMapping
    public void test() throws InstantiationException, IllegalAccessException {
        userTask.execute();
    }
}
