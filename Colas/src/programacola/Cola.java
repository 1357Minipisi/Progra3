
package programacola;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cola {
    Nodo primero; //es la cabeza  
    Nodo ultimo;
    String opcion, buscar;
    Scanner teclado = new Scanner(System.in);
    private int longitud=0;
    
    public Cola(){
        primero = null;
        ultimo = null;
    }
    // metodo para insertar datos a la cola
    public void insertarNodo(){

        Nodo nuevo = new Nodo();
        opcion=JOptionPane.showInputDialog(null," \n Ingrese el dato que contenga el nodo");
        nuevo.dato=Integer.parseInt(opcion);
        
   
        if(primero== null)// si es la cabeza o la cola
        {
            primero = nuevo;
            primero.siguiente= null;   
            ultimo = nuevo;
        }
        else
        {
            ultimo.siguiente= nuevo; 
            nuevo.siguiente= null; 
            ultimo = nuevo; // ahora el dato ultomo es el ingresado
        }
        longitud++;
      
    }
    
    
    public void buscarNodo()
    {
        Nodo actual= new Nodo();
        actual = primero;
        int nodobuscar;
        boolean encontrado = false;
        
        buscar=JOptionPane.showInputDialog(null," ingrese el dato que desea buscar");
        nodobuscar=Integer.parseInt(buscar);
        
        if(primero != null)
        {
            while(actual != null && encontrado != true) // si existe nodos en la cola
            {
               if(actual.dato == nodobuscar)
               {
                   System.out.print("\n\n\n ----------\n");
                   System.out.print("DATO ENCONTRADO");
                   System.out.print("        \n"+ nodobuscar);
                   System.out.print("\n----------\n\n\n");
                   JOptionPane.showMessageDialog(null,"\n Nodo  con el dato:  "+actual.dato);
                   encontrado = true;
               }
                actual= actual.siguiente;
            }
            if(!encontrado)
            {
                System.out.print("\n\n DATO NO ENCONTRADO\n ");
                JOptionPane.showMessageDialog(null,"\n Nodo  con dato no encontrado"); 
            }
        }
     
        else
        {
            System.out.print("\n la cola se encuentra vacia \n");
        }         
    }
    
    public void mostrarcola()
    {
        Nodo actual= new Nodo();
        actual = primero;
        if(primero != null)
        {
            System.out.print("  LA COLA ES \n");
            System.out.print(" ----------");
            while(actual != null) // si existe nodos en la cola
            {
               
                System.out.print("        \n"+ actual.dato);
                System.out.print("\n ----------\n");
                actual= actual.siguiente;
            }
        }
        else
        {
            System.out.print("\n la cola se encuentra vacia \n");
        }
    }
    
    public void eliminarnodo()
    {
        Nodo actual= new Nodo();
        actual = primero;
        Nodo anterior = new Nodo();
        anterior = null;
        int nodobuscar;
        boolean encontrado = false;
        
        buscar=JOptionPane.showInputDialog(null," ingrese el dato que desea Eliminarr");
        nodobuscar=Integer.parseInt(buscar);
        
        if(primero != null)
        {
            while(actual != null && encontrado != true) // si existe nodos en la cola
            {
               if(actual.dato == nodobuscar)
               {
                   if(actual == primero)
                   {
                       primero= primero.siguiente;
                   }
                   else if( actual == ultimo)
                   {
                       anterior.siguiente= null;
                       ultimo= anterior;
                   }
                   else
                   {
                       anterior.siguiente = actual.siguiente;
                   }

                   JOptionPane.showMessageDialog(null,"\n Nodo eliminado");
                   encontrado = true;
               }
               anterior = actual;
               actual= actual.siguiente;
            }
            if(!encontrado)
            {
                System.out.print("\n\n DATO NO ENCONTRADO\n ");
                JOptionPane.showMessageDialog(null,"\n Nodo  con dato no encontrado"); 
            }
        }
     
        else
        {
            System.out.print("\n la cola se encuentra vacia \n");
        } 
        longitud--;
        
    }
    
    //Metodo para comprobar que la cola no esta vacia
        public boolean estaVacia()
        {
        boolean cola=false;
        if(primero ==null)
        {
        cola=true;
        System.out.println("\n\n La cola esta vacia");
        }
        else
        {
        System.out.println("\n\n La cola no esta vacia");
        mostrarcola();
        cola=false;
        }
        return cola;
        }
        
        
       //Metodo para contar los elementos de la cola
     public int contar() {
		return longitud;
                 
	}
     
     public void cuantos()
     {
         System.out.println("\n\n La cola es de tamaño;   "+longitud);
     }
    
}
