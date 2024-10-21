package ua.edu.ucu.apps.lab7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import ua.edu.ucu.apps.lab7.store.Flower;
import ua.edu.ucu.apps.lab7.store.FlowerColor;
import ua.edu.ucu.apps.lab7.store.FlowerType;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {
    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(0, FlowerColor.RED,
            10, FlowerType.CHAMOMILE)
        );
    }
}