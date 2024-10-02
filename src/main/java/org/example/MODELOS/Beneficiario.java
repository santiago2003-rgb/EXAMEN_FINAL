package org.example.MODELOS;

public class Beneficiario {

    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String parentesco;
    private String direccion;
    private String telefono;
    private String email;
    private double porcentajeBeneficio;
    private String cuentaBancaria;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellido, int edad, String parentesco, String direccion, String telefono, String email, double porcentajeBeneficio, String cuentaBancaria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.parentesco = parentesco;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.cuentaBancaria = cuentaBancaria;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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

    public double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", parentesco='" + parentesco + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                '}';
    }
}
