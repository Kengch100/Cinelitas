/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CinelitasService;

import Cinelitas.Entity.Persona;
import Cinelitas.Repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keng
 */
@Service
public class personaService {
    @Autowired
    private personaRepository personaRepository;
    
    public List<Persona> getAllPersona() {
        return (List<Persona>)personaRepository.findAll();
    }

    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    public void delete(long id) {
        personaRepository.deleteById(id);
    }
}
