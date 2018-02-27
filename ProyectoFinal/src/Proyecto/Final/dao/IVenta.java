
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IVenta {
    public int insertar (Venta venta) throws Exception;
    public int modificar(Venta venta) throws Exception;
    public int eliminar(Venta venta) throws Exception;
    public Venta obtener(int codigo) throws Exception;
    public Venta obtener_x_TipoC(String tipo_comprobante) throws Exception;
    public Venta obtener_x_Serie(String serie) throws Exception;
    public Venta obtener_x_Correlativo(String correlativo) throws Exception;
    public Venta obtener_x_Igv(float igv) throws Exception;
    public List<Venta> obtener() throws Exception;
    
}
