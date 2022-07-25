package Section_2;

import java.util.*;

class DailyCodingPractice {
    static HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if (arr.length == 0) return null;
        HashMap<String,String> tmal = new HashMap<>();
        tmal.put(arr[0],arr[arr.length-1]);
        return tmal;
    }
    int computeWhenDouble(double interestRate) {
        // TODO:
        int temp =1;
        while (2/Math.pow(1+(interestRate/100),temp)>1) {
            temp++;
        } return temp;
    }
    static boolean powerOfTwo(long num) {
        // TODO:
        if (num == 2 || num == 1) return true;
        long num2 = num/2;
        while (num2 % 2 == 0) {
            return powerOfTwo(num2);
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(transformFirstAndLast(new String[]{"K","A","B"}));
        System.out.println(powerOfTwo(16));
    }
}
