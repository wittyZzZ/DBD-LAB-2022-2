package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Region")

public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_region;
    private String nombre_region;

    public Region() {

    }

    public Region(Integer id_region, String nombre_region) {
        this.id_region = id_region;
        this.nombre_region = nombre_region;
    }

    // Getters
    public Integer getId_region() {
        return id_region;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    // Setters
    public void setId_region(Integer id_region) {
        this.id_region = id_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }

    @Override
    public String toString() {
        return "Region [id_region=" + id_region + ",nombre_region=" + nombre_region + ']';
    }
}



