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
        /*CATEGORIA */
    JMenu mnCategoria;
    JMenuItem mniNuevoCategoria;
    JMenuItem mniModificaCategoria;
    JMenuItem mniEliminaCategoria;
    JMenuItem mniBuscaCategoria;
    JMenuItem mniListaCategoria;
    JDesktopPane dkpEscritorio;

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
        
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnCategoria);

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
        public static void main(String[] args) {
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);
    }
}