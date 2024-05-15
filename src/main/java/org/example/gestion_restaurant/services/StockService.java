package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StockService {
    Stock saveStock(Stock stock);

    Stock updateStock(Stock stock);

    void deleteStockById(Long id);

    void deleteAllStocks();

    Optional<Stock> getStockById(Long id);

    List<Stock> getAllStocks();
}
