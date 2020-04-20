package com.bigtree.spending.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpendingController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Spending";
    }

}