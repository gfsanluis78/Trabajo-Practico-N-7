package lab_tpn7_git;

import java.util.*;


public class DirectorioTelefonico {
    private TreeMap<Long,Cliente> clientes = new TreeMap<>();

    public DirectorioTelefonico() {
    }
    
    
    
    public void agregarCliente(long telefono, Cliente cliente){
        if(!clientes.containsKey(telefono)){
        clientes.put(telefono, cliente);
            System.out.println("Se registro el cliente "+cliente.getApellido()+" "+cliente.getNombre()+" y el numero "+telefono);
        
    }else{
            System.out.println("El telefono "+telefono+" ya esta registrado y asociado a un cliente");
        }
    }
    
    public Cliente buscarCliente(long telefono){
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
               
            Set<Long> claves=clientes.keySet();
            Iterator<Long> it=claves.iterator();
            Long key;
            
            while(it.hasNext()){
                key=it.next();
                long aComparar = clientes.get(key).getDni();
                System.out.println("Se comparo "+aComparar+" "+dni);
                
                if(aComparar==dni){
                    System.out.println("Hay una coincidencia. El Cliente "+clientes.get(key).getApellido()+" fue removido");
                    it.remove();
                    clientes.remove(key);
                }
            }
        
        
        
        
 
//        Long c=0L;        // Se comenta porque funciona pero borra un solo registro, el primero que encuetra.
//        String elC=null;
//        for (Map.Entry<Long,Cliente> cliente: clientes.entrySet()){
//           Long clave= cliente.getKey();
//           Cliente elCliente = cliente.getValue();
//           long dniCliente= elCliente.getDni();
//           
//           if(dniCliente==dni){
//               c=clave;
//               elC=elCliente.getApellido();  
//               }
//        }
//        System.out.println("El Cliente "+elC+" fue removido");
//        clientes.remove(c);
        
    }
    
    public void imprimirClientes(){
        int n=1;
        for(Long it:clientes.keySet()){
            
            System.out.println(n+" telefono "+it+" Dni "+clientes.get(it).getDni()+" Nombre "+clientes.get(it).getApellido()+" "+clientes.get(it).getNombre());
            n++;
        }
    }
}
