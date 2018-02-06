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
public class IngresoImpl implements IIngreso{
   
       @Override
    public int insertar(Ingreso ingreso) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into ingreso  values "
                + "(?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ingreso.getIdingreso()));
        lstPar.add(new Parametro(2, ingreso.getVendedor().getIdvendedor()));
        lstPar.add(new Parametro(3, ingreso.getProveedor().getIdproveedor()));
        lstPar.add(new Parametro(4, ingreso.getFecha()));
        lstPar.add(new Parametro(5, ingreso.getTipo_comprobante()));
        lstPar.add(new Parametro(6, ingreso.getSerie()));
        lstPar.add(new Parametro(7, ingreso.getCorrelativo()));
        lstPar.add(new Parametro(8, ingreso.getIgv()));
   
  
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
    
    public int modificar(Ingreso ingreso) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE ingreso"
                + "   SET idingreso=?, idvendedor=?, idproveedor=?, fecha=?, tipo_comprobante=?, serie=?"
                + ", correlativo=?, igv=?"
                + " where idingreso=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ingreso.getIdingreso()));
        lstPar.add(new Parametro(2, ingreso.getVendedor().getIdvendedor()));
        lstPar.add(new Parametro(3, ingreso.getProveedor().getIdproveedor()));
        lstPar.add(new Parametro(4, ingreso.getFecha()));
        lstPar.add(new Parametro(5, ingreso.getTipo_comprobante()));
        lstPar.add(new Parametro(6, ingreso.getSerie()));
        lstPar.add(new Parametro(7, ingreso.getCorrelativo()));
        lstPar.add(new Parametro(8, ingreso.getIgv()));
   
   
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
    public int eliminar(Ingreso ingreso) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE * FROM ingreso  where idingreso=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, ingreso.getIdingreso()));       
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
    public Ingreso obtener(int codigo) throws Exception {
        Ingreso ingreso = null;
        String sql = "SELECT * FROM ingreso where idingreso=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                ingreso = new Ingreso();
                ingreso.setIdingreso(rst.getInt(1));
                
                IVendedor vendedordao=new VendedorImpl();
                Vendedor vendedor=vendedordao.obtener(rst.getInt(2));
                ingreso.setVendedor(vendedor);
                IProveedor proveedordao=new ProveedorImpl();
                Proveedor proveedor=proveedordao.obtener(rst.getInt(3));
                ingreso.setProveedor(proveedor);
                
   
                ingreso.setFecha(rst.getDate(4));
                ingreso.setTipo_comprobante(rst.getString(5));
                ingreso.setSerie(rst.getString(6));
                ingreso.setCorrelativo(rst.getString(7));
                ingreso.setIgv(rst.getFloat(8));
  


            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return ingreso;
    }

    
    @Override
    
    public List<Ingreso> obtener() throws Exception {
        List<Ingreso> lista = new ArrayList<>();
         String sql = "SELECT *   FROM ingreso ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Ingreso ingreso=null;
            while (rst.next()) {
                ingreso=new Ingreso();
                ingreso.setIdingreso(rst.getInt(1));
                
                IVendedor vendedordao=new VendedorImpl();
                Vendedor vendedor=vendedordao.obtener(rst.getInt(2));
                ingreso.setVendedor(vendedor);
                IProveedor proveedordao=new ProveedorImpl();
                Proveedor proveedor=proveedordao.obtener(rst.getInt(3));
                ingreso.setProveedor(proveedor);
                
   
                ingreso.setFecha(rst.getDate(4));
                ingreso.setTipo_comprobante(rst.getString(5));
                ingreso.setSerie(rst.getString(6));
                ingreso.setCorrelativo(rst.getString(7));
                ingreso.setIgv(rst.getFloat(8));
                lista.add(ingreso);
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


 

