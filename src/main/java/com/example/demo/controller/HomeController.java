package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "homeCtrl")
@ViewScoped
public class HomeController {

    @Getter
    @Setter
    private String firstName = "";

    @Getter
    @Setter
    private String lastName = "";

    public String showGreeting() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        return "Hello " + firstName + " " + lastName + " " + authentication.getName() + "!";
    }
}
