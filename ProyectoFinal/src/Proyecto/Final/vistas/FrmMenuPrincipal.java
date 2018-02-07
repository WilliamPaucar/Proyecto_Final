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
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

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
    /*DETALLE VENTA */
    JMenu mnDetalleVenta;
    JMenuItem mniNuevoDetalleVenta;
    JMenuItem mniModificaDetalleVenta;
    JMenuItem mniEliminaDetalleVenta;
    JMenuItem mniBuscaDetalleVenta;
    JMenuItem mniListaDetalleVenta;
    /*INGRESO */
    JMenu mnIngreso;
    JMenuItem mniNuevoIngreso;
    JMenuItem mniModificaIngreso;
    JMenuItem mniEliminaIngreso;
    JMenuItem mniBuscaIngreso;
    JMenuItem mniListaIngreso;

    public FrmMenuPrincipal() {
        dkpEscritorio = new JDesktopPane();
  

        mnbPrincipal = new JMenuBar();

        mnInicio = new JMenu("INICIO");
        mnInicio.setForeground(Color.GREEN);
        mniLogin = new JMenuItem("INICIAR SESION");
        mniSalir = new JMenuItem("SALIR");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        /*CATEGORIA*/
        
        mnCategoria = new JMenu("CATEGORIA");
        mnCategoria.setForeground(Color.GREEN);
        mniNuevoCategoria = new JMenuItem("NUEVO");

        mniNuevoCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoCategoriaActionPerformed(e);
            }
        });

        mniModificaCategoria = new JMenuItem("MODIFICAR");
        mniEliminaCategoria = new JMenuItem("ELIMINAR");
        mniBuscaCategoria = new JMenuItem("BUSCAR");
        mniListaCategoria = new JMenuItem("LISTAR");

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
        mnArticulo = new JMenu("ARTICULO");
        mnArticulo.setForeground(Color.GREEN);
        mniNuevoArticulo = new JMenuItem("NUEVO");

        mniNuevoArticulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoArticuloActionPerformed(e);
            }
        });

        mniModificaArticulo = new JMenuItem("MODIFICAR");
        mniEliminaArticulo = new JMenuItem("ELIMINAR");
        mniBuscaArticulo = new JMenuItem("BUSCAR");
        mniListaArticulo = new JMenuItem("LISTAR");

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
        mnCliente = new JMenu("CLIENTE");
        mnCliente.setForeground(Color.GREEN);
        mniNuevoCliente = new JMenuItem("NUEVO");

        mniNuevoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoClienteActionPerformed(e);
            }
        });

        mniModificaCliente = new JMenuItem("MODIFICAR");
        mniEliminaCliente = new JMenuItem("ELIMINAR");
        mniBuscaCliente = new JMenuItem("BUSCAR");
        mniListaCliente = new JMenuItem("LISTAR");

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
        mnDetalle_Ingreso = new JMenu("DETALLE INGRESO");
        mnDetalle_Ingreso.setForeground(Color.GREEN);

        mniNuevoDetalle_Ingreso = new JMenuItem("NUEVO");

        mniNuevoDetalle_Ingreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoDetalle_IngresoActionPerformed(e);
            }
        });

        mniModificaDetalle_Ingreso = new JMenuItem("MODIFICAR");
        mniEliminaDetalle_Ingreso = new JMenuItem("ELIMINAR");
        mniBuscaDetalle_Ingreso = new JMenuItem("BUSCAR");
        mniListaDetalle_Ingreso = new JMenuItem("LISTAR");

        mnDetalle_Ingreso.add(mniNuevoDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniModificaDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniEliminaDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniBuscaDetalle_Ingreso);
        mnDetalle_Ingreso.addSeparator();
        mnDetalle_Ingreso.add(mniListaDetalle_Ingreso);
        /*DETALLE VENTA*/
        mnDetalleVenta = new JMenu("DETALLE VENTA");
        mnDetalleVenta.setForeground(Color.GREEN);

        mniNuevoDetalleVenta = new JMenuItem("NUEVO");

        mniNuevoDetalleVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoDetalleVentaActionPerformed(e);
            }
        });

        mniModificaDetalleVenta = new JMenuItem("MODIFICAR");
        mniEliminaDetalleVenta = new JMenuItem("ELIMINAR");
        mniBuscaDetalleVenta = new JMenuItem("BUSCAR");
        mniListaDetalleVenta = new JMenuItem("LISTAR");

        mnDetalleVenta.add(mniNuevoDetalleVenta);
        mnDetalleVenta.addSeparator();
        mnDetalleVenta.add(mniModificaDetalleVenta);
        mnDetalleVenta.addSeparator();
        mnDetalleVenta.add(mniEliminaDetalleVenta);
        mnDetalleVenta.addSeparator();
        mnDetalleVenta.add(mniBuscaDetalleVenta);
        mnDetalleVenta.addSeparator();
        mnDetalleVenta.add(mniListaDetalleVenta);
        /*INGRESO*/
        mnIngreso = new JMenu("INGRESO");
        mnIngreso.setForeground(Color.GREEN);

        mniNuevoIngreso = new JMenuItem("NUEVO");

        mniNuevoIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoIngresoActionPerformed(e);
            }
        });

        mniModificaIngreso = new JMenuItem("MODIFICAR");
        mniEliminaIngreso = new JMenuItem("ELIMINAR");
        mniBuscaIngreso = new JMenuItem("BUSCAR");
        mniListaIngreso = new JMenuItem("LISTAR");

        mnIngreso.add(mniNuevoIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniModificaIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniEliminaIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniBuscaIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniListaIngreso);

        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnCategoria);
        mnbPrincipal.add(mnArticulo);
        mnbPrincipal.add(mnCliente);
        mnbPrincipal.add(mnDetalle_Ingreso);
        mnbPrincipal.add(mnDetalleVenta);
        mnbPrincipal.add(mnIngreso);

        mnbPrincipal.setBackground(Color.lightGray);
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);

        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH); //Para maximizar
        //this.setDefaultLookAndFeelDecorated(true);
        this.setBounds(0, 0, 500, 450);
        //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Para terminar el programa

    }

    public void mniNuevoCategoriaActionPerformed(ActionEvent e) {
        FrmCategoriaNueva frm = new FrmCategoriaNueva();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public void mniNuevoArticuloActionPerformed(ActionEvent e) {
        FrmArticuloNuevo frm = new FrmArticuloNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public void mniNuevoClienteActionPerformed(ActionEvent e) {
        FrmClienteNuevo frm = new FrmClienteNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public void mniNuevoDetalle_IngresoActionPerformed(ActionEvent e) {
        FrmDetalle_IngresoNuevo frm = new FrmDetalle_IngresoNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public void mniNuevoDetalleVentaActionPerformed(ActionEvent e) {
        FrmDetalle_VentaNueva frm = new FrmDetalle_VentaNueva();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public void mniNuevoIngresoActionPerformed(ActionEvent e) {
        FrmIngresoNuevo frm = new FrmIngresoNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo) 
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.GreenMagicSkin"); // Setencia que aplica el skin Creme de Substance
        SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("C:\\Users\\Usuario\\Desktop\\Proyecto_Final\\ProyectoFinal\\Images\\cfdi-33slide.jpg"));
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.8));//valor aproximado de la opacidad por default de imageWatermark
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);

    }
}
