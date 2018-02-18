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
public class FrmVendedorNuevo extends JInternalFrame{
    JLabel lblTitulo,lblId,lblNombres,lblApellidos,lblAcceso,lblDireccion,lblTelefono,lblEmail,lblUsuario,lblNumDoc,lblPassword;
    JTextField txtId,txtNombres,txtApellidos,txtAcceso,txtDireccion,txtTelefono,txtEmail,txtUsuario,txtNumDoc,txtPassword;
    JLabel lblSexo,lblFechaNac;
    JTextField txtFecha;
    JComboBox cmbSexo;    
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmVendedorNuevo(){
        this.setSize(400,600);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 2, 5, 5));
        pnlCentral.setLayout(new GridLayout(12, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DETALLE DEL NUEVO VENDEDOR");
                
        lblId= new JLabel("CODIGO:");
        lblNombres= new JLabel("NOMBRES:");
        lblApellidos= new JLabel("APELLIDOS:");
        lblSexo= new JLabel("GENERO");
        lblFechaNac= new JLabel("FECHA NACIMIENTO:");        
        lblAcceso= new JLabel("ACCESO:");
        lblNumDoc= new JLabel("NÚMERO DE DOCUMENTO:");
        lblDireccion= new JLabel("DIRECCIÓN:");
        lblTelefono= new JLabel("TELEFONO:");
        lblEmail= new JLabel("EMAIL:");
        lblUsuario= new JLabel("USUARIO:");
        lblPassword= new JLabel("PASSWORD:");
        
        
        txtId = new JTextField(2);
        txtNombres = new JTextField(2);
        txtApellidos = new JTextField(2);
        cmbSexo= new JComboBox(new String[]{"masculino","femenino"});
        txtFecha = new JTextField(2);
        txtAcceso = new JTextField(2);
        txtNumDoc = new JTextField(2);
        txtDireccion = new JTextField(2);
        txtTelefono = new JTextField(2);
        txtEmail = new JTextField(2);
        txtUsuario = new JTextField(2);
        txtPassword=new JTextField(2);


        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblNombres);
        pnlCentral.add(txtNombres);
        pnlCentral.add(lblApellidos);
        pnlCentral.add(txtApellidos);
        pnlCentral.add(lblSexo);
        pnlCentral.add(cmbSexo);
        pnlCentral.add(lblFechaNac);
        pnlCentral.add(txtFecha);
        pnlCentral.add(lblAcceso);
        pnlCentral.add(txtAcceso);
        pnlCentral.add(lblNumDoc);
        pnlCentral.add(txtNumDoc);
        pnlCentral.add(lblDireccion);
        pnlCentral.add(txtDireccion);
        pnlCentral.add(lblTelefono);
        pnlCentral.add(txtTelefono);
        pnlCentral.add(lblEmail);
        pnlCentral.add(txtEmail);
        pnlCentral.add(lblUsuario);
        pnlCentral.add(txtUsuario);
        pnlCentral.add(lblPassword);
        pnlCentral.add(txtPassword);

        
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
        FrmVendedorNuevo frmMenu= new FrmVendedorNuevo();
        frmMenu.setVisible(true);
    } 
    public void btnAceptarActionListener(ActionEvent e){
        
        try {
             
            Vendedor vendedor = new Vendedor();
            vendedor.setIdvendedor(Integer.parseInt(txtId.getText()));
            vendedor.setNombres(txtNombres.getText());
            vendedor.setApellidos(txtApellidos.getText());
            vendedor.setSexo(cmbSexo.getSelectedIndex()==0?"m":"f");            
            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            try {
                vendedor.setFecha_nacimiento(formatoFecha.parse(txtFecha.getText()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Error en la fecah!!",
                "Error", JOptionPane.ERROR_MESSAGE);
            }
            vendedor.setNumero_documento(txtNumDoc.getText());
            vendedor.setDireccion(txtDireccion.getText());
            vendedor.setTelefono(txtTelefono.getText());
            vendedor.setEmail(txtEmail.getText());
            vendedor.setAcceso(txtAcceso.getText());
            vendedor.setUsuario(txtUsuario.getText());
            vendedor.setPassword(txtPassword.getText());

            IVendedor vendedorDao = new VendedorImpl();
            
            if(vendedorDao.insertar(vendedor)>0){
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