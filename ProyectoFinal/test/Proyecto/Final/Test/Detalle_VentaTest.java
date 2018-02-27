
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
public class Detalle_VentaTest {
     public Detalle_VentaTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
    
        //              INSERTAR
        int filasAfectadas =0;
        IDetalleVenta detalleVentaDao = new Detalle_VentaImpl();
        IVenta ventaDao = new VentaImpl();
        Venta venta = ventaDao.obtener(1);
        //Detalle_Venta detalleVenta = new Detalle_Venta(1,venta ,200,150,30,Articulo);
        try{
            //filasAfectadas = detalleVentaDao.insertar(detalleVenta);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE DETALLE VENTA
        List<Detalle_Venta> lista = new ArrayList<>();
        try {
            lista = detalleVentaDao.obtener();
            for (Detalle_Venta c:lista){
                System.out.println("---Datos Detalle Venta---");
                System.out.println("IdDetalle_Venta :"+c.getIddetalle_venta());
                System.out.println("Venta :"+c.getVenta().getIdventa());
                System.out.println("Cantidad :"+c.getCantidad());
                System.out.println("precio_venta :"+c.getPrecio_venta());
                System.out.println("Descuento  :"+c.getDescuento());
          }
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }
    
}
