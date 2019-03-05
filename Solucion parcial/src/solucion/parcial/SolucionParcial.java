/*
 * Jonathan David Gonzalez Bustamante
 * 0901-17-2517
 */
//Este programa complementara al parcial numero 1  variante a
package solucion.parcial;

import javax.swing.JOptionPane;

public class SolucionParcial {


    public static void main(String[] args) 
    {
        
        int planilla[][]=new int[11][4];
        String nom[][]=new String[11][4];
        String strcant,strop;
        int i=0,op=0,j=0,k=0,total_final=0;
        
        do 
        {
           i=i+1;
           nom[i][1]=JOptionPane.showInputDialog("Ingrese su nombre");
           nom[i][2]=JOptionPane.showInputDialog("Ingrese el nombre del producto");
           strcant=JOptionPane.showInputDialog("Ingrese la cantidad");
           planilla[i][1]=1+(int)(Math.random()*200);
           planilla[i][2]=Integer.parseInt(strcant);
           planilla[i][3]=planilla[i][1]*planilla[i][2];
           
           strop=JOptionPane.showInputDialog("Desea agregar otro producto (si=1) o (no=0)");
           op=Integer.parseInt(strop);
           
           if(i==10)
           {
               op=0;
           }
           
        }
        while(op!=0);
        
        for(i=1;i<=10;i++)
        {
            System.out.println();
            
            for(k=1;k<=2;k++)
            {
              System.out.print(nom[i][k]+" ");
            }
            for(j=1;j<=3;j++)
            {
              System.out.print(planilla[i][j]+" ");  
            }
            
        }    
        System.out.println();
        System.out.println();
        for(i=1;i<=10;i++)
            {
              total_final=total_final+planilla[i][3];
            }
        
        System.out.print("El total a pagar es de: "+total_final);
        
        
    }
    
}
