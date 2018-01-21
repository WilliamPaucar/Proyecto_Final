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
public class Detalle_Ingreso {
    private int iddetalle_ingreso;
    private Ingreso ingreso;
    private Articulo articulo;
    private double precio_compra;
   private double precio_venta;
    private int stock_inicial;
    private int stock_actual;
    private Date  fecha_produccion;
    private Date fecha_vencimiento;

    public Detalle_Ingreso() {
    }

    public Detalle_Ingreso(int iddetalle_ingreso, Ingreso ingreso, Articulo articulo, double precio_compra, double precio_venta, int stock_inicial, int stock_actual, Date fecha_produccion, Date fecha_vencimiento) {
        this.iddetalle_ingreso = iddetalle_ingreso;
        this.ingreso = ingreso;
        this.articulo = articulo;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.stock_inicial = stock_inicial;
        this.stock_actual = stock_actual;
        this.fecha_produccion = fecha_produccion;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getIddetalle_ingreso() {
        return iddetalle_ingreso;
    }

    public void setIddetalle_ingreso(int iddetalle_ingreso) {
        this.iddetalle_ingreso = iddetalle_ingreso;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock_inicial() {
        return stock_inicial;
    }

    public void setStock_inicial(int stock_inicial) {
        this.stock_inicial = stock_inicial;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int stock_actual) {
        this.stock_actual = stock_actual;
    }

    public Date getFecha_produccion() {
        return fecha_produccion;
    }

    public void setFecha_produccion(Date fecha_produccion) {
        this.fecha_produccion = fecha_produccion;
    }
    
    
}
