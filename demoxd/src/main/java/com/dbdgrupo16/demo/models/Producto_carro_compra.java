package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Producto_carro_compra")
public class Producto_carro_compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto_carro_compra")
    private Integer id_producto_carro_compra;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_carro")
    Carro_de_compra carro_de_compra;

    public Producto_carro_compra() {

    }

    // Constructor
    public Producto_carro_compra(Integer id_producto_carro_compra, Producto producto, Carro_de_compra carro_de_compra) {
        this.id_producto_carro_compra = id_producto_carro_compra;
        this.producto = producto;
        this.carro_de_compra = carro_de_compra;
    }

    // Getters
    public Integer getId_producto_carro_compra() {
        return id_producto_carro_compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public Carro_de_compra getCarro_de_compra() {
        return carro_de_compra;
    }

    // Setters
    public void setId_producto_carro_compra(Integer id_producto_carro_compra) {
        this.id_producto_carro_compra = id_producto_carro_compra;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setCarro_de_compra(Carro_de_compra carro_de_compra) {
        this.carro_de_compra = carro_de_compra;
    }

    @Override
    public String toString() {
        return "Producto_carro_compra [id_producto_carro_compra=" + id_producto_carro_compra +
                ", producto=" + producto +
                ", carro_de_compra=" + carro_de_compra +
                ']';
    }
}
