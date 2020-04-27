package lab2.practicando.controllers;

import lab2.practicando.entity.countries;
import lab2.practicando.repository.countriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/countries")
public class countriesController {
    @Autowired
    countriesRepository countRepo;
    @GetMapping("/lista")
    public String listarCountries(Model model){
        List<countries> listaCountries = countRepo.findAll();
        model.addAttribute("listaCountries", listaCountries);
        return "countries/lista";
    }
}
