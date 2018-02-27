/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface IProveedor {
    public int insertar (Proveedor proveedor) throws Exception;
    public int modificar(Proveedor proveedor) throws Exception;
    public int eliminar(Proveedor proveedor) throws Exception;
    public Proveedor obtener(int codigo) throws Exception;
    public Proveedor obtener_x_RazonS(String razon_social) throws Exception;
    public Proveedor obtener_x_SectorC(String sector_comercial) throws Exception;
    public Proveedor obtener_x_TipoD(String tipo_documento) throws Exception;
    public Proveedor obtener_x_NumeroD(String num_documento) throws Exception;
    public Proveedor obtener_x_Direccion(String direccion) throws Exception;
    public Proveedor obtener_x_Telefono(String telefono) throws Exception;
    public Proveedor obtener_x_Email(String email) throws Exception;
    public Proveedor obtener_x_Url(String url) throws Exception;
    public List<Proveedor> obtener() throws Exception;
    
}