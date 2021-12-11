package taller3.decimal;

/**
 *
 * @author alexander
 */

public class Suma {

  static float num1, num2;

  static CSuma obj = new CSuma();

  public static void operacion(float num1, float num2) {
    obj.setDatos(num1, num2);
  }

  public static void mostrar() {
    System.out.println("la suma es: " + obj.getSuma());

  }

}
