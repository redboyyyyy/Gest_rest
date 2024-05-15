package org.example.gestion_restaurant.repositories;

import org.example.gestion_restaurant.entities.Tablee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableeRepository extends JpaRepository<Tablee,Long> {
}
