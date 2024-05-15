package org.example.gestion_restaurant.controllers;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.OwnerService;
import org.example.gestion_restaurant.entities.Owner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    @RequestMapping("/createOwner")
    public String createOwner(ModelMap model) {
        model.addAttribute("owner", new Owner());
        return "/CreateOwner";
    }

    @RequestMapping("/saveOwner")
    public String saveOwner(@ModelAttribute("owner") Owner owner) {
        Owner savedOwner = ownerService.saveOwner(owner);
        return "/CreateOwner";
    }
    @RequestMapping("/ownersList")
    public String ownersList(ModelMap model) {
        List<Owner> owners = ownerService.getAllOwners();
        model.addAttribute("owners", owners);
        return "OwnersList";
    }
}
