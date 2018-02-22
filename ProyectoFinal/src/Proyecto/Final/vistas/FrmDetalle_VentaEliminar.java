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


public class FrmDetalle_VentaEliminar extends JInternalFrame{
    Detalle_Venta detalle_venta = new Detalle_Venta();
    IDetalleVenta detalle_ventaDao = new Detalle_VentaImpl();
    JLabel lblTitulo,lblId;
    JTextField txtId;
    JPanel pnlCentral;
    JTable tabla;
    JButton btnEliminar;
    JButton btnActualizar;
    
    JScrollPane jscTabla;
    DefaultTableModel modelo;
    public FrmDetalle_VentaEliminar(){
    this.setSize(600,900);
    this.setLayout(new BorderLayout());
    this.setClosable(true);
    lblTitulo=new JLabel("Detalle_Ventaes Ingresados");
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
        if (detalle_venta != null) {
            int respuesta = JOptionPane.YES_NO_CANCEL_OPTION;
            detalle_venta.setIddetalle_venta(Integer.parseInt(txtId.getText()));
            respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro que desea Eliminar al Cliente "
                    + detalle_venta.getIddetalle_venta()+ " ?" + respuesta);
            if (respuesta == JOptionPane.YES_OPTION) {
                int numFilasAfectadas = detalle_ventaDao.eliminar(detalle_venta);
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



