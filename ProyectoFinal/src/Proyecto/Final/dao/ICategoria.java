/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.dao;

import Proyecto.Final.rnegocio.entidades.*;
import java.util.*;

public interface ICategoria {
    public int insertar (Categoria categoria) throws Exception;
        public int modificar(Categoria categoria) throws Exception;
       public int eliminar(Categoria categoria) throws Exception;
    public Categoria obtener(int codigo) throws Exception;
    public List<Categoria> obtener() throws Exception;
    
}
