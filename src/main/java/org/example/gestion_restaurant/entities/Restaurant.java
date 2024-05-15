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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private String numeroTelephone;
    @ManyToOne
    private Owner owner;
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<Employee> employees = new ArrayList<>();
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<Stock> stocks = new ArrayList<>();
    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private List<Menu> menus = new ArrayList<>();
}
