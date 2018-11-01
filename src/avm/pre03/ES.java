/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avm.pre03;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ES {
    //Definición de variables
 
        
    public static int leerEntero(){
        int dimeEntero;
        System.out.println("Dime un número entero");
        Scanner teclado = new Scanner(System.in);        
        dimeEntero = teclado.nextInt();
        return dimeEntero;
     }
    
    
    public static long leerEnteroLargo(){
        long dimeEntLargo;
        System.out.println("Dime un número entero largo");
        Scanner teclado = new Scanner(System.in);        
        dimeEntLargo = teclado.nextLong();
        return dimeEntLargo;
     }
    
     public static float leerReal(){
        float dimeReal;
        System.out.println("Dime un número real");
        Scanner teclado = new Scanner(System.in);        
        dimeReal = teclado.nextFloat();
        return dimeReal;
     }
    
      public static double leerRealLargo(){
        double dimeRealLargo;
        System.out.println("Dime un número real largo");
        Scanner teclado = new Scanner(System.in);        
        dimeRealLargo = teclado.nextDouble();
        return dimeRealLargo;
     }
     
       public static String leerCadena(){
        String dimeCadenaCar;
        System.out.println("Escribe cadena de caracteres");
        Scanner teclado = new Scanner(System.in);        
        dimeCadenaCar = teclado.nextLine();
        return dimeCadenaCar;
     }
       
    /* Este método no es valido ya que no se pueden comprar dos cadenas con el == 
       sino con algunos de los métodos que implementan como puede ser equals.
       Por tanto, la condición podría ser algo así:
       if (dimeFalOVer.equals("falso") == true)o
       if (dimeFalOVer.equals("falso"))
       Por otra parte se si puedes leer un booleano desde teclado mediante el
       método nextBoolean(). De esta forma, si introduces True (da igual que
       las letras estén en mayúsculas o minúsculas) te va a devolver verdadero
       
       public static boolean leerBooleano(){
        boolean falOVer;
        String dimeFalOVer;
        System.out.println("Escribe falso o verdadero");
        Scanner teclado = new Scanner(System.in);        
        dimeFalOVer = teclado.nextLine();
        if (dimeFalOVer == "falso"){
            falOVer = false;
            }
        else{
            falOVer = true;
            }
        return falOVer;
    }
    */
    
     public static char leerCaracter(){
        char dimeCaracter;
        System.out.println("Escribe un caracter");
        Scanner teclado = new Scanner(System.in);        
        dimeCaracter = teclado.next().charAt(0);
        return dimeCaracter;
     }   
       
    public static boolean leerBooleano(){
        boolean falOVer;
        System.out.println("Dime si es true o false");
        Scanner teclado = new Scanner(System.in);        
        falOVer = teclado.nextBoolean();        
        return falOVer;
    }
    
    /* Otra opciópn más eficaz sería la siguiente:
     public static boolean leerBooleano(){
        boolean falOVer;
        String dimeFalOVer;
        System.out.println("Escribe falso o verdadero");
        Scanner teclado = new Scanner(System.in);        
        dimeFalOVer = teclado.nextLine();
        falOVer = !dimeFalOVer.equals("falso");
        return falOVer;
    }
    En esta opción se compara mediante equals, el valor de dimeFaolver con "false" y 
    asigna a la variable booleana falOver es contrario del valor de dicha comparación.
    Por ejemplo si dimeFalOver vale falso, la sentencia dimeFalOver.equals("falso")
    sería verdadera ya que la comparación es verdadera y mediante ! asignaría a 
    la variable booelana falOVer el valor false (que es lo que queremos asignar cuando
    el usuario introduce falso)
    */
       
       
    public static void Escribir(String a_escribir){
        System.out.print(a_escribir);
    }
    
      public static void EscribirLn(String a_escribir){
        System.out.print(a_escribir);
      }
}
