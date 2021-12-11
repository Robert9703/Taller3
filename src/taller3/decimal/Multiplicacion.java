package taller3.decimal;

/**
 *
 * @author Alexander
 */

public class Multiplicacion {
  static float num1, num2;

  static CMultiplicacion obj = new CMultiplicacion();

  public static void operacion(float num1, float num2) {
    obj.setDatos(num1, num2);
  }

  public static void mostrar() {
    System.out.println("la multiplicacion es: " + obj.getMultiplicacion());

  }

}
