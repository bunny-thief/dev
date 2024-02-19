package dev.passingarguments.devtoolsdemo.controllers;

import dev.passingarguments.devtoolsdemo.services.DateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DateController {

    private final DateService dateService;

    public DateController(DateService timeService) {
        this.dateService = timeService;
    }

    @GetMapping("/date")
    public String getDate() {
        return dateService.getDate();
    }

}