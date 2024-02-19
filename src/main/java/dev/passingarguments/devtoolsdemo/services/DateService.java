package dev.passingarguments.devtoolsdemo.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateService {

    public String getDate() {
        return LocalDateTime.now().toLocalDate().toString();
    }

}