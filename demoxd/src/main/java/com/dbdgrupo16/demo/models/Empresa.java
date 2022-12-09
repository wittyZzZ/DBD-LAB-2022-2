package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Empresa")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Integer id_empresa;

    @Column(name = "nombre_empresa")
    private String nombre_empresa;

    @Column(name = "tipo_tienda")
    private String tipo_tienda;

    @Column(name = "correo_empresa")
    private String correo_empresa;

    @Column(name = "telefono_empresa")
    private Integer telefono_empresa;

    @Column(name = "ranking_empresa")
    private Integer ranking_empresa;

    @Column(name = "restriccion_etaria")
    private Integer restriccion_etaria;

    @ManyToOne
    @JoinColumn(name = "id_admin_empresa")
    Administrador_empresa administrador_empresa;

    public Empresa() {

    }

    // Constructor
    public Empresa(Integer id_empresa, String nombre_empresa, String tipo_tienda, String correo_empresa, Integer telefono_empresa, Integer ranking_empresa, Integer restriccion_etaria, Administrador_empresa administrador_empresa) {
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
        this.tipo_tienda = tipo_tienda;
        this.correo_empresa = correo_empresa;
        this.telefono_empresa = telefono_empresa;
        this.ranking_empresa = ranking_empresa;
        this.restriccion_etaria = restriccion_etaria;
        this.administrador_empresa = administrador_empresa;
    }

    // Getters
    public Integer getId_empresa() {
        return id_empresa;
    }
    public String getNombre_empresa() {
        return nombre_empresa;
    }
    public String getTipo_tienda() {
        return tipo_tienda;
    }
    public String getCorreo_empresa() {
        return correo_empresa;
    }
    public Integer getTelefono_empresa() {
        return telefono_empresa;
    }
    public Integer getRanking_empresa() {
        return ranking_empresa;
    }
    public Integer getRestriccion_etaria() {
        return restriccion_etaria;
    }
    public Administrador_empresa getAdministrador_empresa() {
        return administrador_empresa;
    }

    // Setters
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
    public void setTipo_tienda(String tipo_tienda) {
        this.tipo_tienda = tipo_tienda;
    }
    public void setCorreo_empresa(String correo_empresa) {
        this.correo_empresa = correo_empresa;
    }
    public void setTelefono_empresa(Integer telefono_empresa) {
        this.telefono_empresa = telefono_empresa;
    }
    public void setRanking_empresa(Integer ranking_empresa) {
        this.ranking_empresa = ranking_empresa;
    }
    public void setRestriccion_etaria(Integer restriccion_etaria) {
        this.restriccion_etaria = restriccion_etaria;
    }
    public void setAdministrador_empresa(Administrador_empresa administrador_empresa) {
        this.administrador_empresa = administrador_empresa;
    }

    @Override
    public String toString() {
        return "Empresa [id_empresa=" + id_empresa +
                ", nombre_empresa='" + nombre_empresa + '\'' +
                ", tipo_tienda='" + tipo_tienda + '\'' +
                ", correo_empresa='" + correo_empresa + '\'' +
                ", telefono_empresa=" + telefono_empresa +
                ", ranking_empresa=" + ranking_empresa +
                ", restriccion_etaria=" + restriccion_etaria +
                ", administrador_empresa=" + administrador_empresa +
                ']';
    }
}
