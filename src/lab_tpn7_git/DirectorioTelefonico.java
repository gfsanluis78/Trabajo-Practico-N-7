package lab_tpn7_git;

import java.util.*;


public class DirectorioTelefonico {
    Map<Long,Cliente> clientes = new TreeMap<>();

    public DirectorioTelefonico() {
    }
    
    
    
    public void agregarCliente(Long telefono, Cliente cliente){
        clientes.put(telefono, cliente);
        
    }
    
    public Cliente buscarCliente(Long telefono){
        if(clientes.containsKey(telefono)){
        return clientes.get(telefono);
        }
        else {
            System.out.println("No hay cliente con ese numero de telefono");
            return null;
            }
    }
    
    public Set<Long> buscarTelefono(String apellido){
       HashSet<Long>listaDeTel = new HashSet<>();
       HashSet<Long>listaDeDni = new HashSet<>();
 
       Long claveUnica=0L;
       for (Map.Entry<Long,Cliente> cliente: clientes.entrySet()){
           Long clave= cliente.getKey();
           Cliente elCliente = cliente.getValue();
           String elApellido= elCliente.getApellido();
           if(elApellido.equalsIgnoreCase(apellido)){
             listaDeTel.add(clave);
         
           }
       }
              return listaDeTel;
      
       
    }
    
    
    public void borrarCliente(long dni){
        Long c=0L;
        String elC=null;
        for (Map.Entry<Long,Cliente> cliente: clientes.entrySet()){
           Long clave= cliente.getKey();
           Cliente elCliente = cliente.getValue();
           long dniCliente= elCliente.getDni();
           
           if(dniCliente==dni){
               c=clave;
               elC=elCliente.getApellido();      
           }
        }
        System.out.println("El Cliente "+elC+" fue removido");
        clientes.remove(c);
        
    }
}
