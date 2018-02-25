
package Proyecto.Final.vistas;
import Proyecto.Final.Impl.*;
import Proyecto.Final.rnegocio.entidades.*;
import Proyecto.Final.accesodatos.*;
import Proyecto.Final.dao.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.events.MouseEvent;


public class FrmClienteLista extends JInternalFrame {
    JLabel lblTitulo;
    JTable tabla;
    DefaultTableModel modelo;
    public FrmClienteLista(){
        this.setSize(852, 600);
        this.setLayout(new BorderLayout());
        this.setClosable(false);
        this.setBackground(Color.getHSBColor(100,60,270).brighter());
        lblTitulo=new JLabel("CLIENTES REGISTRADOS ");
        tabla= new JTable();
        this.add(lblTitulo,BorderLayout.NORTH);
        this.add(tabla,BorderLayout.NORTH);
        
        
        cargarTabla();  
    }
        public void cargarTabla(){


        modelo = new DefaultTableModel();
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
     
   
        modelo.addRow(new Object[]{"idcliente","nombres","apellidos","sexo","fecha_nacimiento","tipo_documento","num_documento",
        "direccion","telefono","email"});
     
        
        List<Cliente> list = new ArrayList<>();
        try {
            ICliente ClienteDao= new ClienteImpl();
            list = ClienteDao.obtener();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        for(Cliente clt : list){
            modelo.addRow(new Object[]{clt.getIdcliente(),clt.getNombres(),clt.getApellidos(),clt.getSexo(),
                clt.getFecha_nacimiento(),clt.getTipo_documento(),clt.getNum_documento(),clt.getDireccion()
            ,clt.getTelefono(),clt.getEmail()});
        }
        tabla.setModel(modelo);
            
}}
