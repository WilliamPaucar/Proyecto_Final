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
public class Detalle_VentaImpl implements IDetalleVenta{
    

       @Override
    public int insertar(Detalle_Venta detalle_venta) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into detalle_venta  values "
                + "(?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, detalle_venta.getIddetalle_venta()));
        lstPar.add(new Parametro(5, detalle_venta.getVenta().getIdventa()));
        lstPar.add(new Parametro(2, detalle_venta.getCantidad()));
        lstPar.add(new Parametro(3, detalle_venta.getPrecio_venta()));
        lstPar.add(new Parametro(4, detalle_venta.getDescuento()));
        lstPar.add(new Parametro(6, detalle_venta.getArticulo().getIdarticulo()));
  
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
    
    public int modificar(Detalle_Venta detalle_venta) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE detalle_venta"
                + "   SET iddetalle_venta=?, idventa=?, cantidad=?, precio_venta=?, descuento=?"
                + " where iddetalle_venta=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, detalle_venta.getIddetalle_venta()));
        lstPar.add(new Parametro(5, detalle_venta.getVenta().getIdventa()));
        lstPar.add(new Parametro(2, detalle_venta.getCantidad()));
        lstPar.add(new Parametro(3, detalle_venta.getPrecio_venta()));
        lstPar.add(new Parametro(4, detalle_venta.getDescuento()));
        lstPar.add(new Parametro(6, detalle_venta.getArticulo().getIdarticulo()));
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
    public int eliminar(Detalle_Venta detalle_venta) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM detalle_venta  where iddetalle_venta=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, detalle_venta.getIddetalle_venta()));       
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
    public Detalle_Venta obtener(int codigo) throws Exception {
        Detalle_Venta detalle_venta = null;
        String sql = "SELECT * FROM detalle_venta where iddetalle_venta=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                detalle_venta = new Detalle_Venta();
                detalle_venta.setIddetalle_venta(rst.getInt(1));
      
                IVenta ventadao=new VentaImpl();
                Venta venta=ventadao.obtener(rst.getInt(5));
                
                detalle_venta.setVenta(venta);
                detalle_venta.setCantidad(rst.getInt(2));
                detalle_venta.setPrecio_venta(rst.getDouble(3));
                detalle_venta.setDescuento(rst.getDouble(4));
                
                IArticulo articulodao=new ArticuloImpl();
                Articulo articulo=articulodao.obtener(rst.getInt(6));
                detalle_venta.setArticulo(articulo);

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return detalle_venta;
    }

    
    @Override
    
    public List<Detalle_Venta> obtener() throws Exception {
        List<Detalle_Venta> lista = new ArrayList<>();
         String sql = "SELECT *   FROM detalle_venta ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Detalle_Venta detalle_venta=null;
            
            while (rst.next()) {
                detalle_venta = new Detalle_Venta();
                detalle_venta.setIddetalle_venta(rst.getInt(1));
      
                IVenta ventadao=new VentaImpl();
                Venta venta=ventadao.obtener(rst.getInt(5));
                
                detalle_venta.setVenta(venta);
                detalle_venta.setCantidad(rst.getInt(2));
                detalle_venta.setPrecio_venta(rst.getDouble(3));
                detalle_venta.setDescuento(rst.getDouble(4));
                
                IArticulo articulodao=new ArticuloImpl();
                Articulo articulo=articulodao.obtener(rst.getInt(6));
                detalle_venta.setArticulo(articulo);

                lista.add(detalle_venta);
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

