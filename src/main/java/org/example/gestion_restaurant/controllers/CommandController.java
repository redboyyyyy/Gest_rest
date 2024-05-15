package org.example.gestion_restaurant.controllers;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.CommandService;
import org.example.gestion_restaurant.services.EmployeeService;
import org.example.gestion_restaurant.services.TableeService;
import org.example.gestion_restaurant.services.ClientService;
import org.example.gestion_restaurant.entities.Command;
import org.example.gestion_restaurant.entities.Employee;
import org.example.gestion_restaurant.entities.Tablee;
import org.example.gestion_restaurant.entities.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class CommandController {

    private final CommandService commandService;
    private final EmployeeService employeeService;
    private final TableeService tableeService;
    private final ClientService clientService;

    @RequestMapping("/createCommand")
    public String createCommand(ModelMap model) {
        model.addAttribute("command", new Command());
        model.addAttribute("employees", employeeService.getAllEmployees());
        model.addAttribute("tables", tableeService.getAllTablees());
        model.addAttribute("clients", clientService.getAllClients());
        return "CreateCommand";
    }

    @RequestMapping("/saveCommand")
    public String saveCommand(@ModelAttribute("command") Command command) {
        Command savedCommand = commandService.saveCommand(command);
        return "CreateCommand";
    }

    @RequestMapping("/commandsList")
    public String commandsList(Model model) {
        List<Command> commands = commandService.getAllCommands();
        model.addAttribute("commands", commands);
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "CommandsList";
    }

}
