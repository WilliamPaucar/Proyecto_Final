
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
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

public class FrmMenuAcceso extends JFrame {

    JLabel lblTitulo,lblTitulo0;
    JPanel pnlSuperior, pnlCentral,pnlMedio;
    JButton btnAdministrador;
    JButton btnVendedor;
    JButton btnLogin;

    public FrmMenuAcceso() {
        this.setSize(230, 320);
        this.setLayout(new BorderLayout());

        pnlSuperior = new JPanel();
        pnlCentral = new JPanel();
        pnlMedio = new JPanel();
        pnlSuperior.setLayout(new GridLayout(2, 2, 3, 5));
        pnlMedio.setLayout(new GridLayout(1, 1, 3, 5));
        pnlCentral.setLayout(new GridLayout(2, 1, 1, 1));
        lblTitulo=new JLabel("");
        lblTitulo0 = new JLabel("         MENU ACCESO");
        lblTitulo0.setFont(new java.awt.Font("Cambria Math", 1, 18));
        lblTitulo0.setForeground(Color.BLUE);
        btnAdministrador = new JButton("ADMINISTRADOR");
        btnAdministrador.setBorderPainted(false);
        btnVendedor = new JButton("VENDEDOR");
        btnVendedor.setBorderPainted(false);
        btnLogin = new JButton();
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/user.png"))); // NOI18N
        btnLogin.setOpaque(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        pnlSuperior.add(lblTitulo);
        pnlSuperior.add(lblTitulo0);
        pnlMedio.add(btnLogin);
        pnlCentral.add(btnAdministrador);
        pnlCentral.add(btnVendedor);
        

        btnVendedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnVendedorActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:" + ex.getMessage());
                }
            }
        });
        
        btnAdministrador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnAdministradorActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:" + ex.getMessage());
                }
            }
        });

        this.add(pnlSuperior, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.SOUTH);
        this.add(pnlMedio, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo) 
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin"); // Setencia que aplica el skin Creme de Substance
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.8));//valor aproximado de la opacidad por default de imageWatermark
        FrmMenuAcceso frmmenu = new FrmMenuAcceso();
        frmmenu.setLocation(525, 300);
        frmmenu.setVisible(true);
    }

    public void btnAdministradorActionListener(ActionEvent e) {
        FrmLogin frmlogin= new FrmLogin();
        frmlogin.setLocation(525,300);
        frmlogin.setVisible(true);
        dispose();
    }
    
    public void btnVendedorActionListener(ActionEvent e) {
        FrmLogin frmlogin= new FrmLogin();
        frmlogin.setLocation(525,300);
        frmlogin.setVisible(true);
        dispose();
    }
    
}
