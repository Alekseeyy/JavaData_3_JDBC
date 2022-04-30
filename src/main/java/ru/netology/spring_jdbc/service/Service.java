package ru.netology.spring_jdbc.service;

import ru.netology.spring_jdbc.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}
