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
public class Kardex {
    private int idkardex;
    private Detalle_Ingreso detalle_ingreso;
    private Detalle_Venta detalle_venta;

    public Kardex() {
    }

    public Kardex(int idkardex, Detalle_Ingreso detalle_ingreso, Detalle_Venta detalle_venta) {
        this.idkardex = idkardex;
        this.detalle_ingreso = detalle_ingreso;
        this.detalle_venta = detalle_venta;
    }

    public Detalle_Venta getDetalle_venta() {
        return detalle_venta;
    }

    public void setDetalle_venta(Detalle_Venta detalle_venta) {
        this.detalle_venta = detalle_venta;
    }

    public int getIdkardex() {
        return idkardex;
    }

    public void setIdkardex(int idkardex) {
        this.idkardex = idkardex;
    }

    public Detalle_Ingreso getDetalle_ingreso() {
        return detalle_ingreso;
    }

    public void setDetalle_ingreso(Detalle_Ingreso detalle_ingreso) {
        this.detalle_ingreso = detalle_ingreso;
    }
    
}


