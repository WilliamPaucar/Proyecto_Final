/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IIngreso {
    public int insertar (Ingreso ingreso) throws Exception;
    public int modificar(Ingreso ingreso) throws Exception;
    public int eliminar(Ingreso ingreso) throws Exception;
    public Ingreso obtener(int codigo) throws Exception;
    public Ingreso obtener_x_TipoC(String tipo_comprobante) throws Exception;
    public Ingreso obtener_x_Serie(String serie) throws Exception;
    public Ingreso obtener_x_Correlativo(String correlativo) throws Exception;
    public Ingreso obtener_x_Igv(float igv) throws Exception;
    public List<Ingreso> obtener() throws Exception;
    
}
