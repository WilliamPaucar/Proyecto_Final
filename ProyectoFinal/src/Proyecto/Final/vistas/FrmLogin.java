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
/**
 *
 * @author FABRICIO CONSTANTE
 */
public class FrmLogin extends JFrame{
    JLabel lblTitulo,lblId,lblNombre,lblTitulo0;
    JTextField txtUsuario;
    JPasswordField Password;
    
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnEntrar;
    JButton btnLogin;
    
    public FrmLogin(){
        this.setSize(230, 320);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 1, 1));
        pnlCentral.setLayout(new GridLayout(2, 1, 1, 1));
        pnlInferior.setLayout(new GridLayout(1,1,5,5));     
        
        lblTitulo = new JLabel("         LOGIN");
        lblTitulo.setFont(new java.awt.Font("Cambria Math", 1, 18));
        lblTitulo.setForeground(Color.BLUE);      
        lblId= new JLabel("    USUARIO:");
        lblNombre= new JLabel("    CONTRASEÑA:");
        btnLogin = new JButton();
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/user.png"))); // NOI18N
        btnLogin.setOpaque(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        
        
        txtUsuario = new JTextField(2);
        Password= new JPasswordField();
        
        
        btnEntrar= new JButton("ENTRAR");
        
        //pnlSuperior.add(lblTitulo);
        pnlSuperior.add(btnLogin);
        pnlCentral.add(lblId);
        pnlCentral.add(txtUsuario);
        pnlCentral.add(lblNombre);
        pnlCentral.add(Password);       
        pnlInferior.add(btnEntrar);
        
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnEntrarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
            }
        });
        
        this.add(pnlSuperior, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlInferior, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
             
 
    }
        public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo) 
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin"); // Setencia que aplica el skin Creme de Substance
        SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.8));//valor aproximado de la opacidad por default de imageWatermark
        FrmLogin frmlogin= new FrmLogin();
        frmlogin.setLocation(525,300);
        frmlogin.setVisible(true);
    } 
        public void btnEntrarActionListener(ActionEvent e){
            String Usuario = "administrador";
            String Contraseña = "12345";
            
            
            String Pass= new String(Password.getPassword());
            
            if (txtUsuario.getText().equals(Usuario)&&Pass.equals(Contraseña)) {
                JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo) 
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin"); // Setencia que aplica el skin Creme de Substance
                SubstanceLookAndFeel.setCurrentWatermark(new SubstanceImageWatermark("C:\\Users\\JUNIOR CHAVEZ\\Desktop\\Proyecto_Final\\ProyectoFinal\\src\\Proyecto\\Final\\Img\\cfdi-33slide.jpg"));
                SubstanceLookAndFeel.setImageWatermarkOpacity(new Float(0.8));//valor aproximado de la opacidad por default de imageWatermark
                FrmMenuPrincipal frm = new FrmMenuPrincipal();
                frm.setVisible(true);
                dispose();
                
            }
            else{
             JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrecto",
             "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
            }


