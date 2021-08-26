/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estancias.entidades;

/**
 *
 * @author CELINA
 */
public class Casas {
    private int id;
    private String calle;
    private int numero;
    private int codigopostal;
    private String ciudad;
    private String pais;
    private int fecha_desde;
    private int fecha_hasta;
    private int tiempo_minimo;
    private int tiempo_maximo;
    private int precio_habitacion;
    private String tipo_vivienda;

    public Casas() {
    }

    public Casas(int id, String calle, int numero, int codigopostal, String ciudad, String pais, int fecha_desde, int fecha_hasta, int tiempo_minimo, int tiempo_maximo, int precio_habitacion, String tipo_vivienda) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.codigopostal = codigopostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(int fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public int getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(int fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(int tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public int getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(int precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public String toString() {
        return "Casas{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + ", codigopostal=" + codigopostal + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + ", tiempo_minimo=" + tiempo_minimo + ", tiempo_maximo=" + tiempo_maximo + ", precio_habitacion=" + precio_habitacion + ", tipo_vivienda=" + tipo_vivienda + '}';
    }

    

    
    
}
