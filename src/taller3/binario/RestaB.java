package taller3.binario;


import taller3.Utils;

/**
 *
 * @author Andres
 */
public class RestaB {

    public static String resta(String b1, String b2, boolean minus) {
        Utils utils = new Utils();
        int bin1Len = b1.length();
        int bin2Len = b2.length();
        int maxLen = max(bin1Len, bin2Len);
        String binary1 = utils.padWithZeros("left", b1, maxLen);
        String binary2 = utils.padWithZeros("left", b2, maxLen);
        String result = "";
        int carry = 0;
        for (int i = maxLen - 1; i > -1; i--) {
            int binI = extractInteger(binary1, i);
            int bin2I = extractInteger(binary2, i);
            int num = binI - bin2I - carry;
            result = Math.floorMod(num, 2) == 1 ? "1" + result : "0" + result;
            carry = num < 0 ? 1 : 0;

        }
        if (carry != 0) {
            result = "01" + result;
        }
        result = cleanZeros(result);
        if (minus) {
            result = "-" + result;
        }
        return result;
    }

    private static int max(int a, int b) {
        int maxVal = a > b ? a : b;
        return maxVal;
    }

    private static int extractInteger(String input, int index) {
        char c = input.charAt(index);
        String res = String.valueOf(c);
        return Integer.parseInt(res);
    }

    private static String cleanZeros(String input) {
        int indexBit1 = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                indexBit1 = i;
                break;
            }
        }
        String res = indexBit1 != -1 ? input.substring(indexBit1) : input;
        return res;
    }
}
