package dev.passingarguments.devtoolsdemo.controllers;

import dev.passingarguments.devtoolsdemo.services.DateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final DateService dateService;

    public ViewController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping("/")
    public String main(Model model) {
        String currentDate = dateService.getDate();
        model.addAttribute("currentDate", currentDate);

        return "main";
    }

}