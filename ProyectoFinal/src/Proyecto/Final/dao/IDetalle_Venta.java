
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IDetalle_Venta {
    public int insertar (Detalle_Venta  detalle_Venta) throws Exception;
        public int modificar(Detalle_Venta detalle_venta) throws Exception;
    public int eliminar(Detalle_Venta detalle_venta) throws Exception;
    public Detalle_Venta obtener(int codigo) throws Exception;
    public List<Detalle_Venta> obtener() throws Exception;
    
}
