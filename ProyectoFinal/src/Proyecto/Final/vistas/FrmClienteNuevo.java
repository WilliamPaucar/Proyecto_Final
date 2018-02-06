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
public class FrmClienteNuevo extends JInternalFrame{
    JLabel lblTitulo,lblId,lblNombres,lblApellidos,lblGenero,lblFecha_nac,lblTipo_doc,lblNum_doc,lblDireccion,lblTelefono,lblEmail;
    JTextField txtId,txtNombres,txtApellidos,txtFecha_nac,txtTipo_doc,txtNum_doc,txtDireccion,txtTelefono,txtEmail;
    JComboBox cmbGenero;
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmClienteNuevo(){
        this.setSize(400,600);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(10, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DATOS DEL CLIENTE");
                
        lblId= new JLabel("CODIGO:");
        lblNombres= new JLabel(" NOMBRE:");
        lblApellidos= new JLabel("APELLIDOS:");
        lblGenero=new JLabel("GENERO");
        lblFecha_nac=new JLabel("FECHA NACIMIENTO");
        lblTipo_doc=new JLabel("TIPO DE DOCUMENTO");
        lblNum_doc=new JLabel("NUMERO DE DOCUMENTO");
        lblDireccion=new JLabel("DIRECCION");
        lblTelefono=new JLabel("TELEFONO");
        lblEmail=new JLabel("EMAIL");
        
        txtId = new JTextField(2);
        txtNombres= new JTextField(2);
        txtApellidos= new JTextField(2);
        cmbGenero= new JComboBox(new String[]{"masculino","femenino"});        
        txtFecha_nac= new JTextField(2);
        txtTipo_doc= new JTextField(2);
        txtNum_doc= new JTextField(2);
        txtDireccion= new JTextField(2);
        txtTelefono= new JTextField(2);
        txtEmail= new JTextField(2);


        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblNombres);
        pnlCentral.add(txtNombres);
        pnlCentral.add(lblApellidos);
        pnlCentral.add(txtApellidos);
        pnlCentral.add(lblGenero);
        pnlCentral.add(cmbGenero);
        pnlCentral.add(lblFecha_nac);
        pnlCentral.add(txtFecha_nac);
        pnlCentral.add(lblTipo_doc);
        pnlCentral.add(txtTipo_doc);
        pnlCentral.add(lblNum_doc);
        pnlCentral.add(txtNum_doc);
        pnlCentral.add(lblDireccion);
        pnlCentral.add(txtDireccion);
        pnlCentral.add(lblTelefono);
        pnlCentral.add(txtTelefono);
        pnlCentral.add(lblEmail);
        pnlCentral.add(txtEmail);
        
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
            
            Cliente cliente = new Cliente();
            cliente.setIdcliente(Integer.parseInt(txtId.getText()));
            cliente.setNombres(txtNombres.getText());
            cliente.setApellidos(txtApellidos.getText());
            cliente.setSexo(cmbGenero.getSelectedIndex()==1 ? "m" : "f");
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
            cliente.setFecha_nacimiento(format.parse(txtFecha_nac.getText()));
            } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Error de fecha!!",
                "ERROR", JOptionPane.ERROR_MESSAGE);  
            }

            cliente.setTipo_documento(txtTipo_doc.getText());
            cliente.setNum_documento(txtNum_doc.getText());
            cliente.setDireccion(txtDireccion.getText());            
            cliente.setTelefono(txtTelefono.getText());
            cliente.setEmail(txtEmail.getText());
            ICliente clienteDao = new ClienteImpl();
            
            if(clienteDao.insertar(cliente)>0){
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

