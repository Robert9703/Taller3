package taller3.binario;
/**
 *
 * @author Andres
 */
import taller3.Utils;


public class SumaB {

    public String suma(String b1, String b2) {
        Utils utils = new Utils();
        int bin1Len = b1.length();
        int bin2Len = b2.length();
        int maxLen = this.max(bin1Len, bin2Len);
        String binary1 = utils.padWithZeros("left",b1, maxLen);
        String binary2 = utils.padWithZeros("left",b2, maxLen);
        StringBuilder result = new StringBuilder("0".repeat(maxLen + 1));
        int carry = 0;
        for (int i = maxLen - 1; i > -1; i--) {
            int r = carry;

            r += binary1.charAt(i) == '1' ? 1 : 0;
            r += binary2.charAt(i) == '1' ? 1 : 0;
            if (i + 1 != maxLen) {
                result.setCharAt(i + 1, r % 2 == 1 ? '1' : '0');
            } else {
                result.setCharAt(maxLen, r % 2 == 1 ? '1' : '0');
            }
            carry = r < 2 ? 0 : 1;

        }
        if (carry == 1) {
            result.replace(0, 1, "1");
        }
        String cleanedSum = this.cleanZeros(result.toString());
        return cleanedSum;
    }

    private int max(int a, int b) {
        int maxVal = a > b ? a : b;
        return maxVal;
    }

    

    private String cleanZeros(String input) {
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
