package taller3;

import java.util.Scanner;

public class Multiplicacion {
    static float num1, num2;

    static cMultiplicacion obj = new cMultiplicacion();

    public static void main(String[] args) {
        pedirDatos();
        operacion();
        mostrar();
       }
     
       public static void pedirDatos(){
     
         Scanner in = new Scanner(System.in);
         cMultiplicacion obj = new cMultiplicacion();
     
     
         System.out.print("Inserte el primer numero: ");
         num1 = in.nextFloat();
         System.out.print("Inserte el segundo numero: ");
         num2 = in.nextFloat();
     
       }
     
       public static void operacion(){
         obj.setDatos(num1, num2);
       }
     
       public static void mostrar(){
         System.out.println("la multiplicacion es: "+ obj.getMultiplicacion());
     
       }
    
}
