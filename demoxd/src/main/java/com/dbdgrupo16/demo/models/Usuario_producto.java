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
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    Producto producto;

    public Usuario_producto() {

    }

    //Constructor


    public Usuario_producto(Integer id_usuario_producto, Integer puntaje_producto, Usuario usuario, Producto producto) {

        this.id_usuario_producto = id_usuario_producto;
        this.puntaje_producto = puntaje_producto;
        this.usuario = usuario;
        this.producto = producto;
    }

    //Getters


    public Integer getId_usuario_producto() {
        return id_usuario_producto;
    }

    public Integer getPuntaje_producto() {
        return puntaje_producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    //Setters


    public void setId_usuario_producto(Integer id_usuario_producto) {
        this.id_usuario_producto = id_usuario_producto;
    }

    public void setPuntaje_producto(Integer puntaje_producto) {
        this.puntaje_producto = puntaje_producto;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}

