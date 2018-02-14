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
public class FrmVentaNueva extends JInternalFrame{
    JLabel lblTitulo,lblId,lblCliente,lblVendedor,lblFecha,lblTipo_comprobante,lblSerie,lblCorrelativo,lblIgv;
    JTextField txtId,txtFecha,txtTipo_comprobante,txtSerie,txtCorrelativo,txtIgv;
    List<Cliente> lstproveedor;
    JComboBox<Cliente> cmbCliente;
    List<Vendedor> lstvendedor;
    JComboBox<Vendedor> cmbVendedor;
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmVentaNueva(){
        this.setSize(400,600); 
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(8, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DETALLE DE LA VENTA NUEVA");
                
        lblId= new JLabel("CODIGO:");
        lblCliente= new JLabel("ID CLIENTE:");
        lblVendedor= new JLabel("ID VENDEDOR:");
        lblFecha= new JLabel("FECHA:");
        lblTipo_comprobante= new JLabel("TIPO DE COMPROBANTE:");
        lblSerie= new JLabel("SERIE:");
        lblCorrelativo= new JLabel("CORRELATIVO:");
        lblIgv= new JLabel("IGV:");
        
        
        txtId = new JTextField(2);
        cargarClientees();  
        cmbCliente=new JComboBox(lstproveedor.toArray());
        cargarVendedores();  
        cmbVendedor=new JComboBox(lstvendedor.toArray());
        txtFecha = new JTextField(2);
        txtTipo_comprobante = new JTextField(2);
        txtSerie = new JTextField(2);
        txtCorrelativo = new JTextField(2);
        txtIgv = new JTextField(2);


        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblVendedor);
        pnlCentral.add(cmbVendedor);
        pnlCentral.add(lblCliente);
        pnlCentral.add(cmbCliente);
        pnlCentral.add(lblFecha);
        pnlCentral.add(txtFecha);
        pnlCentral.add(lblTipo_comprobante);
        pnlCentral.add(txtTipo_comprobante);
        pnlCentral.add(lblSerie);
        pnlCentral.add(txtSerie);
        pnlCentral.add(lblCorrelativo);
        pnlCentral.add(txtCorrelativo);
        pnlCentral.add(lblIgv);
        pnlCentral.add(txtIgv);

        
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
        FrmVentaNueva frmMenu= new FrmVentaNueva();
        frmMenu.setVisible(true);
    } 
    public void btnAceptarActionListener(ActionEvent e){
        
        try {
             
            Venta venta = new Venta();
            venta.setIdventa(Integer.parseInt(txtId.getText()));
            venta.setVendedor((Vendedor)cmbVendedor.getSelectedItem());            
            venta.setCliente((Cliente)cmbCliente.getSelectedItem());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
            venta.setFecha(format.parse(txtFecha.getText()));
            } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Error de fecha!!",
                "ERROR", JOptionPane.ERROR_MESSAGE);  
            }            
            venta.setTipo_coprobante(txtTipo_comprobante.getText());
            venta.setSerie(txtSerie.getText());
            venta.setCorrelativo(txtCorrelativo.getText());
            venta.setIgv(Float.parseFloat(txtIgv.getText()));

            IVenta ventaDao = new VentaImpl();
            
            if(ventaDao.insertar(venta)>0){
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
        public void cargarVendedores() {
        try {
       IVendedor ven=new VendedorImpl();
       lstvendedor=ven.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
        public void cargarClientees() {
        try {
       ICliente art=new ClienteImpl();
       lstproveedor=art.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
}