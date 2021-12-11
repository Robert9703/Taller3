package taller3.decimal;
/**
 *
 * @author Alexander
 */


public class Division {
  static float num1, num2;

  static CDivision obj = new CDivision();

  
  public static void operacion(float num1,float num2) {
    obj.setDatos(num1, num2);
  }

  public static void mostrar() {
    System.out.println("la division es: " + obj.getDivision());
  }

}
