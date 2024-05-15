package org.example.gestion_restaurant.controllers;

import lombok.AllArgsConstructor;
import org.example.gestion_restaurant.services.EmployeeService;
import org.example.gestion_restaurant.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @RequestMapping("/createEmployee")
    public String createEmployee(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "CreateEmployee";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return "CreateEmployee";
    }
    @RequestMapping("/employeesList")
    public String employeesList(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "EmployeesList";
    }

}
