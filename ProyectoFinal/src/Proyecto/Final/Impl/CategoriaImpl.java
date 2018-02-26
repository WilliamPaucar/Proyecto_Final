
package Proyecto.Final.Impl;
import Proyecto.Final.accesodatos.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
import java.sql.*;
public class CategoriaImpl implements ICategoria{
    

    @Override
    public int insertar(Categoria categoria) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into categoria  values "
                + "(?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, categoria.getIdcategoria()));
        lstPar.add(new Parametro(2, categoria.getNombre()));
        lstPar.add(new Parametro(3, categoria.getDescripcion()));

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
    public Categoria obtener_x_nombre(String nombre) throws Exception {
        Categoria categoria = null;
        String sql = "SELECT * FROM categoria where nombre =?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, nombre));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                categoria = new Categoria();
                categoria.setIdcategoria(rst.getInt(1));
                categoria.setNombre(rst.getString(2));
                categoria.setDescripcion(rst.getString(3));
               


            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return categoria;
    }


    @Override
    
    public int modificar(Categoria categoria) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE categoria"
                + "   SET idcategoria=?, nombre=?, descripcion=?, "
                + " where idcategoria=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, categoria.getIdcategoria()));
        lstPar.add(new Parametro(2, categoria.getNombre()));
        lstPar.add(new Parametro(3, categoria.getDescripcion()));

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
    public int eliminar(Categoria categoria){
        int numFilasAfectadas = 0;
         String sql = "DELETE FROM categoria  where idcategoria=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, categoria.getIdcategoria()));       
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
    public Categoria obtener(int codigo) throws Exception {
        Categoria categoria = null;
        String sql = "SELECT * FROM categoria where idcategoria=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                categoria = new Categoria();
                categoria.setIdcategoria(rst.getInt(1));
                categoria.setNombre(rst.getString(2));
                categoria.setDescripcion(rst.getString(3));
                 
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return categoria;
    }

    @Override
    
    public List<Categoria> obtener() throws Exception {
        List<Categoria> lista = new ArrayList<>();
         String sql = "SELECT *  FROM categoria ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Categoria categoria=null;
            while (rst.next()) {
                categoria = new Categoria();
                categoria.setIdcategoria(rst.getInt(1));
                categoria.setNombre(rst.getString(2));
                categoria.setDescripcion(rst.getString(3));
    
                lista.add(categoria);
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
