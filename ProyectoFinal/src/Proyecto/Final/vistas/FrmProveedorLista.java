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
/**
 *
 * @author WILCXMAC
 */
public class FrmProveedorLista extends JInternalFrame{

  JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;

    public FrmProveedorLista() {
    
   
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        this.setBackground(Color.getHSBColor(100,60,270).brighter());
        lblTitulo=new JLabel("VENTAS REGISTRADAS ");
        tabla= new JTable();
        this.add(lblTitulo,BorderLayout.NORTH);
        this.add(tabla,BorderLayout.NORTH);
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
