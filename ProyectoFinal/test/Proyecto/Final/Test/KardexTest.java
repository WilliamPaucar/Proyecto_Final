
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
public class KardexTest {
    
    public KardexTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
    
        //              INSERTAR
        int filasAfectadas =0;
        Ikardex kardexDao = new KardexImpl();
        IDetalle_Ingreso detalle_IngresoDao = new Detalle_IngresoImpl();
        Detalle_Ingreso detalle_Ingreso = detalle_IngresoDao.obtener(1);
        IDetalleVenta detalle_VentaDao = new Detalle_VentaImpl();
        Detalle_Venta detalleVenta = detalle_VentaDao.obtener(1);
        kardex kardex = new kardex(1,detalle_Ingreso,detalleVenta );
        try{
            filasAfectadas = detalle_VentaDao.insertar(detalleVenta);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE KARDEX
        List<Detalle_Venta> lista = new ArrayList<>();
        try {
            lista = detalle_VentaDao.obtener();
            for (Detalle_Venta c:lista){
                System.out.println("---Datos Kardex---");
                System.out.println("IdKardex :"+c.getIdkardex());
                //System.out.println("Detalle_ingreso :"+c.getDetalle_Ingreso().getIddetalle_ingreso());
                //System.out.println("Detalle_venta :"+c.getDetalle_Venta().getIddetalle_venta());
           }
         } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }
    
}
