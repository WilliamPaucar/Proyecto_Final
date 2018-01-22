
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IDetalleVenta {
    public int insertar (Detalle_Venta  detalle_Venta) throws Exception;
    public ArrayList<Detalle_Venta> obtener() throws Exception;
    
}
