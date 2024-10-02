package org.example.MODELOS;

public class Inmueble {

    private Long id;
    private String direccion;
    private String tipo;
    private Double precio;
    private Double metrosCuadrados;
    private Integer habitaciones;
    private Boolean tieneGaraje;
    private Integer antiguedad;
    private String estado;
    private String descripcion;

    public Inmueble(long id, String direccion, String viviendas, float v, float v1, int habitaciones, String aTrue, int antiguedad, String nuevo, String descripcion) {
    }

    public Inmueble(Long id, String direccion, String tipo, Double precio, Double metrosCuadrados, Integer habitaciones, Boolean tieneGaraje, Integer antiguedad, String estado, String descripcion) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
        this.precio = precio;
        this.metrosCuadrados = metrosCuadrados;
        this.habitaciones = habitaciones;
        this.tieneGaraje = tieneGaraje;
        this.antiguedad = antiguedad;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public Inmueble() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Boolean getTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(Boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", metrosCuadrados=" + metrosCuadrados +
                ", habitaciones=" + habitaciones +
                ", tieneGaraje=" + tieneGaraje +
                ", antiguedad=" + antiguedad +
                ", estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
