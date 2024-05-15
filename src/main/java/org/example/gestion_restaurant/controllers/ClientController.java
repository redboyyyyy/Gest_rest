package org.example.gestion_restaurant.controllers;


import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.ClientService;
import org.example.gestion_restaurant.entities.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @RequestMapping("/createClient")
    public String createClient(ModelMap model) {
        model.addAttribute("client", new Client());
        return "CreateClient";
    }

    @RequestMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Client client) {
        Client savedClient = clientService.saveClient(client);
        return "CreateClient";
    }
    @RequestMapping("/clientsList")
    public String clientsList(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "ClientsList";
    }
}

