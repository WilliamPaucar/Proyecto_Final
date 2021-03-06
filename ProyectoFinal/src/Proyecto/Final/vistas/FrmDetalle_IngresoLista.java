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


public class FrmDetalle_IngresoLista extends JInternalFrame{
    JLabel lblTitulo;
    JTable tabla;
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmDetalle_IngresoLista(){
    this.setSize(853,600);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Detalle Ingresos");
    tabla = new JTable();
    jscTabla=new JScrollPane(tabla);
    this.add(lblTitulo,BorderLayout.NORTH);
    this.add(jscTabla,BorderLayout.CENTER);
    cargarTabla();
    }
    public void cargarTabla(){
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Detalle_Ingreso");
        modelo.addColumn("Ingreso");
        modelo.addColumn("Articulo");
        modelo.addColumn("Precio de compra");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Stock Inicial");
        modelo.addColumn("Stock Actual");
        modelo.addColumn("Fecha produccion ");
        modelo.addColumn("fecha de vencimiento");
        
        List<Detalle_Ingreso> lista = new ArrayList<>();
        try {
            IDetalle_Ingreso detalle_ingresoDao= new Detalle_IngresoImpl();
            lista = detalle_ingresoDao.obtener();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this,e.getMessage(),"ERROR"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
        for(Detalle_Ingreso est:lista){
            modelo.addRow(new Object[]{est.getIddetalle_ingreso(),est.getIngreso().getIdingreso(),est.getArticulo().getIdarticulo(),est.getPrecio_compra()
                    ,est.getPrecio_venta(),est.getStock_inicial(),est.getStock_actual(),est.getFecha_produccion(),est.getFecha_vencimiento()});
        }
        tabla.setModel(modelo);
    }
}

