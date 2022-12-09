package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name="rol")

public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_rol")
    private Integer id_rol;

    @Column(name = "nombre_rol")
    private String nombre_rol;

    public Rol() {

    }

    //Constructor
    public Rol(Integer id_rol,String nombre_rol){
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
    }

    //Getters
    public Integer getId_rol() {
        return id_rol;
    }
    public String getNombre_rol(){
        return nombre_rol;
    }

    //Setters
    public void setId_rol(Integer id_rol){
        this.id_rol = id_rol;
    }
    public void setNombre_rol(String nombre_rol){
        this.nombre_rol = nombre_rol;
    }

    @Override
    public String toString(){
        return "Rol [id_rol="+id_rol +
                ", nombre_rol= '"+ nombre_rol+
                ']';
    }
}
