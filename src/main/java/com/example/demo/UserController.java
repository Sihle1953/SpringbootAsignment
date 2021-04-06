package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping({"/", "/welcome"})
    public String welcome(@RequestParam(value = "Name",
            defaultValue = "Sihle") String name, Model model) {
        model.addAttribute("Name", name);
        return "welcome";

    }
}





