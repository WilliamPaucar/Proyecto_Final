
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface ICliente {
    public int insertar (Venta venta) throws Exception;
    public ArrayList<Venta> obtener() throws Exception;
    
}
