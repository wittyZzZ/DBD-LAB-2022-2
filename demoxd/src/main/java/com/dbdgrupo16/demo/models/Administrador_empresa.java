package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Administrador_empresa")
public class Administrador_empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin_empresa")
    private Integer id_admin_empresa;
    @Column(name = "RUT_admin_empresa")
    private String RUT_admin_empresa;
    @Column(name= "nombre_admin_empresa")
    private String nombre_admin_empresa;
    @Column(name = "correo_admin_empresa")
    private String correo_admin_empresa;
    @Column(name = "telefono_admin_empresa")
    private Integer telefono_admin_empresa;

    public Administrador_empresa() {

    }

    // Construct
    public Administrador_empresa(Integer id_admin_empresa, String RUT_admin_empresa, String nombre_admin_empresa, String correo_admin_empresa, Integer telefono_admin_empresa) {
        this.id_admin_empresa = id_admin_empresa;
        this.RUT_admin_empresa = RUT_admin_empresa;
        this.nombre_admin_empresa = nombre_admin_empresa;
        this.correo_admin_empresa = correo_admin_empresa;
        this.telefono_admin_empresa = telefono_admin_empresa;
    }

    // Getters
    public Integer getId_admin_empresa() {
        return id_admin_empresa;
    }
    public String getRUT_admin_empresa() {
        return RUT_admin_empresa;
    }
    public String getNombre_admin_empresa() {
        return nombre_admin_empresa;
    }
    public String getCorreo_admin_empresa() {
        return correo_admin_empresa;
    }
    public Integer getTelefono_admin_empresa() {
        return telefono_admin_empresa;
    }

    // Setters
    public void setId_admin_empresa(Integer id_admin_empresa) {
        this.id_admin_empresa = id_admin_empresa;
    }

    public void setRUT_admin_empresa(String RUT_admin_empresa) {
        this.RUT_admin_empresa = RUT_admin_empresa;
    }

    public void setNombre_admin_empresa(String nombre_admin_empresa) {
        this.nombre_admin_empresa = nombre_admin_empresa;
    }

    public void setCorreo_admin_empresa(String correo_admin_empresa) {
        this.correo_admin_empresa = correo_admin_empresa;
    }

    public void setTelefono_admin_empresa(Integer telefono_admin_empresa) {
        this.telefono_admin_empresa = telefono_admin_empresa;
    }

    @Override
    public String toString() {
        return "Administrador_empresa [id_admin_empresa=" + id_admin_empresa +
                ", RUT_admin_empresa='" + RUT_admin_empresa +
                ", nombre_admin_empresa='" + nombre_admin_empresa +
                ", correo_admin_empresa='" + correo_admin_empresa  +
                ", telefono_admin_empresa=" + telefono_admin_empresa +
                ']';
    }
}
