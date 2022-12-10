package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "rol_permiso")

public class Rol_permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_rol_permiso")
    private Integer id_rol_permiso;

    @Column(name = "id_rol")
    private Integer id_rol;

    @Column(name = "id_permiso")
    private Integer id_permiso;

    public Rol_permiso() {

    }

    // Constructor
    public Rol_permiso(Integer id_rol_permiso, Integer id_rol, Integer id_permiso) {
        this.id_rol_permiso = id_rol_permiso;
        this.id_rol = id_rol;
        this.id_permiso = id_permiso;
    }

    // Getters
    public Integer getId_rol_permiso() {
        return id_rol_permiso;
    }
    public Integer getId_rol() {
        return id_rol;
    }
    public Integer getId_permiso() {
        return id_permiso;
    }

    // Setters
    public void setId_rol_permiso(Integer id_rol_permiso) {
        this.id_rol_permiso = id_rol_permiso;
    }
    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }
    public void setId_permiso(Integer id_permiso) {
        this.id_permiso = id_permiso;
    }

    @Override
    public String toString() {
        return "Rol_permiso [id_rol_permiso=" + id_rol_permiso +
                ", id_rol=" + id_rol +
                ", id_permiso=" + id_permiso +
                ']';
    }
}
