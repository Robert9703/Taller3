package taller3.decimal;

/**
 *
 * @author alexander
 */

import java.util.Scanner;

public class Suma {

  static float num1, num2;

  static CSuma obj = new CSuma();

  public static void main(String[] args) {
    pedirDatos();
    operacion();
    mostrar();
  }

  public static void pedirDatos() {

    Scanner in = new Scanner(System.in);
    CSuma obj = new CSuma();

    System.out.print("Inserte el primer numero: ");
    num1 = in.nextFloat();
    System.out.print("Inserte el segundo numero: ");
    num2 = in.nextFloat();
    in.close();
  }

  public static void operacion() {
    obj.setDatos(num1, num2);
  }

  public static void mostrar() {
    System.out.println("la suma es: " + obj.getSuma());

  }

}
