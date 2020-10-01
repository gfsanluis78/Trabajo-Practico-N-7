
package lab_tpn7_git;

import java.util.Iterator;

public class Lab_TpN7_Git {

    public static void main(String[] args) {
        Cliente cli1=new Cliente("Genaro", "Farias", 26525567, "San Luis ", "Italia 2332");
        Cliente cli2=new Cliente("Abril", "Farias", 44567987, "Mendoza", "Holanda 2332");
        Cliente cli3=new Cliente("Patricia", "Garro", 27954943, "San Luis ", "Panama 2332");
        Cliente cli4=new Cliente("Juan", "Perez", 26999888, "Los Angeles ", "Brasil 2332");
        Cliente cli5=new Cliente("Francisco", "Carreño", 34897654, "San Luis ", "San martin 2332");
    
        DirectorioTelefonico Dir2020 = new DirectorioTelefonico();
    
        Dir2020.agregarCliente(2664100, cli1);
        Dir2020.agregarCliente(2664124, cli4);
        Dir2020.agregarCliente(2664135, cli3);
        Dir2020.agregarCliente(2664109, cli2);
        Dir2020.agregarCliente(2664102, cli1);
        Dir2020.agregarCliente(2664199, cli5);
        Dir2020.agregarCliente(2664102, cli2);
        Dir2020.agregarCliente(2664178, cli5);
        
        System.out.println("----------------------------------------------------");
        
        Dir2020.imprimirClientes();
        
        System.out.println("----------------------------------------------------");
        
          
       System.out.println("Se desea buscar un cliente por su telefono");
       long telefono=2664102;
       System.out.println("El cliente con el numero "+telefono+" es "+Dir2020.buscarCliente(telefono).getApellido());
       
       System.out.println("----------------------------------------------------");
        
        
       System.out.println("Se desea buscar los telefono del cliente por su apellido");
       String apellido="farias";
       System.out.println("Lista de numeros del Cliente "+apellido+":");
       Iterator ite;
       int c=1;
        ite = Dir2020.buscarTelefono(apellido).iterator();
       while(ite.hasNext()){
            System.out.println("Numero "+c+": "+ ite.next());
            c++;
       }
       System.out.println("----------------------------------------------------");   
        System.out.println("Muestro los numeros de "+apellido+" "+Dir2020.buscarTelefono(apellido)); //Otra forma mas simple de mostrarlos sin el iterador
       System.out.println("----------------------------------------------------");    
        
       Dir2020.borrarCliente(26525567);
       System.out.println("----------------------------------------------------"); 
       Dir2020.imprimirClientes();
    
    }
    
    
    
    
}
