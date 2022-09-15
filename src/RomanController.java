import java.util.ArrayList;

public class RomanController {

    public static void main(String[] args) {
        RomanController test = new RomanController();
        System.out.println(test.intToRoman(321));
    }

    Character [] symbol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    int[] value = {1, 5, 10, 50, 100, 500, 1000};
    ArrayList<Integer> temp = new ArrayList<>();
    int outputInt = 0;
    String outputSymbol = "";

    public int romanToInt(String s) {
        String string = s.toUpperCase();

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (string.charAt(i) == symbol[j]) {
                    temp.add(value[j]);
                }
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            outputInt += temp.get(i);
            if (i > 0 && temp.get(i) > temp.get(i-1)){
                outputInt -= 2*temp.get(i-1);
            }
            System.out.println(outputInt);
        }

        return outputInt;
    }

    public String intToRoman(int n) {
        
        while (n > 0) {
            for (int i = value.length - 1; i >= 0; i--) {
                if (n >= value[i]) {
                    outputSymbol += symbol[i];
                    n -= value[i];
                    break;
                }
            }
        }
        return outputSymbol;
    }
}