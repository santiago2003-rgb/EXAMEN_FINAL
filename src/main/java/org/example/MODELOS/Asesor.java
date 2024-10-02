package org.example.MODELOS;

public class Asesor {

    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String especialidad;
    private Integer añosExperiencia;
    private String zonaTrabajo;
    private String disponibilidad;
    private String comentarios;

    public Asesor() {
    }

    public Asesor(Long id, String nombre, String apellido, String telefono, String email, String especialidad, Integer añosExperiencia, String zonaTrabajo, String disponibilidad, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.zonaTrabajo = zonaTrabajo;
        this.disponibilidad = disponibilidad;
        this.comentarios = comentarios;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getZonaTrabajo() {
        return zonaTrabajo;
    }

    public void setZonaTrabajo(String zonaTrabajo) {
        this.zonaTrabajo = zonaTrabajo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", zonaTrabajo='" + zonaTrabajo + '\'' +
                ", disponibilidad='" + disponibilidad + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
