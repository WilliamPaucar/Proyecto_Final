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
public class FrmDetalle_IngresoNuevo extends JInternalFrame{
    JLabel lblTitulo,lblId,lblIngreso,lblArticulo,lblPrecio_compra,lblPrecio_venta,lblStock_inicial,lblStock_actual,lblFecha_produ,lblFecha_expi;
    JTextField txtId,txtPrecio_compra,txtPrecio_venta,txtStock_inicial,txtStock_actual,txtFecha_produ,txtFecha_expi;
    List<Ingreso> lstingreso;
    JComboBox<Ingreso> cmbIngreso;
    List<Articulo> lstarticulo;
    JComboBox<Articulo> cmbArticulo;
    JPanel pnlSuperior,pnlCentral,pnlInferior;
    JButton btnAceptar,btnLimpiar;
    
        public FrmDetalle_IngresoNuevo(){
        this.setSize(400,600);
        this.setLayout(new BorderLayout());
     
        pnlSuperior= new JPanel();
        pnlCentral= new JPanel();
        pnlInferior= new JPanel();
        pnlSuperior.setLayout(new GridLayout(1, 1, 5, 5));
        pnlCentral.setLayout(new GridLayout(9, 2, 5, 5));
        pnlInferior.setLayout(new GridLayout(1,2,5,5));     
        
        lblTitulo = new JLabel("DETALLE DEL NUEVO INGRESO");
                
        lblId= new JLabel("CODIGO:");
        lblIngreso= new JLabel("INGRESO:");
        lblArticulo= new JLabel("ARTICULO:");
        lblPrecio_compra= new JLabel("PRECIO DE COMPRA:");
        lblPrecio_venta= new JLabel("PRECIO DE VENTA:");
        lblStock_inicial= new JLabel("STOCK INICIAL:");
        lblStock_actual= new JLabel("STOCK ACTUAL:");
        lblFecha_produ= new JLabel("FECHA DE PRODUCCION:");
        lblFecha_expi= new JLabel("FECHA DE VENCIMIENTO:");
        
        
        txtId = new JTextField(2);
        cargarIngresos();  
        cmbIngreso=new JComboBox(lstingreso.toArray());
        cargarArticulos();  
        cmbArticulo=new JComboBox(lstarticulo.toArray());
        txtPrecio_compra = new JTextField(2);
        txtPrecio_venta = new JTextField(2);
        txtStock_inicial = new JTextField(2);
        txtStock_actual = new JTextField(2);
        txtFecha_produ = new JTextField(2);
        txtFecha_expi = new JTextField(2);


        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlSuperior.add(lblTitulo);
        pnlCentral.add(lblId);
        pnlCentral.add(txtId);
        pnlCentral.add(lblIngreso);
        pnlCentral.add(cmbIngreso);
        pnlCentral.add(lblArticulo);
        pnlCentral.add(cmbArticulo);
        pnlCentral.add(lblPrecio_compra);
        pnlCentral.add(txtPrecio_compra);
        pnlCentral.add(lblPrecio_venta);
        pnlCentral.add(txtPrecio_venta);
        pnlCentral.add(lblStock_inicial);
        pnlCentral.add(txtStock_inicial);
        pnlCentral.add(lblStock_actual);
        pnlCentral.add(txtStock_actual);
        pnlCentral.add(lblFecha_produ);
        pnlCentral.add(txtFecha_produ);
        pnlCentral.add(lblFecha_expi);
        pnlCentral.add(txtFecha_expi);

        
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
             
            Detalle_Ingreso detalleingreso = new Detalle_Ingreso();
            detalleingreso.setIddetalle_ingreso(Integer.parseInt(txtId.getText()));
            detalleingreso.setIngreso((Ingreso)cmbIngreso.getSelectedItem());            
            detalleingreso.setArticulo((Articulo)cmbArticulo.getSelectedItem());            
            detalleingreso.setPrecio_compra(Double.parseDouble(txtPrecio_compra.getText()));
            detalleingreso.setPrecio_venta(Double.parseDouble(txtPrecio_venta.getText()));
            detalleingreso.setStock_inicial(Integer.parseInt(txtStock_inicial.getText()));
            detalleingreso.setStock_actual(Integer.parseInt(txtStock_actual.getText()));
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
            detalleingreso.setFecha_produccion(format.parse(txtFecha_produ.getText()));
            detalleingreso.setFecha_vencimiento(format.parse(txtFecha_expi.getText()));
            } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Error de fecha!!",
                "ERROR", JOptionPane.ERROR_MESSAGE);  
            }

            IDetalle_Ingreso detalleingresoDao = new Detalle_IngresoImpl();
            
            if(detalleingresoDao.insertar(detalleingreso)>0){
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
        public void cargarIngresos() {
        try {
       IIngreso ingreso=new IngresoImpl();
       lstingreso=ingreso.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
        public void cargarArticulos() {
        try {
       IArticulo art=new ArticuloImpl();
       lstarticulo=art.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
}