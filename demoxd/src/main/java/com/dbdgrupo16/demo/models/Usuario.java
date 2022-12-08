package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    private String nombre_usuario;

    public Usuario() {

    }

}

