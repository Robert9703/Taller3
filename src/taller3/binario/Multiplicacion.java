package taller3.binario;

public class Multiplicacion {
    public static String multiply(String s1, String s2) {
        Suma s = new Suma();
        String result = "";
        String zeroSuffix = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            if (s2.charAt(i) == '1') {
                result = s.suma(result, s1 + zeroSuffix);
            }
            zeroSuffix += "0";
        }
        return result;
    }
}
