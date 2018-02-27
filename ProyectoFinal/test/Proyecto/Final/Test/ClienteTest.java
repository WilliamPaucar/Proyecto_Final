
package Proyecto.Final.Test;
import Proyecto.Final.Impl.ClienteImpl;
import Proyecto.Final.dao.ICliente;
import Proyecto.Final.rnegocio.entidades.Cliente;
import java.util.*;
import static junit.framework.Assert.*;
import org.junit.Test;

public class ClienteTest {
    
     public ClienteTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        ICliente clienteDao = new ClienteImpl();
        Cliente cliente  = new Cliente(1223, "Juan","Perez", "M", new Date(), "Cedula", "15", "Riobamba", "0992817879", "Bobo@gmail.com" );
      
        try{
            filasAfectadas = clienteDao.insertar(cliente);
            System.out.println("Cliente ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE etiqueta
        List<Cliente> lista = new ArrayList<>();
        try {
            lista = clienteDao.obtener();
            for (Cliente c:lista){
                System.out.println("---Datos de Cliente---");
                System.out.println("idcliente :"+c.getIdcliente());
                System.out.println("Nombres :"+c.getNombres());
                System.out.println("Apellidos :"+c.getApellidos());
                System.out.println("Sexo :"+c.getSexo());
                System.out.println("Fecha_nacimiento :"+c.getFecha_nacimiento());
                System.out.println("tipo_documento:"+c.getTipo_documento());
                System.out.println("Num_documento :"+c.getNum_documento());
                System.out.println("Direccion :"+c.getDireccion());
                System.out.println("Telefono :"+c.getTelefono());
                System.out.println("Direccion :"+c.getDireccion());
                System.out.println("Email  :"+c.getEmail());          
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}
