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
public class FrmVentaLista extends JInternalFrame{
    
    JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;
    public FrmVentaLista(){
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
