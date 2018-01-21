/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.rnegocio.entidades;

/**
 *
 * @author WILCXMAC
 */
public class Detalle_Venta {
    private int iddetalle_venta;
    private Venta venta;
    private int cantidad;
    private double precio_venta;
    private double descuento;

    public Detalle_Venta() {
    }

    public Detalle_Venta(int iddetalle_venta, Venta venta, int cantidad, double precio_venta, double descuento) {
        this.iddetalle_venta = iddetalle_venta;
        this.venta = venta;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getIddetalle_venta() {
        return iddetalle_venta;
    }

    public void setIddetalle_venta(int iddetalle_venta) {
        this.iddetalle_venta = iddetalle_venta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    
}
