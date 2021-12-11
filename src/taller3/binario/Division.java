package taller3.binario;

import java.util.Scanner;
/**
 *
 * @author andres
 */
import taller3.Utils;
public class Division {
    static Utils utils = new Utils();
    static Resta resta = new Resta();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binario dividendo");
        String bin1 = sc.nextLine();
        System.out.println("Binario divisor");
        String bin2 = sc.nextLine();
        sc.close();
        String res = division("10100","101");
        System.out.println(res);

    }
    private static String division(String dividendo,String divisor) {

        String result ="";
        String temp ="0";
        String residuo = "0";
        for (int i = 0; i < dividendo.length(); i++) {
            if(utils.binaryGreaterThanNum(divisor, Integer.parseInt(temp,2))){
                result+= "0";
                temp += dividendo.charAt(i);
            }else{
                residuo = resta.resta(temp, divisor, false);
                if(Integer.parseInt(residuo,2) == 0){
                    temp = String.valueOf(dividendo.charAt(i));
                    result += "1";
                }else{
                    residuo=utils.cleanZeros(residuo);
                    result+="1";
                    temp = residuo + dividendo.charAt(i);
                }
            }
        }
        if(Integer.parseInt(temp,2) == 0){
            result= result + "0";
        }
        return utils.cleanZeros(result);
    }
}
