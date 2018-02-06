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
import javax.swing.*;
/**
 *
 * @author FABRICIO CONSTANTE
 */
public class FrmCategoriaNueva extends JInternalFrame{
    JLabel lblTitulo,lblId,lblNombre,lblDescripcion;
    JTextField txtId,txtNombre,txtDescripcion;
    
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
    public FrmCategoriaNueva(){
        this.setSize(300,200);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(3, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DATOS DE LA CATEGORÍA");
                
        lblId= new JLabel("CODIGO:");
        lblNombre= new JLabel(" NOMBRE:");
        lblDescripcion= new JLabel("DESCRIPCION:");
        
        txtId = new JTextField(2);
        txtNombre= new JTextField(2);
        txtDescripcion= new JTextField(2);
        
        btnAceptar= new JButton("Aceptar");
        btnLimpiar= new JButton("Limpiar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblNombre);
        pnlCentral.add(txtNombre);
        pnlCentral.add(lblDescripcion);
        pnlCentral.add(txtDescripcion);
        
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
        pnlCentral.setBackground(Color.getHSBColor(100,60,270).brighter());
        this.add(pnlSuperior, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlInferior, BorderLayout.SOUTH);  
        this.setClosable(true); 
    }
        public static void main(String[] args) {
        FrmCategoriaNueva frmMenu= new FrmCategoriaNueva();
        frmMenu.setVisible(true);
    } 
            public void btnAceptarActionListener(ActionEvent e){
        
        try {
            
            Categoria categoria = new Categoria();
            categoria.setIdcategoria(Integer.parseInt(txtId.getText()));
            categoria.setNombre(txtNombre.getText());
            categoria.setDescripcion(txtDescripcion.getText());

            ICategoria categoriaDao = new CategoriaImpl();
            
            if(categoriaDao.insertar(categoria)>0){
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
}}

