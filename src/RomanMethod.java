import java.util.ArrayList;

public class RomanMethod {
    
    public int romanToInt(String s) {
        Character [] symbol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};
        ArrayList<Integer> temp = new ArrayList<>();
        int outputInt = 0;
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
    
    public String intToRoman(int numb) {
        String [] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String outputSymbol = "";
        
        while (numb > 0) {
            for (int i = 0; i < value.length; i++) {
                if (numb >= value[i]) {
                    
                    outputSymbol += symbol[i];
                    numb -= value[i];
                    System.out.println(numb);
                    break;
                }
            }
        }

        return outputSymbol;
    }
}