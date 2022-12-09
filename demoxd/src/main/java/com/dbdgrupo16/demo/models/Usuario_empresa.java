package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario_empresa")
public class Usuario_empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_empresa")
    private Integer id_usuario_empresa;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;

    @Column(name = "puntaje_empresa")
    private Integer puntaje_empresa;

    public Usuario_empresa() {

    }

    // Constructor
    public Usuario_empresa(Integer id_usuario_empresa, Empresa empresa, Usuario usuario, Integer puntaje_empresa) {
        this.id_usuario_empresa = id_usuario_empresa;
        this.empresa = empresa;
        this.usuario = usuario;
        this.puntaje_empresa = puntaje_empresa;
    }

    // Getters
    public Integer getId_usuario_empresa() {
        return id_usuario_empresa;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Integer getPuntaje_empresa() {
        return puntaje_empresa;
    }

    // Setters
    public void setId_usuario_empresa(Integer id_usuario_empresa) {
        this.id_usuario_empresa = id_usuario_empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setPuntaje_empresa(Integer puntaje_empresa) {
        this.puntaje_empresa = puntaje_empresa;
    }

    @Override
    public String toString() {
        return "Usuario_empresa [id_usuario_empresa=" + id_usuario_empresa +
                ", empresa=" + empresa +
                ", usuario=" + usuario +
                ", puntaje_empresa=" + puntaje_empresa +
                ']';
    }
}
