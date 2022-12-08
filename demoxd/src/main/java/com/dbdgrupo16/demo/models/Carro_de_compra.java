package com.dbdgrupo16.demo.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "Carro_de_compra")

public class Carro_de_compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Integer id_carro;
    @Column(name = "medio_de_pago")
    private String medio_de_pago;
    @Column(name = "cantidad_productos")
    private Integer cantidad_productos;
    @Column(name = "precio_total")
    private Integer precio_total;
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    Pedido pedido;

    public Carro_de_compra() {

    }

    //Constructor

    public Carro_de_compra(Integer id_carro, String medio_de_pago, Integer cantidad_productos, Integer precio_total, Pedido pedido) {

        this.id_carro = id_carro;
        this.medio_de_pago = medio_de_pago;
        this.cantidad_productos = cantidad_productos;
        this.precio_total = precio_total;
        this.pedido = pedido;
    }

    //Getters

    public Integer getId_carro() {
        return id_carro;
    }

    public String getMedio_de_pago() {
        return medio_de_pago;
    }

    public Integer getCantidad_productos() {
        return cantidad_productos;
    }

    public Integer getPrecio_total() {
        return precio_total;
    }

    public Pedido getPedido() {
        return pedido;
    }

    //Setters

    public void setId_carro(Integer id_carro) {
        this.id_carro = id_carro;
    }

    public void setMedio_de_pago(String medio_de_pago) {
        this.medio_de_pago = medio_de_pago;
    }

    public void setCantidad_productos(Integer cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public void setPrecio_total(Integer precio_total) {
        this.precio_total = precio_total;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
