package taller3.decimal;
/**
 *
 * @author alexander
 */
import java.util.Scanner;

public class Multiplicacion {
  static float num1, num2;

  static CMultiplicacion obj = new CMultiplicacion();

  public static void main(String[] args) {
    pedirDatos();
    operacion();
    mostrar();
  }

  public static void pedirDatos() {

    Scanner in = new Scanner(System.in);
    CMultiplicacion obj = new CMultiplicacion();

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
    System.out.println("la multiplicacion es: " + obj.getMultiplicacion());

  }

}
