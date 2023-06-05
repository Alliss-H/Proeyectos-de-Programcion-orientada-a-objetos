package practicas.patrones.repositorios;

import java.util.ArrayList;
import java.util.List;

import practicas.patrones.dominio.Cliente;

public class ClienteListDao implements IClienteDAO
{
   List<Cliente> clientesLista = new ArrayList<>();

   public ClienteListDao()
   {
      clientesLista.add(new Cliente(10, "0914526387", "CARLOS ALBERTO ANDRADE"));
      clientesLista.add(new Cliente(20, "0845127963", "MARTHA CECILIA AMPUERO"));
      clientesLista.add(new Cliente(30, "0796853214", "ANDREA SOPHIA SALAS"));
   }

   @Override
   public void insertar(Cliente cliente) 
   {
      clientesLista.add(cliente);      
   }

   // #region por implementar
   @Override
   public void actualizar(Cliente cliente) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public Cliente buscar(int codigo) 
   {
      for (Cliente cliente : clientesLista) 
      {
         if (cliente.getCodigo() == codigo)
            return cliente;
      }   

      return null;
   }

   @Override
   public void eliminar(Cliente codigo) {
      // TODO Auto-generated method stub
      
   }

   //#endregion

   @Override
   public List<Cliente> consultarTodos()
   {
      return clientesLista;
   }
   
}
