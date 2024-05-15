package org.example.gestion_restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomProduit;
    private int quantiteStock;
    private Double prixUnitaire;
    private String dateExpiration;
    @ManyToOne
    private Restaurant restaurant;
}
