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
public class Detalle_IngresoTest {
      public Detalle_IngresoTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IDetalle_Ingreso  detalleingresoDao = new Detalle_IngresoImpl();
        IIngreso ingresoDao = new IngresoImpl();
        Ingreso ingreso =  ingresoDao.obtener(1);
        IArticulo articuloDao = new  ArticuloImpl();
        Articulo articulo = articuloDao.obtener(1);
        Detalle_Ingreso detalle_ingreso = new Detalle_Ingreso(8,ingreso, articulo,150,175, 200,50, new Date(), new Date() );
        try{
            filasAfectadas = ingresoDao.insertar(ingreso);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE  DETALLE INGRESO
        List<Detalle_Ingreso> lista = new ArrayList<>();
        try {
            lista = detalleingresoDao.obtener();
            for (Detalle_Ingreso c:lista){
                 
                System.out.println("---Datos Detalle_Ingreso---");
                System.out.println("IdDetalle_Ingreso :"+c.getIddetalle_ingreso());
                System.out.println("Ingreso :"+c.getIngreso().getIdingreso());
                System.out.println("Articulo :"+c.getArticulo().getIdarticulo());
                System.out.println("precio_compra  :"+c.getPrecio_compra());
                System.out.println("precio_venta :"+c.getPrecio_venta());
                System.out.println("Stock_inicial :"+c.getStock_inicial());
                System.out.println("stock_actual  :"+c.getStock_actual());
                System.out.println("Fecha_produccion :"+c.getFecha_produccion());
                System.out.println("Fecha_vencimiento  :"+c.getFecha_vencimiento());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

    
}
