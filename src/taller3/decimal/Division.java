package taller3.decimal;
/**
 *
 * @author alexander
 */
import java.util.Scanner;


public class Division {
  static float num1, num2;

  static CDivision obj = new CDivision();

  public static void main(String[] args) {
    pedirDatos();
    operacion();
    mostrar();
  }

  public static void pedirDatos() {

    Scanner in = new Scanner(System.in);
    CDivision obj = new CDivision();

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
    System.out.println("la division es: " + obj.getDivision());
  }

}
