package taller3.binario;

/**
 *
 * @author Andres
 */
import taller3.Utils;
public class DivisionB {
    static Utils utils = new Utils();
   
    public static String division(String dividendo,String divisor) {

        String result ="";
        String temp ="0";
        String residuo = "0";
        for (int i = 0; i < dividendo.length(); i++) {
            if(utils.binaryGreaterThanNum(divisor, Integer.parseInt(temp,2))){
                result+= "0";
                temp += dividendo.charAt(i);
            }else{
                residuo = RestaB.resta(temp, divisor, false);
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
