/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.vistas;
import Proyecto.Final.Impl.*;
import Proyecto.Final.rnegocio.entidades.*;
import Proyecto.Final.accesodatos.*;
import Proyecto.Final.dao.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class FrmDetalle_VentaLista extends JInternalFrame{
    JLabel lblTitulo;
    JTable tabla;
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmDetalle_VentaLista(){
    this.setSize(600,500);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Detalle_Ventas Ingresadas");
    tabla = new JTable();
    jscTabla=new JScrollPane(tabla);
    this.add(lblTitulo,BorderLayout.NORTH);
    this.add(jscTabla,BorderLayout.CENTER);
    cargarTabla();
    }
    public void cargarTabla(){
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Detalle_Venta");
        modelo.addColumn("Venta");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Descuento");
        
        List<Detalle_Venta> lista = new ArrayList<>();
        try {
            IDetalleVenta detalle_ventaDao= new Detalle_VentaImpl();
            lista = detalle_ventaDao.obtener();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this,e.getMessage(),"ERROR"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
        for(Detalle_Venta est:lista){
            modelo.addRow(new Object[]{est.getIddetalle_venta(),est.getVenta().getIdventa(),est.getCantidad(),est.getPrecio_venta(),est.getDescuento()});
        }
        tabla.setModel(modelo);
    }
}

