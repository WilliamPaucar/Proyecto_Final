
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IArticulo {
    public int insertar (Articulo articulo) throws Exception;
    public ArrayList<Articulo> obtener() throws Exception;
    
}
