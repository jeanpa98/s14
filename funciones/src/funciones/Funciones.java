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
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String opcion2;
        int contadorCuentas = 1;
        boolean bandera = true;

        do {
            System.out.println("________ Menú de opciones______________");
            System.out.println("*Ingrese 1 para número del 1 al 10\n"
                    + "*Ingrese 2 para tabla de multiplicar del 8\n"
                    + "*Ingrese 3 para primeras diez potencias de 2\n"
                    + "*Ingrese 4 para Salir ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    listaNumeros();
                    break;
                case 2:
                    tablaMultiplicar();
                    break;
                case 3:
                    potenciaDos();
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
               System.out.printf("________CANTIDAD DE OPERACIONES________\n%s\n"
                +"", obtenerMensaje(contadorCuentas));
            }
            else {
                contadorCuentas = contadorCuentas + 1;
            }
        } while (bandera);
    }

    public static void listaNumeros() {
     
        
       
        System.out.println("Numeros del 1 al 100: ");                                                            
         int i=1;
         while(i<=10) {
                   System.out.println(i);                                                                         
                   i++;
         }
        
    
       
    }

    
    public static  void tablaMultiplicar() {
     Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;
 
        System.out.print("indica la tabla de multiplicar: ");
        numero = obtenerNumero.nextInt();
 
 
            for(j = 1; j <= 10; j++)
            {
                System.out.println(numero + " X " + j + " = " + numero*j);
            }
            System.out.println();
       
    }

    public static void potenciaDos() {
        int iNumeroPotencias = 10;
        for (int x=0;x<=iNumeroPotencias;x++){
        System.out.println("2 elevado a " + x + " igual a " + (int)Math.pow(2,x));
        
    }
    }

  
  

    public static String obtenerMensaje(int contadorCuentas) {
        String cadena = "";
        String[] mensajeFinal = {"Realizo de 1-2 operaciones",
            "Realizo de 2-3 operaciones", "Realizo de 3-4 operaciones","Realizo mas de 4 operaciones"};
        if ((contadorCuentas >= 1) && (contadorCuentas <= 2)) {
            cadena = mensajeFinal[0];
        } else {
            if ((contadorCuentas >= 2) && (contadorCuentas <= 3)) {
                cadena = mensajeFinal[1];
            } else {
                if (contadorCuentas >= 4) {
                    cadena = mensajeFinal[2];
                } else{
                    cadena=mensajeFinal[3];
                }
            }
        }
        return cadena;
    }
   
}
    
    

