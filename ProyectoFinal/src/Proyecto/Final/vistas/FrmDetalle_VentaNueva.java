/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.vistas;
import Proyecto.Final.Impl.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author FABRICIO CONSTANTE
 */
public class FrmDetalle_VentaNueva extends JInternalFrame{
    JLabel lblTitulo,lblId,lblVenta,lblCantidad,lblPrecio_venta,lblDescuento;
    JTextField txtId,txtCantidad,txtPrecio_venta,txtDescuento;
    List<Venta> lstventa;
    JComboBox<Venta> cmbVenta;
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmDetalle_VentaNueva(){
        this.setSize(400,600);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(5, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DETALLE DEL NUEVA VENTA");
                
        lblId= new JLabel("CODIGO:");
        lblVenta= new JLabel("VENTA:");
        lblCantidad= new JLabel("CANTIDAD:");
        lblPrecio_venta= new JLabel("PRECIO DE VENTA:");
        lblDescuento= new JLabel("DESCUENTO:");
        
        txtId = new JTextField(2);
        cargarVentas();  
        cmbVenta=new JComboBox(lstventa.toArray());
        txtCantidad = new JTextField(2);
        txtPrecio_venta = new JTextField(2);
        txtDescuento = new JTextField(2);

        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);

        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnAceptarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
            }
        });
                      
        pnlInferior.add(btnLimpiar);
        pnlInferior.add(btnAceptar);
        pnlSuperior.setBackground(Color.getHSBColor(100,60,270).brighter());
        pnlCentral.setBackground(Color.getHSBColor(100,60,270).brighter());
        this.add(pnlSuperior, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlInferior, BorderLayout.SOUTH);  
        this.setClosable(true);
    }
        public static void main(String[] args) {
        FrmArticuloNuevo frmMenu= new FrmArticuloNuevo();
        frmMenu.setVisible(true);
    } 
    public void btnAceptarActionListener(ActionEvent e){
        
        try {
            
            Detalle_Venta detalleventa = new Detalle_Venta();
            detalleventa.setIddetalle_venta(Integer.parseInt(txtId.getText()));
            detalleventa.setVenta((Venta)cmbVenta.getSelectedItem());            
            detalleventa.setCantidad(Integer.parseInt(txtCantidad.getText()));
            detalleventa.setPrecio_venta(Double.parseDouble(txtPrecio_venta.getText()));
            detalleventa.setDescuento(Double.parseDouble(txtDescuento.getText()));
            IDetalle_Venta detalleventaDao = new Detalle_VentaImpl();
            
            if(detalleventaDao.insertar(detalleventa)>0){
                JOptionPane.showMessageDialog(this,"Registro Correcto!!",
                        "Transacción correcta",JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this,"Error de Guardado!!",
                "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
            
            
        } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Proceso incorrecto!!" + x.getMessage(),
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
        public void cargarVentas() {
        try {
       IVenta detalleventa=new VentaImpl();
       lstventa=detalleventa.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
}