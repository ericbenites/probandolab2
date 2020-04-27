package lab2.practicando.controllers;

import lab2.practicando.entity.departments;
import lab2.practicando.repository.departmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class departmentsController {
    @Autowired
    departmentsRepository departmentsRepository;

    @GetMapping
    public String primera(){
        return "index";
    }

    @GetMapping("/lista")
    public String lista(Model model){
        List<departments> listaDe = departmentsRepository.findAll();
        model.addAttribute("lista",listaDe);
        return "listaDepart";
    }

}
