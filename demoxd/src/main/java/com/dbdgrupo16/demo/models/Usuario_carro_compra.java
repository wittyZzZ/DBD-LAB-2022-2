package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario_carro_compra")

public class Usuario_carro_compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_usuario_carro_compra")
    private Integer id_usuario_carro_compra;

    @Column (name ="id_carro")
    private Integer id_carro_de_compra;

    @Column(name = "id_usuario")
    private Integer id_usuario;

    public Usuario_carro_compra() {

    }

    // Constructor
    public Usuario_carro_compra(Integer id_usuario_carro_compra, Integer id_carro_de_compra, Integer id_usuario) {
        this.id_usuario_carro_compra = id_usuario_carro_compra;
        this.id_carro_de_compra = id_carro_de_compra;
        this.id_usuario = id_usuario;
    }

    // Getters
    public Integer getId_usuario_carro_compra() {return id_usuario_carro_compra;}
    public Integer getId_carro_de_compra() {return id_carro_de_compra;}
    public Integer getId_usuario(){return id_usuario;}

    // Setters
    public void setId_usuario_carro_compra(Integer id_usuario_carro_compra) {
        this.id_usuario_carro_compra = id_usuario_carro_compra;
    }
    public void setId_carro_de_compra(Integer id_carro_de_compra) {
        this.id_carro_de_compra = id_carro_de_compra;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Usuario_carro_de_compra [id_usuario_carro_compra=" +
                id_usuario_carro_compra + ",id_carro_de_compra=" + id_carro_de_compra +"id_usuario="+id_usuario+
                ']';
    }
}


