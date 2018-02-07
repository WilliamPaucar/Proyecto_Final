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
public class FrmKardexNuevo extends JInternalFrame{
    JLabel lblTitulo,lblId,lblDetalle_Ingreso,lblDetalle_Venta;
    JTextField txtId;
    List<Detalle_Ingreso> lstdetalle_ingreso;
    JComboBox<Detalle_Ingreso> cmbDetalle_Ingreso;
    List<Detalle_Venta> lstdetalle_venta;
    JComboBox<Detalle_Venta> cmbDetalle_Venta;
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmKardexNuevo(){
        this.setSize(400,600);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(9, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DETALLE DEL NUEVO INGRESO");
                
        lblId= new JLabel("CODIGO:");
        lblDetalle_Ingreso= new JLabel("DETALLE INGRESO:");
        lblDetalle_Venta= new JLabel("DETALLE VENTA:");
        
        txtId = new JTextField(2);
        cargarDetalle_Ingresoes();  
        cmbDetalle_Ingreso=new JComboBox(lstdetalle_ingreso.toArray());
        cargarDetalle_Ventaes();  
        cmbDetalle_Venta=new JComboBox(lstdetalle_venta.toArray());

        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblDetalle_Ingreso);
        pnlCentral.add(cmbDetalle_Ingreso);
        pnlCentral.add(lblDetalle_Venta);
        pnlCentral.add(cmbDetalle_Venta);
        
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
        FrmKardexNuevo frmMenu= new FrmKardexNuevo();
        frmMenu.setVisible(true);
    } 
    public void btnAceptarActionListener(ActionEvent e){
        
        try {
             
            kardex kardex = new kardex();
            kardex.setIdkardex(Integer.parseInt(txtId.getText()));
            kardex.setDetalle_ingreso((Detalle_Ingreso)cmbDetalle_Ingreso.getSelectedItem());            
            kardex.setDetalle_venta((Detalle_Venta)cmbDetalle_Venta.getSelectedItem());
            
            Ikardex kardexDao = new KardexImpl();
            
            if(kardexDao.insertar(kardex)>0){
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
        public void cargarDetalle_Ingresoes() {
        try {
       IDetalle_Ingreso detin=new Detalle_IngresoImpl();
       lstdetalle_ingreso=detin.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
        public void cargarDetalle_Ventaes() {
        try {
            IDetalleVenta detve = new Detalle_VentaImpl();
            lstdetalle_venta=detve.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
}