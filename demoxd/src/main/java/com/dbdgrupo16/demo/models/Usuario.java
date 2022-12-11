package com.dbdgrupo16.demo.models;

import javax.persistence.*;

@Entity
@Table (name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id_usuario;
    @Column(name = "rut_usuario")
    private String rut_usuario;
    @Column(name = "nombre_usuario")
    private String nombre_usuario;
    @Column(name = "correo_usuario")
    private String correo_usuario;
    @Column(name = "telefono_usuario")
    private Integer telefono_usuario;
    @Column(name = "edad_usuario")
    private Integer edad_usuario;
    @Column(name = "fecha_registro")
    private String fecha_registro;
    @Column(name = "contraseña_cuenta")
    private String contraseña_cuenta;
    @Column(name = "id_empresa")
    private Integer id_empresa;
    @Column(name = "id_region")
    private Integer id_region;

    public Usuario() {

    }

    //Constructor
    public Usuario(Integer id_usuario, String rut_usuario, String nombre_usuario, String correo_usuario, Integer telefono_usuario, Integer edad_usuario, String fecha_registro, String contraseña_cuenta, Integer id_empresa, Integer id_region) {

        this.id_usuario = id_usuario;
        this.rut_usuario = rut_usuario;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.telefono_usuario = telefono_usuario;
        this.edad_usuario = edad_usuario;
        this.fecha_registro = fecha_registro;
        this.contraseña_cuenta = contraseña_cuenta;
        this.id_empresa = id_empresa;
        this.id_region = id_region;
    }

    //Getters
    public Integer getId_usuario() {
        return id_usuario;
    }
    public String getRut_usuario() {
        return rut_usuario;
    }
    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public String getCorreo_usuario() {
        return correo_usuario;
    }
    public Integer getTelefono_usuario() {
        return telefono_usuario;
    }
    public Integer getEdad_usuario() {
        return edad_usuario;
    }
    public String getFecha_registro() {
        return fecha_registro;
    }
    public String getContraseña_cuenta() {
        return contraseña_cuenta;
    }
    public Integer getId_empresa() {
        return id_empresa;
    }
    public Integer getId_region() {
        return id_region;
    }

    //Setters
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public void setRut_usuario(String rut_usuario) {
        this.rut_usuario = rut_usuario;
    }
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    public void setTelefono_usuario(Integer telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }
    public void setEdad_usuario(Integer edad_usuario) {
        this.edad_usuario = edad_usuario;
    }
    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    public void setContraseña_cuenta(String contraseña_cuenta) {
        this.contraseña_cuenta = contraseña_cuenta;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public void setId_region(Integer id_region) {
        this.id_region = id_region;
    }

    @Override
    public String toString() {
        return "Usuario [id_usuario=" + id_usuario +
                ", rut_usuario=" + rut_usuario +
                ", nombre_usuario='" + nombre_usuario +
                ", correo_usuario='" + correo_usuario +
                ", telefono_usuario=" + telefono_usuario +
                ", edad_usuario=" + edad_usuario +
                ", fecha_registro='" + fecha_registro +
                ", contraseña_cuenta='" + contraseña_cuenta +
                ", id_empresa=" + id_empresa +
                ", id_region=" + id_region +
                ']';
    }
}