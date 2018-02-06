/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.vistas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author FABRICIO CONSTANTE
 */
public class FrmMenuPrincipal extends JFrame {

    JMenuBar mnbPrincipal;
    JMenu mnInicio;
    JMenuItem mniLogin;
    JMenuItem mniSalir;
    JDesktopPane dkpEscritorio;
        /*CATEGORIA */
    JMenu mnCategoria;
    JMenuItem mniNuevoCategoria;
    JMenuItem mniModificaCategoria;
    JMenuItem mniEliminaCategoria;
    JMenuItem mniBuscaCategoria;
    JMenuItem mniListaCategoria;
        /*ARTICULO */
    JMenu mnArticulo;
    JMenuItem mniNuevoArticulo;
    JMenuItem mniModificaArticulo;
    JMenuItem mniEliminaArticulo;
    JMenuItem mniBuscaArticulo;
    JMenuItem mniListaArticulo;
        /*CLIENTE */
    JMenu mnCliente;
    JMenuItem mniNuevoCliente;
    JMenuItem mniModificaCliente;
    JMenuItem mniEliminaCliente;
    JMenuItem mniBuscaCliente;
    JMenuItem mniListaCliente;
        /*DETALLE INGRESO */
    JMenu mnDetalle_Ingreso;
    JMenuItem mniNuevoDetalle_Ingreso;
    JMenuItem mniModificaDetalle_Ingreso;
    JMenuItem mniEliminaDetalle_Ingreso;
    JMenuItem mniBuscaDetalle_Ingreso;
    JMenuItem mniListaDetalle_Ingreso;

    public FrmMenuPrincipal() {
        dkpEscritorio= new JDesktopPane();
        dkpEscritorio.setBackground(Color.getHSBColor(10,200,200).brighter());
        
        mnbPrincipal = new JMenuBar();
        
        mnInicio = new JMenu("INICIO");
        mnInicio.setForeground(Color.BLUE);
        mniLogin = new JMenuItem("INICIAR SESION");
        mniSalir = new JMenuItem("SALIR");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        /*CATEGORIA*/
        mnCategoria= new JMenu("CATEGORIA");
        mnCategoria.setForeground(Color.blue);
        mniNuevoCategoria= new JMenuItem("NUEVO");
             
        mniNuevoCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoCategoriaActionPerformed(e);
            }
        });
        
        mniModificaCategoria= new JMenuItem("MODIFICAR");
        mniEliminaCategoria= new JMenuItem("ELIMINAR");
        mniBuscaCategoria= new JMenuItem("BUSCAR");
        mniListaCategoria= new JMenuItem("LISTAR");  

        mnCategoria.add(mniNuevoCategoria);
        mnCategoria.addSeparator();
        mnCategoria.add(mniModificaCategoria);
        mnCategoria.addSeparator();
        mnCategoria.add(mniEliminaCategoria);
        mnCategoria.addSeparator();
        mnCategoria.add(mniBuscaCategoria);
        mnCategoria.addSeparator();
        mnCategoria.add(mniListaCategoria);   
        /*ARTICULO*/
        mnArticulo= new JMenu("ARTICULO");
        mnArticulo.setForeground(Color.blue);
        mniNuevoArticulo= new JMenuItem("NUEVO");
             
        mniNuevoArticulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoArticuloActionPerformed(e);
            }
        });
        
        mniModificaArticulo= new JMenuItem("MODIFICAR");
        mniEliminaArticulo= new JMenuItem("ELIMINAR");
        mniBuscaArticulo= new JMenuItem("BUSCAR");
        mniListaArticulo= new JMenuItem("LISTAR");  

        mnArticulo.add(mniNuevoArticulo);
        mnArticulo.addSeparator();
        mnArticulo.add(mniModificaArticulo);
        mnArticulo.addSeparator();
        mnArticulo.add(mniEliminaArticulo);
        mnArticulo.addSeparator();
        mnArticulo.add(mniBuscaArticulo);
        mnArticulo.addSeparator();
        mnArticulo.add(mniListaArticulo);   
        /*CLIENTE*/
        mnCliente= new JMenu("CLIENTE");
        mnCliente.setForeground(Color.blue);
        mniNuevoCliente= new JMenuItem("NUEVO");
             
        mniNuevoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoClienteActionPerformed(e);
            }
        });
        
        mniModificaCliente= new JMenuItem("MODIFICAR");
        mniEliminaCliente= new JMenuItem("ELIMINAR");
        mniBuscaCliente= new JMenuItem("BUSCAR");
        mniListaCliente= new JMenuItem("LISTAR");  

        mnCliente.add(mniNuevoCliente);
        mnCliente.addSeparator();
        mnCliente.add(mniModificaCliente);
        mnCliente.addSeparator();
        mnCliente.add(mniEliminaCliente);
        mnCliente.addSeparator();
        mnCliente.add(mniBuscaCliente);
        mnCliente.addSeparator();
        mnCliente.add(mniListaCliente);   
        
        /*DETALLE INGRESO*/
        mnDetalle_Ingreso= new JMenu("DETALLE INGRESO");
        mnDetalle_Ingreso.setForeground(Color.blue);
        mniNuevoDetalle_Ingreso= new JMenuItem("NUEVO");
             
        mniNuevoDetalle_Ingreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoDetalle_IngresoActionPerformed(e);
            }
        });
        
        mniModificaDetalle_Ingreso= new JMenuItem("MODIFICAR");
        mniEliminaDetalle_Ingreso= new JMenuItem("ELIMINAR");
        mniBuscaDetalle_Ingreso= new JMenuItem("BUSCAR");
        mniListaDetalle_Ingreso= new JMenuItem("LISTAR");  

        mnDetalle_Ingreso.add(mniNuevoDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniModificaDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniEliminaDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniBuscaDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniListaDetalle_Ingreso);   
        
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnCategoria);
        mnbPrincipal.add(mnArticulo);
        mnbPrincipal.add(mnCliente);
        mnbPrincipal.add(mnDetalle_Ingreso);

        mnbPrincipal.setBackground(Color.lightGray);
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);

        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH); //Para maximizar
     
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Para terminar el programa
             
    }

    public void mniNuevoCategoriaActionPerformed(ActionEvent e){
        FrmCategoriaNueva frm = new FrmCategoriaNueva();
        
        dkpEscritorio.add(frm,BorderLayout.WEST);
      
        frm.setVisible(true);
    }   
    public void mniNuevoArticuloActionPerformed(ActionEvent e){
        FrmArticuloNuevo frm = new FrmArticuloNuevo();
        
        dkpEscritorio.add(frm,BorderLayout.WEST);
      
        frm.setVisible(true);
    }   
    public void mniNuevoClienteActionPerformed(ActionEvent e){
        FrmClienteNuevo frm = new FrmClienteNuevo();
        
        dkpEscritorio.add(frm,BorderLayout.WEST);
      
        frm.setVisible(true);
    }   
    public void mniNuevoDetalle_IngresoActionPerformed(ActionEvent e){
        FrmDetalle_IngresoNuevo frm = new FrmDetalle_IngresoNuevo();
        
        dkpEscritorio.add(frm,BorderLayout.WEST);
      
        frm.setVisible(true);
    }   
        public static void main(String[] args) {
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);
    }
}