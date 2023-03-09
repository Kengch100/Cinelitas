/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CinelitasController;

import Cinelitas.Entity.Pelicula;
import Cinelitas.Entity.Persona;
import CinelitasService.IPeliculaService;
import CinelitasService.IPersonaService;
import CinelitasService.peliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Keng
 */
@Controller
public class Cinelitas {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IPeliculaService paisService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Persona> listaPersona = personaService.listPersona();
        model.addAttribute("persona", new Persona());
        model.addAttribute("persona", listaPersona);
        return "crear";
    }

    @GetMapping("/delete{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona) {
        //personaService.delete{idPersona};
        //return "crear";
        return null;
    }

    @PostMapping("/save")
    public String guardarPersona(Persona persona) {
        personaService.savePersona(persona);
        return "redirect:/persona";
    }

    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        Persona persona = personaService.getPersonaById(idPersona);
        model.addAttribute("persona", persona);
        return "crear";
    }
}
