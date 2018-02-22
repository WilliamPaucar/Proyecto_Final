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

public class ProveedorImpl implements IProveedor{
    
 @Override
    public int insertar(Proveedor proveedor) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into proveedor  values "
                + "(?,?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, proveedor.getIdproveedor()));
        lstPar.add(new Parametro(2, proveedor.getRazon_social()));
        lstPar.add(new Parametro(3, proveedor.getSector_comercial()));
        lstPar.add(new Parametro(4, proveedor.getTipo_documento()));
        lstPar.add(new Parametro(5, proveedor.getNum_documento()));
        lstPar.add(new Parametro(6, proveedor.getDireccion()));
        lstPar.add(new Parametro(7, proveedor.getTelefono()));
        lstPar.add(new Parametro(8, proveedor.getEmail()));
        lstPar.add(new Parametro(9, proveedor.getUrl()));
  
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
    
    public int modificar(Proveedor proveedor) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE proveedor"
                + "   SET idproveedor=?, razon_social=?, sector_comercial=?, tipo_documento=?, num_documento=?, direccion=?"
                + ", telefono=?, email=?, url=?"
                + " where idproveedor=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, proveedor.getIdproveedor()));
        lstPar.add(new Parametro(2, proveedor.getRazon_social()));
        lstPar.add(new Parametro(3, proveedor.getSector_comercial()));
        lstPar.add(new Parametro(4, proveedor.getTipo_documento()));
        lstPar.add(new Parametro(5, proveedor.getNum_documento()));
        lstPar.add(new Parametro(6, proveedor.getDireccion()));
        lstPar.add(new Parametro(7, proveedor.getTelefono()));
        lstPar.add(new Parametro(8, proveedor.getEmail()));
        lstPar.add(new Parametro(9, proveedor.getUrl()));
   
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
    public int eliminar(Proveedor proveedor) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM proveedor  where idproveedor=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, proveedor.getIdproveedor()));       
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
    public Proveedor obtener(int codigo) throws Exception {
        Proveedor proveedor = null;
        String sql = "SELECT * FROM proveedor where idproveedor=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                proveedor = new Proveedor();
                proveedor.setIdproveedor(rst.getInt(1));
                proveedor.setRazon_social(rst.getString(2));
                proveedor.setSector_comercial(rst.getString(3));
                proveedor.setTipo_documento(rst.getString(4));
                proveedor.setNum_documento(rst.getString(5));
                proveedor.setDireccion(rst.getString(6));
                proveedor.setTelefono(rst.getString(7));
                proveedor.setEmail(rst.getString(8));
                proveedor.setUrl(rst.getString(9));


            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return proveedor;
    }

    
    @Override
    
    public List<Proveedor> obtener() throws Exception {
        List<Proveedor> lista = new ArrayList<>();
         String sql = "SELECT *   FROM proveedor ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Proveedor proveedor=null;
            while (rst.next()) {
                proveedor=new Proveedor();
                proveedor.setIdproveedor(rst.getInt(1));
                proveedor.setRazon_social(rst.getString(2));
                proveedor.setSector_comercial(rst.getString(3));
                proveedor.setTipo_documento(rst.getString(4));
                proveedor.setNum_documento(rst.getString(5));
                proveedor.setDireccion(rst.getString(6));
                proveedor.setTelefono(rst.getString(7));
                proveedor.setEmail(rst.getString(8));
                proveedor.setUrl(rst.getString(9));
                lista.add(proveedor);
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


