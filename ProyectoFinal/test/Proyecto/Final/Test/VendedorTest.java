/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.Test;
import Proyecto.Final.Impl.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
public class VendedorTest {
      public VendedorTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IVendedor vendedorDao = new VendedorImpl();
        Vendedor vendedor = new Vendedor(8,"Marco" , "Bonilla", "m", new Date(), "623656","Riobamba",  "0963116523", "ejemplo@gmail.com", "2", "More","0258");
    
  
        try{
            filasAfectadas = vendedorDao.insertar(vendedor);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE VENDEDOR
        List<Vendedor> lista = new ArrayList<>();
        try {
            lista = vendedorDao.obtener();
            for (Vendedor c:lista){
                System.out.println("---Datos Ingreso---");
                System.out.println("IdIngreso :"+c.getIdvendedor());
                System.out.println("Nombres :"+c.getNombres());
                System.out.println("Apellidos :"+c.getApellidos());
                System.out.println("Sexo :"+c.getSexo());
                System.out.println("Fecha_nacimiento :"+c.getFecha_nacimiento());
                System.out.println("Numero_documento :"+c.getNumero_documento());
                System.out.println("Direccion :"+c.getDireccion());
                System.out.println("Telefono :"+c.getTelefono());
                System.out.println("Direccion :"+c.getDireccion());
                System.out.println("Email  :"+c.getEmail()); 
                 System.out.println("Acceso :"+c.getAcceso());
                System.out.println("Usuario:"+c.getUsuario());
                System.out.println("Password :"+c.getPassword()); 
             }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }
}
