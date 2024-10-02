package org.example.MODELOS;

public class Agencia {

    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Integer numeroEmpleados;
    private Integer añosOperacion;
    private String ciudad;
    private String especialidad;
    private String website;

    public Agencia() {
    }

    public Agencia(Long id, String nombre, String direccion, String telefono, String email, Integer numeroEmpleados, Integer añosOperacion, String ciudad, String especialidad, String website) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numeroEmpleados = numeroEmpleados;
        this.añosOperacion = añosOperacion;
        this.ciudad = ciudad;
        this.especialidad = especialidad;
        this.website = website;
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

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Integer getAñosOperacion() {
        return añosOperacion;
    }

    public void setAñosOperacion(Integer añosOperacion) {
        this.añosOperacion = añosOperacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                ", añosOperacion=" + añosOperacion +
                ", ciudad='" + ciudad + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
