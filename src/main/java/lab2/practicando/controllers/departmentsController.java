package lab2.practicando.controllers;

import lab2.practicando.entity.departments;
import lab2.practicando.repository.departmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/agregarD")
    public String agregar(){ return "agregaD"; }

    @PostMapping("/guardarD")
    public String guardar(departments departments, RedirectAttributes redirectAttributes){
        if(departments.getDepartment_id()==0){
            List<departments>listaActual = departmentsRepository.findAll();
            departments.setDepartment_id((listaActual.size()*10)+10);
            redirectAttributes.addFlashAttribute("mensaje","Departamento Creado Exitosamente");
        }
        else
        {
            redirectAttributes.addFlashAttribute("mensaje","Departamento Actualizado Exitosamente");
        }
        departmentsRepository.save(departments);
        return "redirect:/lista";
    }
    @GetMapping("/borrarD")
    public String borrar(@RequestParam("id") int id,RedirectAttributes redirectAttributes){
        Optional<departments> opt = departmentsRepository.findById(id);
        if(opt.isPresent()) {
            redirectAttributes.addFlashAttribute("mensaje","Borrado Actualizado Exitosamente");
            departmentsRepository.deleteById(id);
        }
        return "redirect:/lista";
    }
    @GetMapping("/editarD")
    public String editar(Model model, @RequestParam ("id") int id){
        Optional<departments> dep = departmentsRepository.findById(id);
        if(dep.isPresent()) {
            departments departments = dep.get();
            model.addAttribute("department",departments);
            return "editarD";
        }
        else
        {
            return "redirect:/lista";
        }
    }


}
