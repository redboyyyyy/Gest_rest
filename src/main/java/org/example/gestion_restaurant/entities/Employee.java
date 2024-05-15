package org.example.gestion_restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String poste;
    private Double salaire;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Command> commands = new ArrayList<>();
    @ManyToOne
    private Restaurant restaurant;
}
