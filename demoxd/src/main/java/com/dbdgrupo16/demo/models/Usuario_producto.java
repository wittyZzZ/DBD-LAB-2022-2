package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario_producto")

public class Usuario_producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_producto")
    private Integer id_usuario_producto;
    @Column(name = "puntaje_producto")
    private Integer puntaje_producto;

    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column(name = "id_producto")
    private Integer id_producto;

    public Usuario_producto() {

    }

    //Constructor
    public Usuario_producto(Integer id_usuario_producto, Integer puntaje_producto, Integer id_usuario, Integer id_producto) {
        this.id_usuario_producto = id_usuario_producto;
        this.puntaje_producto = puntaje_producto;
        this.id_usuario = id_usuario;
        this.id_producto = id_producto;
    }

    //Getters
    public Integer getId_usuario_producto() {
        return id_usuario_producto;
    }
    public Integer getPuntaje_producto() {
        return puntaje_producto;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public Integer getId_producto() {
        return id_producto;
    }

    //Setters
    public void setId_usuario_producto(Integer id_usuario_producto) {
        this.id_usuario_producto = id_usuario_producto;
    }
    public void setPuntaje_producto(Integer puntaje_producto) {
        this.puntaje_producto = puntaje_producto;
    }
    public void setUsuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public void setProducto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String toString() {
        return "Usuario_producto [id_usuario_producto=" + id_usuario_producto +
                ", puntaje_producto=" + puntaje_producto +
                ", id_usuario=" + id_usuario +
                ", id_producto=" + id_producto +
                ']';
    }
}

