package org.example.MODELOS;

import java.time.LocalDate;
import java.util.Scanner;

public class Asegurado {

    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoSeguro;
    private String numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double montoAsegurado;
    private String estadoCivil;
    private Integer numeroHijos;
    private String ocupacion;

    public Asegurado() {
    }

    public Asegurado(Long id, String nombre, String apellido, Integer edad, String direccion, String telefono, String email, String tipoSeguro, String numeroPoliza, LocalDate fechaInicio, LocalDate fechaFin, Double montoAsegurado, String estadoCivil, Integer numeroHijos, String ocupacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoSeguro = tipoSeguro;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoAsegurado = montoAsegurado;
        this.estadoCivil = estadoCivil;
        this.numeroHijos = numeroHijos;
        this.ocupacion = ocupacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipoSeguro='" + tipoSeguro + '\'' +
                ", numeroPoliza='" + numeroPoliza + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", montoAsegurado=" + montoAsegurado +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", numeroHijos=" + numeroHijos +
                ", ocupacion='" + ocupacion + '\'' +
                '}';
    }
}
