package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Owner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OwnerService {
    Owner saveOwner(Owner owner);

    Owner updateOwner(Owner owner);

    void deleteOwnerById(Long id);

    void deleteAllOwners();

    Optional<Owner> getOwnerById(Long id);

    List<Owner> getAllOwners();
}
