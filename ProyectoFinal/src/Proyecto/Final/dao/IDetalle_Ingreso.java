
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IDetalle_Ingreso {
    public int insertar (Detalle_Ingreso detalle_Ingreso) throws Exception;
    public int modificar(Detalle_Ingreso detalle_Ingreso) throws Exception;
    public int eliminar(Detalle_Ingreso detalle_Ingreso) throws Exception;
    public Detalle_Ingreso obtener(int codigo) throws Exception;
    public Detalle_Ingreso obtener_x_precioC(double precio_compra) throws Exception;
    public Detalle_Ingreso obtener_x_precioV(double precio_venta) throws Exception;
    public Detalle_Ingreso obtener_x_StockI(int stock_inicial) throws Exception;
    public Detalle_Ingreso obtener_x_StockA(int stock_actual) throws Exception;
    public List<Detalle_Ingreso> obtener() throws Exception;
    
}
