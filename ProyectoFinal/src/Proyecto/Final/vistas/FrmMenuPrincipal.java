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
    /*KARDEX */
    JMenu mnKardex;
    JMenuItem mniNuevoKardex;
    JMenuItem mniModificaKardex;
    JMenuItem mniEliminaKardex;
    JMenuItem mniBuscaKardex;
    JMenuItem mniListaKardex;
    /*PROVEEDOR */
    JMenu mnProveedor;
    JMenuItem mniNuevoProveedor;
    JMenuItem mniModificaProveedor;
    JMenuItem mniEliminaProveedor;
    JMenuItem mniBuscaProveedor;
    JMenuItem mniListaProveedor;
    /*VENDEDOR */
    JMenu mnVendedor;
    JMenuItem mniNuevoVendedor;
    JMenuItem mniModificaVendedor;
    JMenuItem mniEliminaVendedor;
    JMenuItem mniBuscaVendedor;
    JMenuItem mniListaVendedor;
    /*VENTA */
    JMenu mnVenta;
    JMenuItem mniNuevoVenta;
    JMenuItem mniModificaVenta;
    JMenuItem mniEliminaVenta;
    JMenuItem mniBuscaVenta;
    JMenuItem mniListaVenta;

    public FrmMenuPrincipal() {
        dkpEscritorio = new JDesktopPane();

        mnbPrincipal = new JMenuBar();
        mnbPrincipal.setBackground(Color.getHSBColor(100, 102, 250).brighter());

        mnInicio = new JMenu("INICIO");
        mnInicio.setForeground(Color.WHITE);
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
        mnCategoria.setForeground(Color.WHITE);
        mniNuevoCategoria = new JMenuItem("NUEVO");

        mniNuevoCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoCategoriaActionPerformed(e);
            }
        });

        mniModificaCategoria = new JMenuItem("MODIFICAR");
        mniEliminaCategoria = new JMenuItem("ELIMINAR");
        
        mniEliminaCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaCategoriaActionPerformed(e);
            }
        });
        
        mniBuscaCategoria = new JMenuItem("BUSCAR");
        mniListaCategoria = new JMenuItem("LISTAR");
        mniListaCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniCategoriaListaActionPerformed(e);
            }
        });

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
        mnArticulo.setForeground(Color.WHITE);
        mniNuevoArticulo = new JMenuItem("NUEVO");

        mniNuevoArticulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoArticuloActionPerformed(e);
            }
        });

        mniModificaArticulo = new JMenuItem("MODIFICAR");
        mniEliminaArticulo = new JMenuItem("ELIMINAR");
        
        mniEliminaArticulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaArticuloActionPerformed(e);
            }
        });
        
        mniBuscaArticulo = new JMenuItem("BUSCAR");
        mniListaArticulo = new JMenuItem("LISTAR");
        mniListaArticulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniArticuloListaActionPerformed(e);
            }
        });

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
        mnCliente.setForeground(Color.WHITE);
        mniNuevoCliente = new JMenuItem("NUEVO");

        mniNuevoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoClienteActionPerformed(e);
            }
        });

        mniModificaCliente = new JMenuItem("MODIFICAR");
        mniEliminaCliente = new JMenuItem("ELIMINAR");
        
        mniEliminaCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaClienteActionPerformed(e);
            }
        });
        
        mniBuscaCliente = new JMenuItem("BUSCAR");
        mniListaCliente = new JMenuItem("LISTAR");
        
        mniListaCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniClienteListaActionPerformed(e);
            }
        });

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
        mnDetalle_Ingreso.setForeground(Color.WHITE);

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
        
        mniListaDetalle_Ingreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniDetalle_IngresoListaActionPerformed(e);
            }
        });

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
        mnDetalleVenta.setForeground(Color.WHITE);

        mniNuevoDetalleVenta = new JMenuItem("NUEVO");

        mniNuevoDetalleVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoDetalleVentaActionPerformed(e);
            }
        });

        mniModificaDetalleVenta = new JMenuItem("MODIFICAR");
        mniEliminaDetalleVenta = new JMenuItem("ELIMINAR");
        mniEliminaDetalleVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaDetalle_VentaActionPerformed(e);
            }
        });
        mniBuscaDetalleVenta = new JMenuItem("BUSCAR");
        mniListaDetalleVenta = new JMenuItem("LISTAR");

        mniListaDetalleVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniDetalle_VentaListaActionPerformed(e);
            }
        });
        
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
        mnIngreso.setForeground(Color.WHITE);

        mniNuevoIngreso = new JMenuItem("NUEVO");

        mniNuevoIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoIngresoActionPerformed(e);
            }
        });

        mniModificaIngreso = new JMenuItem("MODIFICAR");
        mniEliminaIngreso = new JMenuItem("ELIMINAR");
        
        mniEliminaIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaIngresoActionPerformed(e);
            }
        });
        
        mniBuscaIngreso = new JMenuItem("BUSCAR");
        mniListaIngreso = new JMenuItem("LISTAR");

        mniListaIngreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniIngresoListaActionPerformed(e);
            }
        });
        
        mnIngreso.add(mniNuevoIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniModificaIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniEliminaIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniBuscaIngreso);
        mnIngreso.addSeparator();
        mnIngreso.add(mniListaIngreso);
        /*Kardex*/
        mnKardex = new JMenu("KARDEX");
        mnKardex.setForeground(Color.WHITE);

        mniNuevoKardex = new JMenuItem("NUEVO");

        mniNuevoKardex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoKardexActionPerformed(e);
            }
        });

        mniModificaKardex = new JMenuItem("MODIFICAR");
        mniEliminaKardex = new JMenuItem("ELIMINAR");
        mniBuscaKardex = new JMenuItem("BUSCAR");
        mniListaKardex = new JMenuItem("LISTAR");

        mnKardex.add(mniNuevoKardex);
        mnKardex.addSeparator();
        mnKardex.add(mniModificaKardex);
        mnKardex.addSeparator();
        mnKardex.add(mniEliminaKardex);
        mnKardex.addSeparator();
        mnKardex.add(mniBuscaKardex);
        mnKardex.addSeparator();
        mnKardex.add(mniListaKardex);
        /*PROVEEDOR*/
        mnProveedor = new JMenu("PROVEEDOR");
        mnProveedor.setForeground(Color.WHITE);

        mniNuevoProveedor = new JMenuItem("NUEVO");

        mniNuevoProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoProveedorActionPerformed(e);
            }
        });

        mniModificaProveedor = new JMenuItem("MODIFICAR");
        mniEliminaProveedor = new JMenuItem("ELIMINAR");
        mniEliminaProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaProveedorActionPerformed(e);
            }
        });
        mniBuscaProveedor = new JMenuItem("BUSCAR");
        mniListaProveedor = new JMenuItem("LISTAR");

        mniListaProveedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniProveedorListaActionPerformed(e);
            }
        });
        
        mnProveedor.add(mniNuevoProveedor);
        mnProveedor.addSeparator();
        mnProveedor.add(mniModificaProveedor);
        mnProveedor.addSeparator();
        mnProveedor.add(mniEliminaProveedor);
        mnProveedor.addSeparator();
        mnProveedor.add(mniBuscaProveedor);
        mnProveedor.addSeparator();
        mnProveedor.add(mniListaProveedor);
        /*VENDEDOR*/
        mnVendedor = new JMenu("VENDEDOR");
        mnVendedor.setForeground(Color.WHITE);

        mniNuevoVendedor = new JMenuItem("NUEVO");

        mniNuevoVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoVendedorActionPerformed(e);
            }
        });

        mniModificaVendedor = new JMenuItem("MODIFICAR");
        mniEliminaVendedor = new JMenuItem("ELIMINAR");
        mniEliminaVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaVendedorActionPerformed(e);
            }
        });
        mniBuscaVendedor = new JMenuItem("BUSCAR");
        mniListaVendedor = new JMenuItem("LISTAR");

        mniListaVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniVendedorListaActionPerformed(e);
            }
        });
        
        mnVendedor.add(mniNuevoVendedor);
        mnVendedor.addSeparator();
        mnVendedor.add(mniModificaVendedor);
        mnVendedor.addSeparator();
        mnVendedor.add(mniEliminaVendedor);
        mnVendedor.addSeparator();
        mnVendedor.add(mniBuscaVendedor);
        mnVendedor.addSeparator();
        mnVendedor.add(mniListaVendedor);
        /*VENTA*/
        mnVenta = new JMenu("VENTA");
        mnVenta.setForeground(Color.WHITE);

        mniNuevoVenta = new JMenuItem("NUEVO");

        mniNuevoVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoVentaActionPerformed(e);
            }
        });

        mniModificaVenta = new JMenuItem("MODIFICAR");
        mniEliminaVenta = new JMenuItem("ELIMINAR");
        mniEliminaVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniEliminaVentaActionPerformed(e);
            }
        });
        mniBuscaVenta = new JMenuItem("BUSCAR");
        mniListaVenta = new JMenuItem("LISTAR");

        mniListaVenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniVentaListaActionPerformed(e);
            }
        });
        
        mnVenta.add(mniNuevoVenta);
        mnVenta.addSeparator();
        mnVenta.add(mniModificaVenta);
        mnVenta.addSeparator();
        mnVenta.add(mniEliminaVenta);
        mnVenta.addSeparator();
        mnVenta.add(mniBuscaVenta);
        mnVenta.addSeparator();
        mnVenta.add(mniListaVenta);

        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnArticulo);
        mnbPrincipal.add(mnCategoria);
        mnbPrincipal.add(mnCliente);
        mnbPrincipal.add(mnProveedor);
        mnbPrincipal.add(mnVendedor);       
        mnbPrincipal.add(mnIngreso);
        mnbPrincipal.add(mnVenta);
        mnbPrincipal.add(mnDetalle_Ingreso);
        mnbPrincipal.add(mnDetalleVenta);
        mnbPrincipal.add(mnKardex);
        mnbPrincipal.setBackground(Color.lightGray);
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);
        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH); //Para maximizar
        //this.setDefaultLookAndFeelDecorated(true);
        this.setBounds(0, 0, 900, 750);
        //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Para terminar el programa

    }

    public void mniEliminaArticuloActionPerformed(ActionEvent e) {
        FrmArticuloEliminar frm = new FrmArticuloEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaClienteActionPerformed(ActionEvent e) {
        FrmClienteEliminar frm = new FrmClienteEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaCategoriaActionPerformed(ActionEvent e) {
        FrmCategoriaEliminar frm = new FrmCategoriaEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaProveedorActionPerformed(ActionEvent e) {
        FrmProveedorEliminar frm = new FrmProveedorEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaVendedorActionPerformed(ActionEvent e) {
        FrmVendedorEliminar frm = new FrmVendedorEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaVentaActionPerformed(ActionEvent e) {
        FrmVentaEliminar frm = new FrmVentaEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaDetalle_VentaActionPerformed(ActionEvent e) {
        FrmDetalle_VentaEliminar frm = new FrmDetalle_VentaEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
    }
    
    public void mniEliminaIngresoActionPerformed(ActionEvent e) {
        FrmIngresoEliminar frm = new FrmIngresoEliminar();
        dkpEscritorio.add(frm, BorderLayout.WEST);
        frm.setVisible(true);
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
    public void mniNuevoKardexActionPerformed(ActionEvent e) {
        FrmKardexNuevo frm = new FrmKardexNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }
    public void mniNuevoProveedorActionPerformed(ActionEvent e) {
        FrmProveedorNuevo frm = new FrmProveedorNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }
    public void mniNuevoVendedorActionPerformed(ActionEvent e) {
        FrmVendedorNuevo frm = new FrmVendedorNuevo();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }
    public void mniNuevoVentaActionPerformed(ActionEvent e) {
        FrmVentaNueva frm = new FrmVentaNueva();

        dkpEscritorio.add(frm, BorderLayout.WEST);

        frm.setVisible(true);
    }

    public void mniCategoriaListaActionPerformed(ActionEvent e) {
        FrmCategoriaLista frm = new FrmCategoriaLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniIngresoListaActionPerformed(ActionEvent e) {
        FrmIngresoLista frm = new FrmIngresoLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniDetalle_IngresoListaActionPerformed(ActionEvent e) {
        FrmDetalle_IngresoLista frm = new FrmDetalle_IngresoLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniDetalle_VentaListaActionPerformed(ActionEvent e) {
        FrmDetalle_VentaLista frm = new FrmDetalle_VentaLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    
    
    public void mniClienteListaActionPerformed(ActionEvent e) {
        FrmClienteLista frm = new FrmClienteLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniArticuloListaActionPerformed(ActionEvent e) {
        FrmArticuloLista frm = new FrmArticuloLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniProveedorListaActionPerformed(ActionEvent e) {
        FrmProveedorLista frm = new FrmProveedorLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniVendedorListaActionPerformed(ActionEvent e) {
        FrmVendedorLista frm = new FrmVendedorLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniVentaListaActionPerformed(ActionEvent e) {
        FrmVentaLista frm = new FrmVentaLista();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);

    }
}
