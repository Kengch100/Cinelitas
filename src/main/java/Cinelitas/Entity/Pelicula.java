/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author Keng
 */
@Entity
@Table (name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String costo_de_la_entrada;
    private String fecha;
    private String sala;
    private String capacidad_maxima;
    
    @ManyToOne
    @JoinColumn (name = "pelicula_id")

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosto_de_la_entrada() {
        return costo_de_la_entrada;
    }

    public void setCosto_de_la_entrada(String costo_de_la_entrada) {
        this.costo_de_la_entrada = costo_de_la_entrada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCapacidad_maxima() {
        return capacidad_maxima;
    }

    public void setCapacidad_maxima(String capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public String getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(String numero_sala) {
        this.numero_sala = numero_sala;
    }

    public String getNombre_sala() {
        return nombre_sala;
    }

    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }
    private String numero_sala;
    private String nombre_sala;
    
    
}
