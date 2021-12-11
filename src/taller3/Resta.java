package taller3;

import java.util.Scanner;

public class Resta {
    static float num1,num2;

  static cresta obj = new cresta();
  
 public static void main(String[] args) {
   pedirDatos();
   operacion();
   mostrar();
  }

  public static void pedirDatos(){

    Scanner in = new Scanner(System.in);
    cresta obj = new cresta();


    System.out.print("Inserte el primer numero: ");
    num1 = in.nextFloat();
    System.out.print("Inserte el segundo numero: ");
    num2 = in.nextFloat();

  }

  public static void operacion(){
    obj.setDatos(num1, num2);
  }

  public static void mostrar(){
    System.out.println("la resta es: "+ obj.getResta());

  }

    
    
}
