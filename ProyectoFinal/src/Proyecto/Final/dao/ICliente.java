
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface ICliente {
    
    public int insertar(Cliente cliente) throws Exception;

    public int modificar(Cliente cliente) throws Exception;

    public int eliminar(Cliente cliente) throws Exception;

    public Cliente obtener(int codigo) throws Exception;
    
    public Cliente obtener_x_nombre(String nombre) throws Exception;

    public List<Cliente> obtener() throws Exception;

}
