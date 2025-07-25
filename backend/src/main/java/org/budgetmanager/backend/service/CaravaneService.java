package org.budgetmanager.backend.service;

import org.budgetmanager.backend.model.Caravane;
import org.budgetmanager.backend.repository.CaravaneRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaravaneService {
    @Autowired
    private CaravaneRepository repo;

    public List<Caravane> findAll() { return (List<Caravane>) repo.findAll(); }

    public Caravane findById(Long id) { return repo.findById(id).orElse(null); }

    public Caravane save(Caravane c) { return repo.save(c); }

    public void delete(Long id) { repo.deleteById(id); }
}

