package org.example.gestion_restaurant.services;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.entities.Menu;
import org.example.gestion_restaurant.repositories.ClientRepository;
import org.example.gestion_restaurant.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuRepository menuRepository;
    @Override
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu updateMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void deleteMenuById(Long id) {
        menuRepository.deleteById(id);
    }

    @Override
    public void deleteAllMenus() {
        menuRepository.deleteAll();
    }

    @Override
    public Optional<Menu> getMenuById(Long id) {
        return menuRepository.findById(id);
    }

    @Override
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }
}
