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

    @ManyToOne
    @JoinColumn(name = "id_comuna")
    Comuna comuna;

    public Direccion() {

    }

    // Constructor
    public Direccion(Integer id_direccion, String calle, Integer numero, Comuna comuna) {
        this.id_direccion = id_direccion;
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
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
    public Comuna getComuna() {
        return comuna;
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
    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "Direccion [id_direccion=" + id_direccion +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", comuna=" + comuna +
                ']';
    }
}
