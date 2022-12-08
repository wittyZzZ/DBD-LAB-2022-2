package com.dbdgrupo16.demo.models;

import javax.persistence.*;
@Entity
@Table(name = "Usuario_carro_compra")

public class Usuario_carro_compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_usuario_carro_compra")
    private Integer id_usuario_carro_compra;

    @ManyToOne
    @JoinColumn (name ="id_carro")
    Carro_de_compra carro_de_compra;

    @ManyToOne
    @JoinColumn(name = "id_usurio")
    Usuario usuario;

    public Usuario_carro_compra() {

    }

    // Constructor
    public Usuario_carro_compra(Integer id_usuario_carro_compra,Carro id_carro_de_compra ,Usuario id_usuario,) {
        this.id_usuario_carro_compra = id_usuario_carro_compra;
        this.carro_de_compra = carro_de_compra;
        this.usuario = usuario;
    }

    // Getters
    public Integer getId_usuario_carro_compra() {
        return id_usuario_carro_compra;
    }

    public Carro_de_compra getCarro_de_compra() {
        return carro_de_compra;
    }
    public Usuario getUsuario(){
        return usuario;
    }


    // Setters
    public void setId_usuario_carro_compra(Integer id_usuario_carro_compra) {
        this.id_usuario_carro_compra = id_usuario_carro_compra;
    }

    public void setCarro_de_compra(Carro_de_compra nombre_region) {
        this.carro_de_compra = carro_de_compra;
    }

    public void setUsuario(Usuario usuario){this.usuario = usuario}
    @Override
    public String toString() {
        return "Usuario_carro_de_compra [id_usuario_carro_compra=" + id_usuario_carro_compra + ",carro_de_compra=" + carro_de_compra +"usuario="+usuario+ ']';
    }

}


