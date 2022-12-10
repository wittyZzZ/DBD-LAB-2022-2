package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Integer id_direccion;

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "id_comuna")
    private Integer id_comuna;

    public Direccion() {

    }

    // Constructor
    public Direccion(Integer id_direccion, String calle, Integer numero, Integer id_comuna) {
        this.id_direccion = id_direccion;
        this.calle = calle;
        this.numero = numero;
        this.id_comuna = id_comuna;
    }

    // Getters
    public Integer getId_direccion() {
        return id_direccion;
    }
    public String getCalle() {
        return calle;
    }
    public Integer getNumero() {
        return numero;
    }
    public Integer getId_comuna() {
        return id_comuna;
    }

    // Setters
    public void setId_direccion(Integer id_direccion) {
        this.id_direccion = id_direccion;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public void setId_comuna(Integer id_comuna) {
        this.id_comuna = id_comuna;
    }

    @Override
    public String toString() {
        return "Direccion [id_direccion=" + id_direccion +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", id_comuna=" + id_comuna +
                ']';
    }
}
