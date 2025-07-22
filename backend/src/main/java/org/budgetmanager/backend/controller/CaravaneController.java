package org.budgetmanager.backend.controller;

import org.budgetmanager.backend.model.Caravane;
import org.budgetmanager.backend.service.CaravaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/caravanes")
public class CaravaneController {
    @Autowired
    private CaravaneService service;

    @GetMapping
    public List<Caravane> getAll() {
        return (List<Caravane>) service.findAll(); }

    @GetMapping("/{id}")
    public Caravane getById(@PathVariable Long id) {
        return service.findById(id); }

    @PostMapping
    public Caravane create(@RequestBody Caravane c) {
        return service.save(c); }

    @PutMapping("/{id}")
    public Caravane update(@PathVariable Long id, @RequestBody Caravane c) {
        c.setId(id);
        return service.save(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id); }
}

