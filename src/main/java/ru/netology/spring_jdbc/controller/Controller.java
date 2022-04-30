package ru.netology.spring_jdbc.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.spring_jdbc.service.Service;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public List<String> getProduct(@RequestParam("name") String name) {
        return service.getProducts(name);
    }
}
