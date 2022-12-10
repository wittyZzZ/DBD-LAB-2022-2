package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario_empresa")
public class Usuario_empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_empresa")
    private Integer id_usuario_empresa;

    @Column(name = "id_empresa")
    private Integer id_empresa;

    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Column(name = "puntaje_empresa")
    private Integer puntaje_empresa;

    public Usuario_empresa() {

    }

    // Constructor
    public Usuario_empresa(Integer id_usuario_empresa, Integer id_empresa, Integer id_usuario, Integer puntaje_empresa) {
        this.id_usuario_empresa = id_usuario_empresa;
        this.id_empresa = id_empresa;
        this.id_usuario = id_usuario;
        this.puntaje_empresa = puntaje_empresa;
    }

    // Getters
    public Integer getId_usuario_empresa() {
        return id_usuario_empresa;
    }
    public Integer getId_empresa() {
        return id_empresa;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public Integer getPuntaje_empresa() {
        return puntaje_empresa;
    }

    // Setters
    public void setId_usuario_empresa(Integer id_usuario_empresa) {
        this.id_usuario_empresa = id_usuario_empresa;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public void setPuntaje_empresa(Integer puntaje_empresa) {
        this.puntaje_empresa = puntaje_empresa;
    }

    @Override
    public String toString() {
        return "Usuario_empresa [id_usuario_empresa=" + id_usuario_empresa +
                ", id_empresa=" + id_empresa +
                ", id_usuario=" + id_usuario +
                ", puntaje_empresa=" + puntaje_empresa +
                ']';
    }
}
