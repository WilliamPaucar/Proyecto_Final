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


public class FrmIngresoLista extends JInternalFrame{
    JLabel lblTitulo;
    JTable tabla;
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmIngresoLista(){
    this.setSize(800,600);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Ingresos registrados");
    tabla = new JTable();
    jscTabla=new JScrollPane(tabla);
    this.add(lblTitulo,BorderLayout.NORTH);
    this.add(jscTabla,BorderLayout.CENTER);
    cargarTabla();
    }
    public void cargarTabla(){
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Ingreso");
        modelo.addColumn("Id Vendedor");
        modelo.addColumn("Id Proveedor");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tipo Comprobante");
        modelo.addColumn("Serie");
        modelo.addColumn("Correlativo");
        modelo.addColumn("IGV");
        
        List<Ingreso> lista = new ArrayList<>();
        try {
            IIngreso ingresoDao= new IngresoImpl();
            lista = ingresoDao.obtener();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this,e.getMessage(),"ERROR"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
        for(Ingreso est:lista){
            modelo.addRow(new Object[]{est.getIdingreso(),est.getVendedor().getNumero_documento(),est.getProveedor().getSector_comercial(),est.getFecha(),est.getTipo_comprobante(),est.getSerie(),est.getCorrelativo(),est.getIgv(),toString()});
        }
        tabla.setModel(modelo);
    }
}