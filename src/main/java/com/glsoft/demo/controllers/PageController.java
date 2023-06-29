package com.glsoft.demo.controllers;
import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PageController {

    // view index page
    @GetMapping(path = "/")
    public String index(Model model) {
        return "index";
    }

    // welcome page
    @GetMapping(path = "/welcome/{name}")
    public String welcome(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }

    // view about page
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }
}
