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


public class FrmProveedorEliminar extends JInternalFrame{
    Proveedor proveedor = new Proveedor();
    IProveedor proveedorDao = new ProveedorImpl();
    JLabel lblTitulo,lblId;
    JTextField txtId;
    JPanel pnlCentral;
    JTable tabla;
    JButton btnEliminar;
    JButton btnActualizar;
    
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmProveedorEliminar(){
    this.setSize(600,900);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Proveedores Ingresados");
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
        if (proveedor != null) {
            int respuesta = JOptionPane.YES_NO_CANCEL_OPTION;
            proveedor.setIdproveedor(Integer.parseInt(txtId.getText()));
            respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro que desea Eliminar al Cliente "
                    + proveedor.getIdproveedor()+ " ?" + respuesta);
            if (respuesta == JOptionPane.YES_OPTION) {
                int numFilasAfectadas = proveedorDao.eliminar(proveedor);
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
        modelo.addColumn("");

   
        modelo.addRow(new Object[]{"ID","RAZON SOCIAL","SECTOR COMERCIAL","TIPO DOCUMENTO","NUMERO DOCUMENTO","DIRECCION","TELEFONO","EMAIL",
        "URL"});
        
        List<Proveedor> list = new ArrayList<>();
        try {
            IProveedor proveedorDao= new ProveedorImpl();
            list = proveedorDao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        for(Proveedor vent : list){
            modelo.addRow(new Object[]{vent.getIdproveedor(),vent.getRazon_social(),vent.getSector_comercial(),vent.getTipo_documento(),
                vent.getNum_documento(),vent.getDireccion(),vent.getTelefono()
            ,vent.getEmail(),vent.getUrl()});
        }
        tabla.setModel(modelo);
    }
}


