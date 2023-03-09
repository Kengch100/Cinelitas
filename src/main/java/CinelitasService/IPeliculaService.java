/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CinelitasService;

import Cinelitas.Entity.Pelicula;
import Cinelitas.Entity.Persona;
import java.util.List;

/**
 *
 * @author Keng
 */
public interface IPeliculaService {

    public abstract List<Pelicula> ListPelicula();
    public List<Persona> getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona(Persona persona);
    public void delete (long id);
}
