package lab2.practicando.controllers;

import lab2.practicando.entity.departments;
import lab2.practicando.entity.locations;
import lab2.practicando.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/location")
public class locationController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/lista")
    public String lista(Model model){
        List<locations> listaLoca = locationRepository.findAll();
        model.addAttribute("lista",listaLoca);
        return "location/gaaaa";
    }

    @GetMapping("/agregarLocation")
     public String agregar(){
        return"location/agregarLocation";
    }
}
