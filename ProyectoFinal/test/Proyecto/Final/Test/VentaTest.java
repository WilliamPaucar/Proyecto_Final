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
public class VentaTest {
     public VentaTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IVenta ventaDao = new VentaImpl();
        IVendedor vendedorDao = new VendedorImpl();
        Vendedor vendedor = vendedorDao.obtener(1);
        ICliente clienteDao = new  ClienteImpl();
        Cliente cliente = clienteDao.obtener(1);
        Venta venta = new Venta(3, cliente,vendedor,new Date(),"Egresos","NC",  "Tiendas", 14 );

        try{
            filasAfectadas = ventaDao.insertar(venta);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE PEdido
        List<Venta> lista = new ArrayList<>();
        try {
            lista = ventaDao.obtener();
            for (Venta c:lista){
                System.out.println("---Datos Venta---");
                System.out.println("IdVenta :"+c.getIdventa());
                System.out.println("Cliente :"+c.getCliente().getIdcliente());
                System.out.println("Vendedor :"+c.getVendedor().getIdvendedor());
                System.out.println("Fecha  :"+c.getFecha());
                System.out.println("Tipo_comprobante :"+c.getTipo_coprobante());
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
