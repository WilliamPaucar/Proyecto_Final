/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.Impl;
import Proyecto.Final.accesodatos.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
import java.sql.*;
public class VendedorImpl implements IVendedor{
    

       @Override
    public int insertar(Vendedor vendedor) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into vendedor  values "
                + "(?,?,?,?,?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, vendedor.getIdvendedor()));
        lstPar.add(new Parametro(2, vendedor.getNombres()));
        lstPar.add(new Parametro(3, vendedor.getApellidos()));
        lstPar.add(new Parametro(4, vendedor.getSexo()));
        lstPar.add(new Parametro(5, vendedor.getFecha_nacimiento()));
        lstPar.add(new Parametro(6, vendedor.getNumero_documento()));
        lstPar.add(new Parametro(7, vendedor.getDireccion()));
        lstPar.add(new Parametro(8, vendedor.getTelefono()));
        lstPar.add(new Parametro(9, vendedor.getEmail()));
        lstPar.add(new Parametro(10, vendedor.getAcceso()));
        lstPar.add(new Parametro(11, vendedor.getUsuario()));
        lstPar.add(new Parametro(12, vendedor.getPassword()));
  
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    
    public int modificar(Vendedor vendedor) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE vendedor"
                + "    nombres=?, apellidos=?, sexo=?, fecha_nacimiento=?"
                + ", numero_documento=?, direccion=?, telefono=?, email=?, acceso=?, usuario=?, password=?"
                + " where idvendedor=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(12, vendedor.getIdvendedor()));
        lstPar.add(new Parametro(1, vendedor.getNombres()));
        lstPar.add(new Parametro(2, vendedor.getApellidos()));
        lstPar.add(new Parametro(3, vendedor.getSexo()));
        lstPar.add(new Parametro(4, vendedor.getFecha_nacimiento()));
        lstPar.add(new Parametro(5, vendedor.getNumero_documento()));
        lstPar.add(new Parametro(6, vendedor.getDireccion()));
        lstPar.add(new Parametro(7, vendedor.getTelefono()));
        lstPar.add(new Parametro(8, vendedor.getEmail()));
        lstPar.add(new Parametro(9, vendedor.getAcceso()));
        lstPar.add(new Parametro(10, vendedor.getUsuario()));
        lstPar.add(new Parametro(11, vendedor.getPassword()));
   
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public int eliminar(Vendedor vendedor) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM vendedor  where idvendedor=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, vendedor.getIdvendedor()));       
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilasAfectadas = con.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            throw e;
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilasAfectadas;
    }

    @Override
    public Vendedor obtener(int codigo) throws Exception {
        Vendedor vendedor = null;
        String sql = "SELECT * FROM vendedor where idvendedor=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                vendedor = new Vendedor();
                vendedor.setIdvendedor(rst.getInt(1));
                vendedor.setNombres(rst.getString(2));
                vendedor.setApellidos(rst.getString(3));
                vendedor.setSexo(rst.getString(4));
                vendedor.setFecha_nacimiento(rst.getDate(5));
                vendedor.setNumero_documento(rst.getString(6));
                vendedor.setDireccion(rst.getString(7));
                vendedor.setTelefono(rst.getString(8));
                vendedor.setEmail(rst.getString(9));
                vendedor.setAcceso(rst.getString(10));
                vendedor.setUsuario(rst.getString(11));
                vendedor.setPassword(rst.getString(12));


            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return vendedor;
    }
@Override
    public Vendedor obtener_x_nombre(String nombres) throws Exception {
        Vendedor vendedor = null;
        String sql = "SELECT * FROM vendedor where nombres =?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, nombres));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
               vendedor = new Vendedor();
               vendedor.setIdvendedor(rst.getInt(1));
                vendedor.setNombres(rst.getString(2));
                vendedor.setApellidos(rst.getString(3));
                vendedor.setSexo(rst.getString(4));
                vendedor.setFecha_nacimiento(rst.getDate(5));
                vendedor.setNumero_documento(rst.getString(6));
                vendedor.setDireccion(rst.getString(7));
                vendedor.setTelefono(rst.getString(8));
                vendedor.setEmail(rst.getString(9));
                vendedor.setAcceso(rst.getString(10));
                vendedor.setUsuario(rst.getString(11));
                vendedor.setPassword(rst.getString(12));

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return vendedor;
    }
    
    @Override
    
    public List<Vendedor> obtener() throws Exception {
        List<Vendedor> lista = new ArrayList<>();
         String sql = "SELECT *   FROM vendedor ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Vendedor vendedor=null;
            while (rst.next()) {
                vendedor=new Vendedor();
                vendedor.setIdvendedor(rst.getInt(1));
                vendedor.setNombres(rst.getString(2));
                vendedor.setApellidos(rst.getString(3));
                vendedor.setSexo(rst.getString(4));
                vendedor.setFecha_nacimiento(rst.getDate(5));
                vendedor.setNumero_documento(rst.getString(6));
                vendedor.setDireccion(rst.getString(7));
                vendedor.setTelefono(rst.getString(8));
                vendedor.setEmail(rst.getString(9));
                vendedor.setAcceso(rst.getString(10));
                vendedor.setUsuario(rst.getString(11));
                vendedor.setPassword(rst.getString(12));
                lista.add(vendedor);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }
     


}



