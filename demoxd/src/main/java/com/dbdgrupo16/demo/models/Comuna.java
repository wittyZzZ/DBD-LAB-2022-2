package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Comuna")

public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comuna")
    private Integer id_comuna;
    @Column(name = "nombre_comuna")
    private String nombre_comuna;
    @Column(name = "codigo_postal")
    private Integer codigo_postal;
    @Column(name = "id_region")
    private Integer id_region;

    public Comuna() {

    }

    //Constructor

    public Comuna(Integer id_comuna, String nombre_comuna, Integer codigo_postal, Integer id_region) {

        this.id_comuna = id_comuna;
        this.nombre_comuna = nombre_comuna;
        this.codigo_postal = codigo_postal;
        this.id_region = id_region;
    }

    //Getters

    public Integer getId_comuna() {
        return id_comuna;
    }

    public String getNombre_comuna() {
        return nombre_comuna;
    }

    public Integer getCodigo_postal() {
        return codigo_postal;
    }

    public Integer getId_Region() {
        return id_region;
    }

    //Setters

    public void setId_comuna(Integer id_comuna) {
        this.id_comuna = id_comuna;
    }

    public void setNombre_comuna(String nombre_comuna) {
        this.nombre_comuna = nombre_comuna;
    }

    public void setCodigo_postal(Integer codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setId_Region(Integer id_region) {
        this.id_region = id_region;
    }

    @Override
    public String toString() {
        return "Comuna [id_comuna=" + id_comuna +
                ", nombre_comuna='" + nombre_comuna + '\'' +
                ", codigo_postal=" + codigo_postal +
                ", id_region=" + id_region +
                ']';
    }
}
