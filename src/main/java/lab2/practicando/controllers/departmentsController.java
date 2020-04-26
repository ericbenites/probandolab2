package lab2.practicando.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class departmentsController {
    @GetMapping
    public String primera(){
        return "index";
    }
}
