package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "rol_permiso")

public class Rol_permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_rol_permiso")
    private Integer id_rol_permiso;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_permiso")
    Permiso permiso;

    public Rol_permiso() {

    }

    // Constructor
    public Rol_permiso(Integer id_rol_permiso, Rol rol, Permiso permiso) {
        this.id_rol_permiso = id_rol_permiso;
        this.rol = rol;
        this.permiso = permiso;
    }

    // Getters
    public Integer getId_rol_permiso() {
        return id_rol_permiso;
    }
    public Rol getRol() {
        return rol;
    }
    public Permiso getPermiso() {
        return permiso;
    }

    // Setters
    public void setId_rol_permiso(Integer id_rol_permiso) {
        this.id_rol_permiso = id_rol_permiso;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    @Override
    public String toString() {
        return "Rol_permiso [id_rol_permiso=" + id_rol_permiso +
                ", rol=" + rol +
                ", permiso=" + permiso +
                ']';
    }
}
