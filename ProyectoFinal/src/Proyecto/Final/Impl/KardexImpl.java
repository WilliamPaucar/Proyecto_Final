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
public class KardexImpl implements Ikardex{
    
 @Override
    public int insertar(kardex kardex) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into kardex  values "
                + "(?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, kardex.getIdkardex()));
        lstPar.add(new Parametro(2, kardex.getDetalle_ingreso()));
        lstPar.add(new Parametro(3, kardex.getDetalle_venta()));
 
  
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
    
    public int modificar(kardex kardex) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE kardex"
                + "   SET idkardex=?, iddetalle_ingreso=?, iddetalle_venta=?"
                + " where idkardex=?";
        List<Parametro> lstPar = new ArrayList<>();
       lstPar.add(new Parametro(1, kardex.getIdkardex()));
        lstPar.add(new Parametro(2, kardex.getDetalle_ingreso()));
        lstPar.add(new Parametro(3, kardex.getDetalle_venta()));
   
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
    public int eliminar(kardex kardex) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE * FROM kardex  where idkardex=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, kardex.getIdkardex()));       
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
    public kardex obtener(int codigo) throws Exception {
        kardex kardex = null;
        String sql = "SELECT * FROM kardex where idkardex=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                kardex = new kardex();
                kardex.setIdkardex(rst.getInt(1));
                
                IDetalle_Ingreso detalle_ingresodao=new Detalle_IngresoImpl();
                Detalle_Ingreso detalle_ingreso=detalle_ingresodao.obtener(rst.getInt(2));
                kardex.setDetalle_ingreso(detalle_ingreso);
                
                IDetalleVenta detalle_ventadao=new Detalle_VentaImpl();
                Detalle_Venta detalle_venta=detalle_ventadao.obtener(rst.getInt(3));
                
                kardex.setDetalle_venta(detalle_venta);

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return kardex;
    }

    
    @Override
    
    public List<kardex> obtener() throws Exception {
        List<kardex> lista = new ArrayList<>();
         String sql = "SELECT *   FROM kardex ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            kardex kardex=null;
            
            while (rst.next()) {
                kardex = new kardex();
                kardex.setIdkardex(rst.getInt(1));
                
                IDetalle_Ingreso detalle_ingresodao=new Detalle_IngresoImpl();
                Detalle_Ingreso detalle_ingreso=detalle_ingresodao.obtener(rst.getInt(2));
                kardex.setDetalle_ingreso(detalle_ingreso);
                
                IDetalleVenta detalle_ventadao=new Detalle_VentaImpl();
                Detalle_Venta detalle_venta=detalle_ventadao.obtener(rst.getInt(3));
                kardex.setDetalle_venta(detalle_venta);
                lista.add(kardex);
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


