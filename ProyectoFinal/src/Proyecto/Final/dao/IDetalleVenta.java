
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IDetalleVenta {
    public int insertar (Detalle_Venta  detalle_Venta) throws Exception;
        public int modificar(Detalle_Venta detalle_venta) throws Exception;
    public int eliminar(Detalle_Venta detalle_venta) throws Exception;
    public Detalle_Venta obtener(int codigo) throws Exception;
    public Detalle_Venta obtener_x_Cantidad(int cantidad) throws Exception;
    public Detalle_Venta obtener_x_PrecioV(double precio_venta) throws Exception;
    public Detalle_Venta obtener_x_Descuento(double descuento) throws Exception;
    public List<Detalle_Venta> obtener() throws Exception;
    
}
