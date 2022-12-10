package com.dbdgrupo16.demo.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "Rol_usuario")
public class Rol_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol_usuario")
    private Integer id_rol_usuario;

    @Column(name = "id_rol")
    private Integer id_rol;

    @Column(name = "id_usuario")
    private Integer id_usuario;

    public Rol_usuario() {

    }

    // Constructor
    public Rol_usuario(Integer id_rol_usuario, Integer id_rol, Integer id_usuario) {
        this.id_rol_usuario = id_rol_usuario;
        this.id_rol = id_rol;
        this.id_usuario = id_usuario;
    }

    // Getters
    public Integer getId_rol_usuario() {
        return id_rol_usuario;
    }
    public Integer getId_rol() {
        return id_rol;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }

    // Setters
    public void setId_rol_usuario(Integer id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }
    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Rol_usuario [id_rol_usuario=" + id_rol_usuario +
                ", id_rol=" + id_rol +
                ", id_usuario=" + id_usuario +
                ']';
    }
}
