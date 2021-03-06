
package Proyecto.Final.Impl;
import Proyecto.Final.accesodatos.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
import java.sql.*;
public class ArticuloImpl implements IArticulo{
      
       @Override
    public int insertar(Articulo articulo) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into articulo  values "
                + "(?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, articulo.getIdarticulo()));
        lstPar.add(new Parametro(2, articulo.getCodigo()));
        lstPar.add(new Parametro(3, articulo.getNombre()));
        lstPar.add(new Parametro(4, articulo.getDescripcion()));
        lstPar.add(new Parametro(5, articulo.getCategoria().getIdcategoria()));
  
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
    
    public int modificar(Articulo articulo) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE articulo"
                + "  SET codigo=?, nombre=?, descripcion=?,idcategoria=?"
                + " where idarticulo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(5, articulo.getIdarticulo()));
        lstPar.add(new Parametro(1, articulo.getCodigo()));
        lstPar.add(new Parametro(2, articulo.getNombre()));
        lstPar.add(new Parametro(3, articulo.getDescripcion()));
        lstPar.add(new Parametro(4, articulo.getCategoria().getIdcategoria()));
   
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
    public int eliminar(Articulo articulo) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM articulo  where idarticulo=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, articulo.getIdarticulo()));       
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
    public Articulo obtener(int idarticulo) throws Exception {
        Articulo articulo = null;
        String sql = "SELECT * FROM articulo where idarticulo=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, idarticulo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                articulo = new Articulo();
                articulo.setIdarticulo(rst.getInt(1));
                articulo.setCodigo(rst.getInt(2));
                articulo.setNombre(rst.getString(3));
                articulo.setDescripcion(rst.getString(4));
                
                ICategoria categoriadao=new CategoriaImpl();
                Categoria categoria=categoriadao.obtener(rst.getInt(5));
                articulo.setCategoria(categoria);

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return articulo;
    }
    @Override
    public Articulo obtener_x_nombre(String nombre) throws Exception {
        Articulo articulo = null;
        String sql = "SELECT * FROM articulo where nombre =?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, nombre));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                articulo = new Articulo();
                articulo.setIdarticulo(rst.getInt(1));
                articulo.setCodigo(rst.getInt(2));
                articulo.setNombre(rst.getString(3));
                articulo.setDescripcion(rst.getString(4));

            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return articulo;
    }
   
    @Override
    
    public List<Articulo> obtener() throws Exception {
        List<Articulo> lista = new ArrayList<>();
         String sql = "SELECT *   FROM articulo ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Articulo articulo=null;
            while (rst.next()) {
                articulo = new Articulo();
                articulo.setIdarticulo(rst.getInt(1));
                articulo.setCodigo(rst.getInt(2));
                articulo.setNombre(rst.getString(3));
                articulo.setDescripcion(rst.getString(4));
                
                ICategoria categoriadao=new CategoriaImpl();
                Categoria categoria=categoriadao.obtener(rst.getInt(5));
                articulo.setCategoria(categoria);

                lista.add(articulo);
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


