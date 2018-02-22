/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.rnegocio.entidades;

import java.util.Date;

/**
 *
 * @author WILCXMAC
 */
public class Ingreso {

    private int idingreso;
    private Vendedor vendedor;
    private Proveedor proveedor;
    private Date fecha;
    private String tipo_comprobante;
    private String serie;
    private String correlativo;
    private float igv;

    public Ingreso() {
    }

    public Ingreso(int idingreso, Vendedor vendedor, Proveedor proveedor, Date fecha, String tipo_comporbante, String serie, String correlativo, float igv) {
        this.idingreso = idingreso;
        this.vendedor = vendedor;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.tipo_comprobante = tipo_comporbante;
        this.serie = serie;
        this.correlativo = correlativo;
        this.igv = igv;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    @Override
    public String toString() {
        return serie;
    }
    
    
}
