package org.example.gestion_restaurant.controllers;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.StockService;
import org.example.gestion_restaurant.services.RestaurantService;
import org.example.gestion_restaurant.entities.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class StockController {

    private final StockService stockService;
    private final RestaurantService restaurantService;

    @RequestMapping("/createStock")
    public String createStock(ModelMap model) {
        model.addAttribute("stock", new Stock());
        model.addAttribute("restaurants", restaurantService.getAllRestaurants());
        return "CreateStock";
    }

    @RequestMapping("/saveStock")
    public String saveStock(@ModelAttribute("stock") Stock stock) {
        Stock savedStock = stockService.saveStock(stock);
        return "CreateStock";
    }
    @RequestMapping("/stockList")
    public String getStocks(ModelMap model) {
        List<Stock> stocks = stockService.getAllStocks();
        model.addAttribute("stocks", stocks);
        return "StockList";
    }
}
