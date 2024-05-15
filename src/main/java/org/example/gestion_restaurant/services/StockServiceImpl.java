package org.example.gestion_restaurant.services;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.entities.Stock;
import org.example.gestion_restaurant.repositories.ClientRepository;
import org.example.gestion_restaurant.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StockServiceImpl implements StockService{
    @Autowired
    private StockRepository stockRepository;
    @Override
    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public void deleteStockById(Long id) {
        stockRepository.deleteById(id);
    }

    @Override
    public void deleteAllStocks() {
        stockRepository.deleteAll();
    }

    @Override
    public Optional<Stock> getStockById(Long id) {
        return stockRepository.findById(id);
    }

    @Override
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
}
