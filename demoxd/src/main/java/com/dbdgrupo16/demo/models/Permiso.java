package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Permiso")

public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_permiso")
    private Integer id_permiso;
    @Column(name ="nombre_permiso")
    private String nombre_permiso;

    public Permiso() {

    }

    public Permiso(Integer id_permiso, String nombre_permiso) {
        this.id_permiso = id_permiso;
        this.nombre_permiso = nombre_permiso;
    }

    // Getters
    public Integer getId_permiso() {
        return id_permiso;
    }

    public String getNombre_permiso() {
        return nombre_permiso;
    }

    // Setters
    public void setId_permiso(Integer id_permiso) {
        this.id_permiso = id_permiso;
    }

    public void setNombre_permiso(String nombre_permiso) {
        this.nombre_permiso = nombre_permiso;
    }

    @Override
    public String toString() {return "Permiso [id_permiso=" + id_permiso +
            ", nombre_permiso='" + nombre_permiso + ']';
    }
}
