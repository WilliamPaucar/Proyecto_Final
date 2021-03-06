
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IArticulo {
     
    public int insertar (Articulo articulo) throws Exception;
    public int modificar(Articulo articulo) throws Exception;
    public int eliminar(Articulo articulo) throws Exception;
    public Articulo obtener(int idarticulo) throws Exception;
    public Articulo obtener_x_nombre(String nombre) throws Exception;
   
    public List<Articulo> obtener() throws Exception;
    
}
