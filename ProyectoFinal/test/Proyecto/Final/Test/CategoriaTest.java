/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.Test;

import Proyecto.Final.Impl.CategoriaImpl;
import Proyecto.Final.dao.ICategoria;
import Proyecto.Final.rnegocio.entidades.Categoria;
import java.util.*;
import static junit.framework.Assert.*;
import org.junit.Test;


/**
 *
 * @author Gilda
 */
public class CategoriaTest {
      public CategoriaTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        ICategoria categoriaDao = new CategoriaImpl();
        Categoria categoria  = new Categoria(5, "Alimentos", "Manzanas");
        try{
            filasAfectadas = categoriaDao.insertar(categoria);
            System.out.println("Categoria ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE etiqueta
        List<Categoria> lista = new ArrayList<>();
        try {
            lista = categoriaDao.obtener();
            for (Categoria c:lista){
                System.out.println("---Datos de Categoria---");
                System.out.println("Idcategoria :"+c.getIdcategoria());
                System.out.println("Nombre :"+c.getNombre());
                System.out.println("Descripcion  :"+c.getDescripcion());
            
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

    
}
