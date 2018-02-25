/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.Test;

/**
 *
 * @author Gilda
 */

import Proyecto.Final.Impl.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
public class IngresoTest {
     public IngresoTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IIngreso ingresoDao = new IngresoImpl();
        IVendedor vendedorDao = new VendedorImpl();
        Vendedor vendedor = vendedorDao.obtener(1);
        IProveedor  proveedorDao = new  ProveedorImpl();
        Proveedor proveedor = proveedorDao.obtener(1);
        Ingreso ingreso = new Ingreso(5,vendedor ,proveedor,new Date(),"Ingresos","E",  "Egreso", 221 );
       
  
        try{
            filasAfectadas = ingresoDao.insertar(ingreso);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE PEdido
        List<Ingreso> lista = new ArrayList<>();
        try {
            lista = ingresoDao.obtener();
            for (Ingreso c:lista){
                System.out.println("---Datos Ingreso---");
                System.out.println("IdIngreso :"+c.getIdingreso());
                System.out.println("Vendedor :"+c.getVendedor().getIdvendedor());
                System.out.println("Proveedor :"+c.getProveedor().getIdproveedor());
                System.out.println("Fecha  :"+c.getFecha());
                System.out.println("Tipo_comprobante :"+c.getTipo_comprobante());
                System.out.println("Serie :"+c.getSerie());
                System.out.println("Correlativo  :"+c.getCorrelativo());
                System.out.println("Igv  :"+c.getIgv());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

    
    
}
