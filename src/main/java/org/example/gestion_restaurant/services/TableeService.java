package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Tablee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TableeService {
    Tablee saveTablee(Tablee tablee);

    Tablee updateTablee(Tablee tablee);

    void deleteTableeById(Long id);

    void deleteAllTablees();

    Optional<Tablee> getTableeById(Long id);

    List<Tablee> getAllTablees();
}
