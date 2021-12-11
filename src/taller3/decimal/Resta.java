package taller3.decimal;

/**
 *
 * @author alexander
 */

public class Resta {
  static float num1, num2;

  static CResta obj = new CResta();

  public static void operacion(float num1, float num2) {
    obj.setDatos(num1, num2);
  }

  public static void mostrar() {
    System.out.println("la resta es: " + obj.getResta());

  }

}
