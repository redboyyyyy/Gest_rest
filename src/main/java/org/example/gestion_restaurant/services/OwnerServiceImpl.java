package org.example.gestion_restaurant.services;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.entities.Owner;
import org.example.gestion_restaurant.repositories.ClientRepository;
import org.example.gestion_restaurant.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void deleteOwnerById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public void deleteAllOwners() {
        ownerRepository.deleteAll();
    }

    @Override
    public Optional<Owner> getOwnerById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }
}
