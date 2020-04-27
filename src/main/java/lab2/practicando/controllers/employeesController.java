package lab2.practicando.controllers;

import lab2.practicando.entity.Employees;
import lab2.practicando.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("employees")
public class employeesController {
    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = {"", "/listar"})
    public String listar(Model model){

        List<Employees> listaEmployees = employeesRepository.findAll();

        model.addAttribute("lista", listaEmployees);

        return "employees/listaEmployees";
    }



}
