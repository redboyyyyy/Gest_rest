package org.example.gestion_restaurant.services;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.entities.Tablee;
import org.example.gestion_restaurant.repositories.TableeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TableeServiceImpl implements TableeService{
    @Autowired
    private TableeRepository tableeRepository;
    @Override
    public Tablee saveTablee(Tablee tablee) {
        return tableeRepository.save(tablee);
    }

    @Override
    public Tablee updateTablee(Tablee tablee) {
        return tableeRepository.save(tablee);
    }

    @Override
    public void deleteTableeById(Long id) {
        tableeRepository.deleteById(id);
    }

    @Override
    public void deleteAllTablees() {
        tableeRepository.deleteAll();
    }

    @Override
    public Optional<Tablee> getTableeById(Long id) {
        return tableeRepository.findById(id);
    }

    @Override
    public List<Tablee> getAllTablees() {
        return tableeRepository.findAll();
    }
}
