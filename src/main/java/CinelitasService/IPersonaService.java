/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CinelitasService;

import Cinelitas.Entity.Persona;
import java.util.List;

/**
 *
 * @author Keng
 */
public interface IPersonaService {
    public List<Persona> listPersona();

    public List<Persona> getAllPersona();

    public Persona getPersonaById(Long idPersona);

    public void savePersona(Persona persona);
}
