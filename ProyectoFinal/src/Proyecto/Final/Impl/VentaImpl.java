
package Proyecto.Final.Impl;
import Proyecto.Final.accesodatos.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
import java.sql.*;
public class VentaImpl implements IVenta{
    
   
    
       @Override
    public int insertar(Venta venta) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into venta  values "
                + "(?,?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
          lstPar.add(new Parametro(1, venta.getIdventa()));
        lstPar.add(new Parametro(7, venta.getCliente().getIdcliente()));
        lstPar.add(new Parametro(8, venta.getVendedor().getIdvendedor()));
        lstPar.add(new Parametro(9, venta.getArticulo().getIdarticulo()));
        lstPar.add(new Parametro(2, venta.getFecha()));
        lstPar.add(new Parametro(3, venta.getTipo_coprobante()));
        lstPar.add(new Parametro(4, venta.getSerie()));
        lstPar.add(new Parametro(5, venta.getCorrelativo()));
        lstPar.add(new Parametro(6, venta.getIgv()));
  
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
    
    public int modificar(Venta venta) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE venta"
                + "   SET fecha=?, tipo_comprobante=?,serie=?, correlativo=?"
                + ",igv=?,cliente=?, vendedor=?,articulo=?"
                + " where idventa=?";
        List<Parametro> lstPar = new ArrayList<>();
          lstPar.add(new Parametro(9, venta.getIdventa()));
        lstPar.add(new Parametro(7, venta.getCliente().getIdcliente()));
        lstPar.add(new Parametro(6, venta.getVendedor().getIdvendedor()));
        lstPar.add(new Parametro(8, venta.getArticulo().getIdarticulo()));
        
        lstPar.add(new Parametro(1, venta.getFecha()));
        lstPar.add(new Parametro(2, venta.getTipo_coprobante()));
        lstPar.add(new Parametro(3, venta.getSerie()));
        lstPar.add(new Parametro(4, venta.getCorrelativo()));
        lstPar.add(new Parametro(5, venta.getIgv()));
   
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
    public int eliminar(Venta venta) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM venta  where idventa=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, venta.getIdventa()));       
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
    public Venta obtener(int codigo) throws Exception {
        Venta venta = null;
        String sql = "SELECT * FROM venta where idventa=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                venta = new Venta();
                venta.setIdventa(rst.getInt(1));
                ICliente clientedao=new ClienteImpl();
                Cliente cliente=clientedao.obtener(rst.getInt(7));
                IVendedor vendedordao=new VendedorImpl();
                Vendedor vendedor=vendedordao.obtener(rst.getInt(8));
                venta.setVendedor(vendedor);
                venta.setCliente(cliente);
                IArticulo articuloDao=new ArticuloImpl();
                Articulo articulo=articuloDao.obtener(rst.getInt(9));
                venta.setArticulo(articulo);
                
                venta.setFecha(rst.getDate(2));
                venta.setTipo_coprobante(rst.getString(3));
                venta.setSerie(rst.getString(4));
                venta.setCorrelativo(rst.getString(5));
                venta.setIgv(rst.getFloat(6));
                
        

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return venta;
    }

    
    @Override
    
    public List<Venta> obtener() throws Exception {
        List<Venta> lista = new ArrayList<>();
         String sql = "SELECT *   FROM venta ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Venta venta=null;
            while (rst.next()) {
                venta = new Venta();
                venta.setIdventa(rst.getInt(1));
                ICliente clientedao=new ClienteImpl();
                Cliente cliente=clientedao.obtener(rst.getInt(7));
                IVendedor vendedordao=new VendedorImpl();
                Vendedor vendedor=vendedordao.obtener(rst.getInt(8));
                venta.setVendedor(vendedor);
                venta.setCliente(cliente);
                IArticulo articuloDao=new ArticuloImpl();
                Articulo articulo=articuloDao.obtener(rst.getInt(9));
                venta.setArticulo(articulo);
                venta.setFecha(rst.getDate(2));
                venta.setTipo_coprobante(rst.getString(3));
                venta.setSerie(rst.getString(4));
                venta.setCorrelativo(rst.getString(5));
                venta.setIgv(rst.getFloat(6));

                lista.add(venta);
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

