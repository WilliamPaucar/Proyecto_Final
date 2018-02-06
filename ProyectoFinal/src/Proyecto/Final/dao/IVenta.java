
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IVenta {
    public int insertar (Venta venta) throws Exception;
    public int modificar(Venta venta) throws Exception;
    public int eliminar(Venta venta) throws Exception;
    public Venta obtener(int codigo) throws Exception;
    public List<Venta> obtener() throws Exception;
    
}
