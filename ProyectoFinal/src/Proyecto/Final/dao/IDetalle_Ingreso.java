
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IDetalle_Ingreso {
    public int insertar (Detalle_Ingreso detalle_Ingreso) throws Exception;
    public ArrayList<Detalle_Ingreso> obtener() throws Exception;
    
}
