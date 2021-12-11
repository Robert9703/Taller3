package taller3;

public class Utils {
   
    public String padWithZeros(String direction,String input,int length){
        String res = direction == "left"? leftPad(input, length, "0"):rightPad(input, length, "0");
        return res;
    }
    // RightPad and LeftPad thanks to strobering answer in StackOverflow
    private String rightPad(String input, int length, String fill) {
        String pad = input.trim() + String.format("%" + length + "s", "").replace(" ", fill);
        return pad.substring(0, length);
    }

    private String leftPad(String input, int length, String fill) {
        String pad = String.format("%" + length + "s", "").replace(" ", fill) + input.trim();
        return pad.substring(pad.length() - length, pad.length());
    }
    public boolean binaryGreaterThanNum(String binary,int num){
        int binaryNum = binaryToInteger(binary);
        return binaryNum > num;
    }
    private int binaryToInteger(String binary){
        int num = Integer.parseInt(binary,2);
        return num;
    }
    public String cleanZeros(String input) {
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
