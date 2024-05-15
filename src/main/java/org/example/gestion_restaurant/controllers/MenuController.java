package org.example.gestion_restaurant.controllers;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.MenuService;
import org.example.gestion_restaurant.services.RestaurantService;
import org.example.gestion_restaurant.entities.Menu;
import org.example.gestion_restaurant.entities.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MenuController {

    private final MenuService menuService;


    @RequestMapping("/createMenu")
    public String createMenu(ModelMap model) {
        model.addAttribute("menu", new Menu());

        return "CreateMenu";
    }

    @RequestMapping("/saveMenu")
    public String saveMenu(@ModelAttribute("menu") Menu menu) {
        Menu savedMenu = menuService.saveMenu(menu);
        return "CreateMenu";
    }
    @RequestMapping("/menusList")
    public String menusList(Model model) {
        List<Menu> menus = menuService.getAllMenus();
        model.addAttribute("menus", menus);
        return "MenusList";
    }

}
