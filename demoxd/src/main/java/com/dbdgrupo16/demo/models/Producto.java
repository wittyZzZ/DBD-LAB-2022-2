package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id_producto;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "tipo_producto")
    private String tipo_producto;
    @Column(name = "precio_producto")
    private Integer precio_producto;
    @Column(name = "stock_producto")
    private Integer stock_producto;
    @Column(name = "ranking_producto")
    private Integer ranking_producto;

    public Producto() {

    }

    // Constructor
    public Producto(Integer id_producto, String nombre_producto, String tipo_producto, Integer precio_producto, Integer stock_producto, Integer ranking_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.tipo_producto = tipo_producto;
        this.precio_producto = precio_producto;
        this.stock_producto = stock_producto;
        this.ranking_producto = ranking_producto;
    }

    // Getters
    public Integer getId_producto() {
        return id_producto;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public String getTipo_producto() {
        return tipo_producto;
    }
    public Integer getPrecio_producto() {
        return precio_producto;
    }
    public Integer getStock_producto() {
        return stock_producto;
    }
    public Integer getRanking_producto() {
        return ranking_producto;
    }

    // Setters
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
    public void setPrecio_producto(Integer precio_producto) {
        this.precio_producto = precio_producto;
    }
    public void setStock_producto(Integer stock_producto) {
        this.stock_producto = stock_producto;
    }
    public void setRanking_producto(Integer ranking_producto) {
        this.ranking_producto = ranking_producto;
    }

    @Override
    public String toString() {
        return "Producto [id_producto=" + id_producto +
                ", nombre_producto='" + nombre_producto +
                ", tipo_producto='" + tipo_producto  +
                ", precio_producto=" + precio_producto +
                ", stock_producto=" + stock_producto +
                ", ranking_producto=" + ranking_producto +
                ']';
    }
}
