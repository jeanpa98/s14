/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class meses {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int opcion;
        String opcion2;
        int contadorCuentas = 1;
        boolean bandera = true;
        

        do {
            System.out.println("________ Menú de opciones______________");
            System.out.println("*Ingrese 1 para meses del año");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    mesesAño();
                    break;
                default:
                    System.out.println("Existe un error: el valor no se encuentra "
                            + "en los rangos establecidos");
                           
                    contadorCuentas = contadorCuentas + 1;
                    break;
            }
            System.out.println("Escriba SI para realizar mas operaciones \n"
                    + "Escriba NO para dejar de realizar operaciones ");
            opcion2 = entrada.nextLine();
            opcion2 = opcion2.toUpperCase();
            if (opcion2.equals("NO")) {
                bandera = false;
               
            }
            else {
            }
        } while (bandera);
    }

  public static void mesesAño() {
       Scanner entrada = new Scanner(System.in);
       int Mes;
       System.out.println ("Ingrese el numero del mes del año");
       Mes = entrada.nextInt();
       System.out.println(Mes);
     
       switch (Mes)
     
       {
           case 1: System.out.println("Enero");
           break;
         
           case 2: System.out.println("Febrero");
           break;
         
           case 3: System.out.println("Marzo");
           break;
         
           case 4: System.out.println("Abril");
           break;
         
           case 5: System.out.println("Mayo");
           break;
         
           case 6: System.out.println("Junio");
           break;
         
           case 7: System.out.println("Julio");
           break;
         
           case 8: System.out.println("Agosto");
           break;
         
           case 9: System.out.println("Septiembre");
           break;
         
           case 10: System.out.println("Octubre");
           break;
         
           case 11: System.out.println("Noviembre");
           break;
         
           case 12: System.out.println("Diciembre");
           break;
           
           default:
                    System.out.println("Existe un error: el valor no se encuentra "
                            + "en los rangos establecidos");
         
         
     
     
       }
     
    }
   
}
       
      
  
       
       
  

  


    