package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.catsgram.service.ManualJdbcConnectService;

import java.util.Optional;

@RestController
public class SimpleController {
    private final ManualJdbcConnectService manualJdbcConnectService;

    public SimpleController(ManualJdbcConnectService manualJdbcConnectService) {
        this.manualJdbcConnectService = manualJdbcConnectService;
    }

    @GetMapping("/home")
    public String homePage() {
        return "Котограм";
    }
}