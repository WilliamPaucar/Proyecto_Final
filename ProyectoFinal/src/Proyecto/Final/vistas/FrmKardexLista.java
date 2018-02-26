/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.vistas;

import Proyecto.Final.Impl.KardexImpl;
import Proyecto.Final.dao.Ikardex;
import Proyecto.Final.rnegocio.entidades.kardex;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUNIOR CHAVEZ
 */
public class FrmKardexLista extends JInternalFrame{
     JLabel lblTitulo;
    JTable tabla;
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmKardexLista(){
    this.setSize(840,650);
    this.setLayout(new BorderLayout());
  
    lblTitulo=new JLabel("                                                  |                                  ENTRADAS                    |                                SALIDAS                        |                              EXISTENCIAS                   ");
    tabla = new JTable();
    jscTabla=new JScrollPane(tabla);
    this.add(lblTitulo,BorderLayout.NORTH);
    this.add(jscTabla,BorderLayout.CENTER);
    cargarTabla();
    }
    public void cargarTabla(){
       
        modelo = new DefaultTableModel();
       
        modelo.addColumn("  FECHA     ");
        modelo.addColumn("DETALLE    ");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("V. UNITARIO");
        modelo.addColumn("V. TOTAL");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("V. UNITARIO");
        modelo.addColumn("V. TOTAL");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("V. UNITARIO");
        modelo.addColumn("V. TOTAL");

        
        List<kardex> lista = new ArrayList<>();
        try {
            Ikardex ingresoDao= new KardexImpl();
            lista = ingresoDao.obtener();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this,e.getMessage(),"ERROR"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        
        for(kardex est:lista){
            modelo.addRow(new Object[]{});
      
            
        }
        tabla.setModel(modelo);
    }

}
