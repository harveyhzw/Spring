package com.quickstartdemo.web;

import com.quickstartdemo.web.config.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Book book;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/book")
    public Book book(){
        return book;
    }
}
