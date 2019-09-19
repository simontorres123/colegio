/*
SE INCLUYO id_anio
 */
package Modelo;

/**
 *
 * @author AARON ROMAN
 */
public class Asignatura {

    int id_a;
    String codigo;
    String nombre;
    Double minimo;
    Double maximo;
    String estatus;
    int id_anio;

    public Asignatura() {
    }

    public Asignatura(int id_a, String codigo, String nombre, Double minimo, Double maximo, String estatus, int id_anio) {
        this.id_a = id_a;
        this.codigo = codigo;
        this.nombre = nombre;
        this.minimo = minimo;
        this.maximo = maximo;
        this.estatus = estatus;
        this.id_anio = id_anio;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMinimo() {
        return minimo;
    }

    public void setMinimo(Double minimo) {
        this.minimo = minimo;
    }

    public Double getMaximo() {
        return maximo;
    }

    public void setMaximo(Double maximo) {
        this.maximo = maximo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    public int getId_anio() {
        return id_anio;
    }

    public void setId_anio(int id_anio) {
        this.id_anio = id_anio;
    }
}
