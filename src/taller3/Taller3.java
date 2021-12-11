package taller3;

import taller3.decimal.Suma;
import taller3.decimal.Resta;
import taller3.decimal.Multiplicacion;
import taller3.decimal.Division;

import java.util.Scanner;

import taller3.binario.SumaB;
import taller3.binario.RestaB;
import taller3.binario.MultiplicacionB;
import taller3.binario.DivisionB;


/**
 *
 * @author Andres
 * @author Alexander
 * @apiNote Esta calculadora no resuelve divisiones binarias cuyo resultado sea un binario decimal
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("1 para operaciones con decimales \n 2 para operaciones con binarios");
        Scanner in = new Scanner(System.in);
        int election = in.nextInt();
        System.out.println("1 para Sumar \n 2 para Restar \n 3 para multiplicar \n 4 para dividir");
        int operation = in.nextInt();
        String[] operations = {"Sumar","Restar","Multiplicar","Dividir"} ;
        if(election == 1){
            System.out.println("Primer numero a "+operations[operation - 1]);
            float num1 = in.nextFloat();
            System.out.println("Segundo numero a "+operations[operation - 1]);
            float num2 = in.nextFloat();
            operationDecimal(num1, num2, operation);
        }else{
            System.out.println("Primer binario a "+operations[operation - 1]);
            String bin1 = in.nextLine();
            System.out.println("Segundo binario a "+operations[operation - 1]);
            String bin2 = in.nextLine();
            operationBinary(bin1, bin2, operation);
        }
        in.close();

    }

    public static void suma(float num1, float num2) {
        Suma.operacion(num1,num2);
        Suma.mostrar();
    }

    public static void suma(String bin1, String bin2) {
        SumaB s = new SumaB();
        String res = s.suma(bin1, bin2);
        System.out.println("El resultado de su suma es :" + res);
    }

    public static void resta(float num1, float num2) {
        Resta.operacion(num1,num2);
        Resta.mostrar();
    }

    public static void resta(String bin1, String bin2) {
        boolean negativeSubstraction = Integer.parseInt(bin2, 2) > Integer.parseInt(bin1, 2);
        String res = negativeSubstraction ? RestaB.resta(bin2, bin1, true) : RestaB.resta(bin1, bin2, false);
        System.out.println("El resultado de su resta es :" + res);
    }

    public static void multiplicacion(float num1, float num2) {
        Multiplicacion.operacion(num1,num2);
        Multiplicacion.mostrar();
    }

    public static void multiplicacion(String bin1, String bin2) {
        String res = MultiplicacionB.multiply(bin1, bin2);
        System.out.println("El resultado de la multiplicacion es :" + res);
    }

    public static void division(float num1, float num2) {
        Division.operacion(num1,num2);
        Division.mostrar();
    }
    public static void division(String bin1, String bin2) {
        String res = DivisionB.division(bin1, bin2);
        System.out.println("El resultado de la division es :" + res);
    }
    public static void operationDecimal(float num1,float num2,int operation) throws Exception {
        if(operation == 1){
            suma(num1, num2);
        }else if(operation == 2) {
            resta(num1, num2);
        }else if(operation == 3){
            multiplicacion(num1, num2);
        }else if(operation == 4){
            division(num1, num2);
        }else{
            throw new Exception("Opciones permitidas 1,2,3,4");
        }
    }
    public static void operationBinary(String bin1,String bin2,int operation) throws Exception {
        if(operation == 1){
            suma(bin1, bin2);
        }else if(operation == 2) {
            resta(bin1, bin2);
        }else if(operation == 3){
            multiplicacion(bin1, bin2);
        }else if(operation == 4){
            division(bin1, bin2);
        }else{
            throw new Exception("Opciones permitidas 1,2,3,4");
        }
    }

}
