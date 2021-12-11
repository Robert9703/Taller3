package taller3;

import java.util.Scanner;

public class Division {
    static float num1, num2;

    static cDivision obj = new cDivision();

    public static void main(String[] args) {
        pedirDatos();
        operacion();
        mostrar();
       }
     
       public static void pedirDatos(){
     
         Scanner in = new Scanner(System.in);
         cDivision obj = new cDivision();
     
     
         System.out.print("Inserte el primer numero: ");
         num1 = in.nextFloat();
         System.out.print("Inserte el segundo numero: ");
         num2 = in.nextFloat();
     
       }
     
       public static void operacion(){
         obj.setDatos(num1, num2);
       }
     
       public static void mostrar(){
         System.out.println("la division es: "+ obj.getDivision());
     
       }
    
}
