package org.example.gestion_restaurant.services;

import org.example.gestion_restaurant.entities.Menu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MenuService {
    Menu saveMenu(Menu menu);

    Menu updateMenu(Menu menu);

    void deleteMenuById(Long id);

    void deleteAllMenus();

    Optional<Menu> getMenuById(Long id);

    List<Menu> getAllMenus();
}
