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

    @ManyToOne
    @JoinColumn(name = "id_rol")
    Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;

    public Rol_usuario() {

    }

    // Constructor
    public Rol_usuario(Integer id_rol_usuario, Rol rol, Usuario usuario) {
        this.id_rol_usuario = id_rol_usuario;
        this.rol = rol;
        this.usuario = usuario;
    }

    // Getters
    public Integer getId_rol_usuario() {
        return id_rol_usuario;
    }
    public Rol getRol() {
        return rol;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    // Setters
    public void setId_rol_usuario(Integer id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Rol_usuario [id_rol_usuario=" + id_rol_usuario +
                ", rol=" + rol +
                ", usuario=" + usuario +
                ']';
    }
}
