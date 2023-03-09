/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CinelitasService;

import Cinelitas.Entity.Pelicula;
import Cinelitas.Repository.peliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keng
 */
@Service
public class peliculaService {
    @Autowired
    private peliculaRepository peliculaRepository;
    
    public List<Pelicula> ListPelicula() {
        return (List<Pelicula>)peliculaRepository.findAll();
    }
}
