package org.example.gestion_restaurant.controllers;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.TableeService;
import org.example.gestion_restaurant.entities.Tablee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class TableeController {

    private final TableeService tableeService;

    @RequestMapping("/createTable")
    public String createTablee(ModelMap model) {
        model.addAttribute("tablee", new Tablee());
        return "CreateTable";
    }

    @RequestMapping("/saveTable")
    public String saveTable(@ModelAttribute("tablee") Tablee tablee) {
        Tablee savedTablee = tableeService.saveTablee(tablee);
        return "CreateTable";
    }
    @RequestMapping("/tablesList")
    public String tablesList(ModelMap model) {
        List<Tablee> tablees = tableeService.getAllTablees();
        model.addAttribute("tablees", tablees);
        return "TablesList";
    }
}
