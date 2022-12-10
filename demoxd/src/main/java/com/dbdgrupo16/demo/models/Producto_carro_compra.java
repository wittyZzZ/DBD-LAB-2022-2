package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Producto_carro_compra")
public class Producto_carro_compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto_carro_compra")
    private Integer id_producto_carro_compra;

    @Column(name = "id_producto")
    private Integer id_producto;

    @Column(name = "id_carro")
    private Integer id_carro_de_compra;

    public Producto_carro_compra() {

    }

    // Constructor
    public Producto_carro_compra(Integer id_producto_carro_compra, Integer id_producto, Integer id_carro_de_compra) {
        this.id_producto_carro_compra = id_producto_carro_compra;
        this.id_producto = id_producto;
        this.id_carro_de_compra = id_carro_de_compra;
    }

    // Getters
    public Integer getId_producto_carro_compra() {
        return id_producto_carro_compra;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public Integer getId_carro_de_compra() {
        return id_carro_de_compra;
    }

    // Setters
    public void setId_producto_carro_compra(Integer id_producto_carro_compra) {
        this.id_producto_carro_compra = id_producto_carro_compra;
    }
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    public void setId_carro_de_compra(Integer id_carro_de_compra) {
        this.id_carro_de_compra = id_carro_de_compra;
    }

    @Override
    public String toString() {
        return "Producto_carro_compra [id_producto_carro_compra=" + id_producto_carro_compra +
                ", id_producto=" + id_producto +
                ", id_carro_de_compra=" + id_carro_de_compra +
                ']';
    }
}
