/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.Test;
import Proyecto.Final.Impl.ProveedorImpl;
import Proyecto.Final.dao.IProveedor;
import Proyecto.Final.rnegocio.entidades.Proveedor;
import java.util.*;
import static junit.framework.Assert.*;
import org.junit.Test;
/**
 *
 * @author Gilda
 */
public class ProveedorTest {
    public ProveedorTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        IProveedor proveedorDao = new ProveedorImpl();
        Proveedor proveedor  = new Proveedor(3, "Banco Pichincha","Contabiliadad", "Cedula", "5", "Riobamba", "0931351465", "ejemplo@gmail.com", "www.ejemplo.com" );

        try{
            filasAfectadas = proveedorDao.insertar(proveedor);
            System.out.println("Proveedor ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE PROVEEDOR  
        List<Proveedor> lista = new ArrayList<>();
        try {
            lista = proveedorDao.obtener();
            for (Proveedor c:lista){
                System.out.println("---Datos de Proveedor---");
                System.out.println("idproveedor :"+c.getIdproveedor());
                System.out.println("Razon_social :"+c.getRazon_social());
                System.out.println("Sector_comercial :"+c.getSector_comercial());
                System.out.println("Tipo_documento :"+c.getTipo_documento());
                System.out.println("Num_documento :"+c.getNum_documento());
                System.out.println("tipo_documento:"+c.getTipo_documento());
                System.out.println("Num_documento :"+c.getNum_documento());
                System.out.println("Direccion :"+c.getDireccion());
                System.out.println("Telefono :"+c.getTelefono());
                System.out.println("Email  :"+c.getEmail());
                System.out.println("Url :"+c.getUrl());
                
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}
