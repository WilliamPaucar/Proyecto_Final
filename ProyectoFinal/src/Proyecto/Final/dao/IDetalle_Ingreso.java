
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IDetalle_Ingreso {
    public int insertar (Detalle_Ingreso detalle_Ingreso) throws Exception;
    public int modificar(Detalle_Ingreso detalle_Ingreso) throws Exception;
    public int eliminar(Detalle_Ingreso detalle_Ingreso) throws Exception;
    public Detalle_Ingreso obtener(int codigo) throws Exception;
    public List<Detalle_Ingreso> obtener() throws Exception;
    
}
