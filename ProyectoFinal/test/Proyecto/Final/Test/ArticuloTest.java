/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Final.Test;

import Proyecto.Final.Impl.ArticuloImpl;
import Proyecto.Final.Impl.CategoriaImpl;
import Proyecto.Final.dao.IArticulo;
import Proyecto.Final.dao.ICategoria;
import Proyecto.Final.rnegocio.entidades.Articulo;
import Proyecto.Final.rnegocio.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Gilda
 */
public class ArticuloTest {
     public ArticuloTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IArticulo articuloDao = new ArticuloImpl();
        ICategoria categoriaDao = new CategoriaImpl();
         Categoria categoria = categoriaDao.obtener(2);
        Articulo articulo = new Articulo(3, 12, "Ejemplo","Ejemplo",categoria);
          
        try{
            filasAfectadas = articuloDao.insertar(articulo);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE PEdido
        List<Articulo> lista = new ArrayList<>();
        try {
            lista = articuloDao.obtener();
            for (Articulo c:lista){
                System.out.println("---Datos articulo---");
                System.out.println("Idarticulo :"+c.getIdarticulo());
                System.out.println("Codigo :"+c.getCodigo());
                System.out.println("Nombre :"+c.getNombre());
                System.out.println("Descripcion :"+c.getDescripcion());
                System.out.println("Categoria :"+c.getCategoria().getIdcategoria());
                           }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

    
}
