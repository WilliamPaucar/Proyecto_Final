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
public class Detalle_IngresoImpl implements IDetalle_Ingreso{
    
   @Override
    public int insertar(Detalle_Ingreso detalle_ingreso) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into detalle_ingreso  values "
                + "(?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
             lstPar.add(new Parametro(1, detalle_ingreso.getIddetalle_ingreso()));
        lstPar.add(new Parametro(2, detalle_ingreso.getIngreso().getIdingreso()));
        lstPar.add(new Parametro(3, detalle_ingreso.getArticulo().getIdarticulo()));
        lstPar.add(new Parametro(4, detalle_ingreso.getPrecio_compra()));
        lstPar.add(new Parametro(5, detalle_ingreso.getPrecio_venta()));
        lstPar.add(new Parametro(6, detalle_ingreso.getStock_inicial()));
        lstPar.add(new Parametro(7, detalle_ingreso.getStock_actual()));
        lstPar.add(new Parametro(8, detalle_ingreso.getFecha_produccion()));
        lstPar.add(new Parametro(9, detalle_ingreso.getFecha_vencimiento()));
  
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
    
    public int modificar(Detalle_Ingreso detalle_ingreso) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE detalle_ingreso"
                + "   SET iddetalle_ingreso=?, codigo=?, nombre=?, descripcion=?,idcategoria=?"
                + " where codigo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, detalle_ingreso.getIddetalle_ingreso()));
        lstPar.add(new Parametro(2, detalle_ingreso.getIngreso().getIdingreso()));
        lstPar.add(new Parametro(3, detalle_ingreso.getArticulo().getIdarticulo()));
        lstPar.add(new Parametro(4, detalle_ingreso.getPrecio_compra()));
        lstPar.add(new Parametro(5, detalle_ingreso.getPrecio_venta()));
        lstPar.add(new Parametro(6, detalle_ingreso.getStock_inicial()));
        lstPar.add(new Parametro(7, detalle_ingreso.getStock_actual()));
        lstPar.add(new Parametro(8, detalle_ingreso.getFecha_produccion()));
        lstPar.add(new Parametro(9, detalle_ingreso.getFecha_vencimiento()));
   
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
    public int eliminar(Detalle_Ingreso detalle_ingreso) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE * FROM detalle_ingreso  where idartidulo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, detalle_ingreso.getIddetalle_ingreso()));       
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
    public Detalle_Ingreso obtener(int codigo) throws Exception {
        Detalle_Ingreso detalle_ingreso = null;
        String sql = "SELECT * FROM detalle_ingreso where iddetalle_ingreso=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                detalle_ingreso = new Detalle_Ingreso();
                detalle_ingreso.setIddetalle_ingreso(rst.getInt(1));
                
                IIngreso ingresodao=new IngresoImpl();
                Ingreso ingreso=ingresodao.obtener(rst.getInt(2));
                detalle_ingreso.setIngreso(ingreso);
                IArticulo articulodao=new ArticuloImpl();
                Articulo articulo=articulodao.obtener(rst.getInt(3));
                
                detalle_ingreso.setPrecio_compra(rst.getDouble(4));
                detalle_ingreso.setPrecio_venta(rst.getDouble(5));
                detalle_ingreso.setStock_inicial(rst.getInt(6));
                detalle_ingreso.setStock_actual(rst.getInt(7));
                detalle_ingreso.setFecha_produccion(rst.getDate(8));
                detalle_ingreso.setFecha_vencimiento(rst.getDate(9));
           }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return detalle_ingreso;
    }

    
    @Override
    
    public List<Detalle_Ingreso> obtener() throws Exception {
        List<Detalle_Ingreso> lista = new ArrayList<>();
         String sql = "SELECT *   FROM detalle_ingreso ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Detalle_Ingreso detalle_ingreso=null;
            while (rst.next()) {
                detalle_ingreso = new Detalle_Ingreso();
   
                detalle_ingreso.setIddetalle_ingreso(rst.getInt(1));
                
                IIngreso ingresodao=new IngresoImpl();
                Ingreso ingreso=ingresodao.obtener(rst.getInt(2));
                detalle_ingreso.setIngreso(ingreso);
                IArticulo articulodao=new ArticuloImpl();
                Articulo articulo=articulodao.obtener(rst.getInt(3));
                
                detalle_ingreso.setPrecio_compra(rst.getDouble(4));
                detalle_ingreso.setPrecio_venta(rst.getDouble(5));
                detalle_ingreso.setStock_inicial(rst.getInt(6));
                detalle_ingreso.setStock_actual(rst.getInt(7));
                detalle_ingreso.setFecha_produccion(rst.getDate(8));
                detalle_ingreso.setFecha_vencimiento(rst.getDate(9));
           
                lista.add(detalle_ingreso);
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