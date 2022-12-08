package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Pedido")

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_pedido")
    private Integer id_pedido;
    @Column(name ="nombre_pedido")
    private String nombre_pedido;
    @Column(name="fecha_entrega")
    private String fecha_entrega;

    public Pedido(){

    }
    public Pedido(Integer id_pedido,String nombre_pedido,String fecha_entrega){
        this.id_pedido = id_pedido;
        this.nombre_pedido = nombre_pedido;
        this.fecha_entrega = fecha_entrega;
    }
    // Getters
    public Integer getId_pedido() {
        return id_pedido;
    }

    public String getNombre_pedido() {
        return nombre_pedido;
    }
    public String getFecha_entrega(){
        return fecha_entrega;
    }

    // Setters
    public void setId_region(Integer id_region) {
        this.id_pedido = id_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_pedido = nombre_region;
    }
    public void setFecha_entrega(String fecha_entrega){
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Pedido [id_pedido=" + id_pedido + ",nombre_pedido=" + nombre_pedido +",fecha_entrega=" + fecha_entrega + ']';
    }

}

