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
public class FrmProveedorNuevo extends JInternalFrame{
    JLabel lblTitulo,lblId,lblRazonSoc,lblSectorCom,lblTipoDoc,lblNumDoc,lblDireccion,lblTelefono,lblEmail,lblUrl;
    JTextField txtId,txtRazonSoc,txtSectorCom,txtTipoDoc,txtNumDoc,txtDireccion,txtTelefono,txtEmail,txtUrl;
    
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmProveedorNuevo(){
        this.setSize(400,700);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(9, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DETALLE DEL NUEVO PROVEEDOR");
                
        lblId= new JLabel("CODIGO:");
        lblRazonSoc= new JLabel("RAZÓN SOCIAL:");
        lblSectorCom= new JLabel("SECTOR COMERCIAL:");
        lblTipoDoc= new JLabel("TIPO DE DOCUMENTO:");
        lblNumDoc= new JLabel("NÚMERO DE DOCUMENTO:");
        lblDireccion= new JLabel("DIRECCIÓN:");
        lblTelefono= new JLabel("TELEFONO:");
        lblEmail= new JLabel("EMAIL:");
        lblUrl= new JLabel("URL:");
        
        
        txtId = new JTextField(2);
        txtRazonSoc = new JTextField(2);
        txtSectorCom = new JTextField(2);
        txtTipoDoc = new JTextField(2);
        txtNumDoc = new JTextField(2);
        txtDireccion = new JTextField(2);
        txtTelefono = new JTextField(2);
        txtEmail = new JTextField(2);
        txtUrl = new JTextField(2);


        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblRazonSoc);
        pnlCentral.add(txtRazonSoc);
        pnlCentral.add(lblSectorCom);
        pnlCentral.add(txtSectorCom);
        pnlCentral.add(lblTipoDoc);
        pnlCentral.add(txtTipoDoc);
        pnlCentral.add(lblNumDoc);
        pnlCentral.add(txtNumDoc);
        pnlCentral.add(lblDireccion);
        pnlCentral.add(txtDireccion);
        pnlCentral.add(lblTelefono);
        pnlCentral.add(txtTelefono);
        pnlCentral.add(lblEmail);
        pnlCentral.add(txtEmail);
        pnlCentral.add(lblUrl);
        pnlCentral.add(txtUrl);

        
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
        FrmProveedorNuevo frmMenu= new FrmProveedorNuevo();
        frmMenu.setVisible(true);
    } 
    public void btnAceptarActionListener(ActionEvent e){
        
        try {
             
            Proveedor proveedor = new Proveedor();
            proveedor.setIdproveedor(Integer.parseInt(txtId.getText()));
            proveedor.setRazon_social(txtRazonSoc.getText());
            proveedor.setSector_comercial(txtSectorCom.getText());
            proveedor.setTipo_documento(txtTipoDoc.getText());
            proveedor.setNum_documento(txtNumDoc.getText());
            proveedor.setDireccion(txtDireccion.getText());
            proveedor.setTelefono(txtTelefono.getText());
            proveedor.setEmail(txtEmail.getText());
            proveedor.setUrl(txtUrl.getText());

            IProveedor proveedorDao = new ProveedorImpl();
            
            if(proveedorDao.insertar(proveedor)>0){
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
}