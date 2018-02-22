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


public class FrmVentaEliminar extends JInternalFrame{
    Venta venta = new Venta();
    IVenta ventaDao = new VentaImpl();
    JLabel lblTitulo,lblId;
    JTextField txtId;
    JPanel pnlCentral;
    JTable tabla;
    JButton btnEliminar;
    JButton btnActualizar;
    
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmVentaEliminar(){
    this.setSize(600,900);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Ventaes Ingresados");
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
        if (venta != null) {
            int respuesta = JOptionPane.YES_NO_CANCEL_OPTION;
            venta.setIdventa(Integer.parseInt(txtId.getText()));
            respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro que desea Eliminar al Cliente "
                    + venta.getIdventa()+ " ?" + respuesta);
            if (respuesta == JOptionPane.YES_OPTION) {
                int numFilasAfectadas = ventaDao.eliminar(venta);
                if (numFilasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Se Elimino!!");
                } else {
                    JOptionPane.showMessageDialog(this, "No Elimino!!");
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
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
   
        modelo.addRow(new Object[]{"ID","COD_CLENTE","COD_VENDEDOR","FECHA","TIPO DE COMPROBANTE","SERIE","CORRELATIVO",
        "IGV"});
        
        List<Venta> list = new ArrayList<>();
        try {
            IVenta ventaDao= new VentaImpl();
            list = ventaDao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        for(Venta vent : list){
            modelo.addRow(new Object[]{vent.getIdventa(),vent.getCliente(),vent.getVendedor(),vent.getFecha(),
                vent.getTipo_coprobante(),vent.getSerie(),vent.getCorrelativo(),vent.getIgv()});
        }
        tabla.setModel(modelo);
    }
}



