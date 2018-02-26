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
public class Venta {
    private int idventa;
    private Cliente cliente;
    private Vendedor vendedor;
    private Articulo articulo;
    private Date fecha;
    private String tipo_coprobante;
    private String serie;
    private String correlativo;
    private float igv;

    public Venta() {
    }

    public Venta(int idventa, Cliente cliente, Vendedor vendedor, Articulo articulo, Date fecha, String tipo_coprobante, String serie, String correlativo, float igv) {
        this.idventa = idventa;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.articulo = articulo;
        this.fecha = fecha;
        this.tipo_coprobante = tipo_coprobante;
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

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo_coprobante() {
        return tipo_coprobante;
    }

    public void setTipo_coprobante(String tipo_coprobante) {
        this.tipo_coprobante = tipo_coprobante;
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

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
}
