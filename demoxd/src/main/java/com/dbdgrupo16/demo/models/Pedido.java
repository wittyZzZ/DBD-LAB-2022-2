package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_pedido")
    private Integer id_pedido;
    @Column(name ="direccion_entrega")
    private String direccion_entrega;
    @Column(name="fecha_entrega")
    private String fecha_entrega;

    public Pedido(){

    }
    public Pedido(Integer id_pedido,String direccion_entrega,String fecha_entrega){
        this.id_pedido = id_pedido;
        this.direccion_entrega = direccion_entrega;
        this.fecha_entrega = fecha_entrega;
    }

    // Getters
    public Integer getId_pedido() {
        return id_pedido;
    }
    public String getDireccion_entrega() {
        return direccion_entrega;
    }
    public String getFecha_entrega(){
        return fecha_entrega;
    }

    // Setters
    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }
    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }
    public void setFecha_entrega(String fecha_entrega){
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Pedido [id_pedido=" + id_pedido + ",direccion_entrega=" +
                direccion_entrega +",fecha_entrega=" + fecha_entrega + ']';
    }
}

