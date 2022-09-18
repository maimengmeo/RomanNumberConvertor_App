import java.util.ArrayList;

public class RomanMethod {
    
    public int romanToInt(String s) {
        Character [] symbol = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};
        ArrayList<Integer> temp = new ArrayList<>();
        int outputInt = 0;
        String string = s.toUpperCase();
        
        //split the string and add them into an array list
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (string.charAt(i) == symbol[j]) {
                    temp.add(value[j]);
                }
            }
        }
        
        //convert each element of the array list from roman symbol to int then add the number to output
        //if the current element is greater than the previous element, minus (2 * previous element)
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
        
        //subtract the number by element from value array until the number = 0,
        //each time the number is subtracted, that element will be converted to roman symbol
        //and added to the output string.
        //as long as the number is subtracted, the for loop inside is break, another for loop starts,
        //until numb = 0 
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