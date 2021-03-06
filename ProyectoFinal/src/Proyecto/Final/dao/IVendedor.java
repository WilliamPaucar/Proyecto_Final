
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IVendedor {
    public int insertar (Vendedor vendedor) throws Exception;
    public int modificar(Vendedor vendedor) throws Exception;
    public int eliminar(Vendedor vendedor) throws Exception;
    public Vendedor obtener(int codigo) throws Exception;
    public Vendedor obtener_x_nombre(String nombres) throws Exception;
    public List<Vendedor> obtener() throws Exception;
    
}
