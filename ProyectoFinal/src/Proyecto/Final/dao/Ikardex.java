/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.dao;
import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;
public interface Ikardex {
    public int insertar(kardex kardex) throws Exception;
    public int modificar(kardex kardex) throws Exception;
    public int eliminar(kardex kardex) throws Exception;
    public kardex obtener(int codigo) throws Exception;
    public List<kardex> obtener() throws Exception;
}
