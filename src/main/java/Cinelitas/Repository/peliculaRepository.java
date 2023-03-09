/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Cinelitas.Repository;

import Cinelitas.Entity.Pelicula;
import Cinelitas.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keng
 */
@Repository
public interface peliculaRepository extends CrudRepository<Pelicula, Long>{
    
}
