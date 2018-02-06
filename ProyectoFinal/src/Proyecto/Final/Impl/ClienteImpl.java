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

public class ClienteImpl implements ICliente{
    

       @Override
    public int insertar(Cliente cliente) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "insert into cliente  values "
                + "(?,?,?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getIdcliente()));
        lstPar.add(new Parametro(2, cliente.getNombres()));
        lstPar.add(new Parametro(3, cliente.getApellidos()));
        lstPar.add(new Parametro(4, cliente.getSexo()));
        lstPar.add(new Parametro(5, cliente.getFecha_nacimiento()));
        lstPar.add(new Parametro(6, cliente.getTipo_documento()));
        lstPar.add(new Parametro(7, cliente.getNum_documento()));
        lstPar.add(new Parametro(8, cliente.getDireccion()));
        lstPar.add(new Parametro(9, cliente.getTelefono()));
        lstPar.add(new Parametro(10, cliente.getEmail()));
  
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
    
    public int modificar(Cliente cliente) throws Exception {
        int numFilasAfectadas = 0;
        String sql = "UPDATE cliente"
                + "   SET idcliente=?, nombre=?, apellido=?, sexo=?, fecha_nacimiento=?, tipo_documento=?"
                + ", numero_documento=?, direccion=?, telefono=?, email=?"
                + " where idcliente=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getIdcliente()));
        lstPar.add(new Parametro(2, cliente.getNombres()));
        lstPar.add(new Parametro(3, cliente.getApellidos()));
        lstPar.add(new Parametro(4, cliente.getSexo()));
        lstPar.add(new Parametro(5, cliente.getFecha_nacimiento()));
        lstPar.add(new Parametro(6, cliente.getTipo_documento()));
        lstPar.add(new Parametro(7, cliente.getNum_documento()));
        lstPar.add(new Parametro(8, cliente.getDireccion()));
        lstPar.add(new Parametro(9, cliente.getTelefono()));
        lstPar.add(new Parametro(10, cliente.getEmail()));
   
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
    public int eliminar(Cliente cliente) throws Exception {
        int numFilasAfectadas = 0;
         String sql = "DELETE * FROM cliente  where idcliente=?";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getIdcliente()));       
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
    public Cliente obtener(int codigo) throws Exception {
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente where idcliente=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()) {
                cliente = new Cliente();
                cliente.setIdcliente(rst.getInt(1));
                cliente.setNombres(rst.getString(2));
                cliente.setApellidos(rst.getString(3));
                cliente.setSexo(rst.getString(4));
                cliente.setFecha_nacimiento(rst.getDate(5));
                cliente.setTipo_documento(rst.getString(6));
                cliente.setNum_documento(rst.getString(7));
                cliente.setDireccion(rst.getString(8));
                cliente.setTelefono(rst.getString(9));
                cliente.setEmail(rst.getString(10));


            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(con!=null)
            con.desconectar();
        }
        return cliente;
    }

    
    @Override
    
    public List<Cliente> obtener() throws Exception {
        List<Cliente> lista = new ArrayList<>();
         String sql = "SELECT *   FROM cliente ";        
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            Cliente cliente=null;
            while (rst.next()) {
                cliente=new Cliente();
                cliente.setIdcliente(rst.getInt(1));
                cliente.setNombres(rst.getString(2));
                cliente.setApellidos(rst.getString(3));
                cliente.setSexo(rst.getString(4));
                cliente.setFecha_nacimiento(rst.getDate(5));
                cliente.setTipo_documento(rst.getString(6));
                cliente.setNum_documento(rst.getString(7));
                cliente.setDireccion(rst.getString(8));
                cliente.setTelefono(rst.getString(9));
                cliente.setEmail(rst.getString(10));
                lista.add(cliente);
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


