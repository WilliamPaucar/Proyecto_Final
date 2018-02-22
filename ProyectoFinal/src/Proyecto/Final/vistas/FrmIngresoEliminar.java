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
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class FrmIngresoEliminar extends JInternalFrame{
    Ingreso ingreso = new Ingreso();
    IIngreso ingresoDao = new IngresoImpl();
    JLabel lblTitulo,lblId;
    JTextField txtId;
    JPanel pnlCentral;
    JTable tabla;
    JButton btnEliminar;
    JButton btnActualizar;
    
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmIngresoEliminar(){
    this.setSize(600,600);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Ingresos:");
    pnlCentral= new JPanel(new FlowLayout());
    lblId=new JLabel("ID: ");
    txtId= new JTextField(2);
    btnEliminar=new JButton("Eliminar");
    btnActualizar=new JButton("Actualizar");
    pnlCentral.add(lblId);
    pnlCentral.add(txtId);
    pnlCentral.add(btnEliminar);
    pnlCentral.add(btnActualizar);
    
    btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnEliminarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
            }
        });
    
    btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnActualizarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
            }
        });
    
    tabla = new JTable();
    jscTabla=new JScrollPane(tabla);
    this.add(lblTitulo,BorderLayout.NORTH);
    this.add(pnlCentral,BorderLayout.NORTH);
    this.add(jscTabla,BorderLayout.CENTER);
    cargarTabla();
    }
    
    private void btnEliminarActionListener(java.awt.event.ActionEvent e) throws Exception{                                            
        if (ingreso != null) {
            int respuesta = JOptionPane.YES_NO_CANCEL_OPTION;
            ingreso.setIdingreso(Integer.parseInt(txtId.getText()));
            respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro que desea Eliminar el Ingreso "
                    + ingreso.getIdingreso()+ " ?" + respuesta);
            if (respuesta == JOptionPane.YES_OPTION) {
                int numFilasAfectadas = ingresoDao.eliminar(ingreso);
                if (numFilasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Se Elimino!!");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar contiene llave foranea!!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo Eliminar!!");
            }
        }
    }
    
    private void btnActualizarActionListener(java.awt.event.ActionEvent e) throws Exception{                                            
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


