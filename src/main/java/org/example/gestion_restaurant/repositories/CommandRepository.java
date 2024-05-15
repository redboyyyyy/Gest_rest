package org.example.gestion_restaurant.repositories;

import org.example.gestion_restaurant.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<Command,Long> {
}
