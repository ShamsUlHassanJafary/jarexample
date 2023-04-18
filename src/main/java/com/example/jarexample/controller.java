package com.example.jarexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("display")
    public void display() {
        System.out.println("Shams");
    }

    @GetMapping("display1/{name}")
    public String display1(@PathVariable String name) {

        return name;
    }


    @GetMapping("abc/{abc}")
    public String addNewMethod(@PathVariable String abc) {
        return "shams UL Hassan Jafary " + abc;

    @GetMapping("xyz/{xyz}")
    public String xyz(@PathVariable String xyz) {
        return "Hassan" + xyz;

    }
}
