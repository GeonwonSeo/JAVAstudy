package Section_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecursionPractice {
    static int sumTo(int num) {
        if (num == 0) return 0;
        return num + sumTo(num - 1);
    }

    boolean isOdd(int num) {
        if (num == 1) return true;
        else if (num == 0) return false;
        return num > 0 ? isOdd(num - 2) : isOdd(num + 2);
    }

    int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }

    int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    int arrSum(int[] arr) {
        if (arr.length == 0) return 0;
        return arr[0] + arrSum(Arrays.copyOfRange(arr, 1, arr.length));
    }

    int arrProduct(int[] arr) {
        if (arr.length == 0) return 1;
        return arr[0] * arrProduct(Arrays.copyOfRange(arr, 1, arr.length));
    }

    int arrLength(int[] arr) {
        if (arr.length == 0) return 0;
        return arrLength(Arrays.copyOfRange(arr, 1, arr.length)) + 1;
    }

    int[] drop(int num, int[] arr) {
        if (num == 0 || arr.length == 0) return arr;
        return drop(num - 1, Arrays.copyOfRange(arr, 1, arr.length));
    }

    int[] take(int num, int[] arr) {
        if (num >= arr.length) return arr;
        return take(num, Arrays.copyOfRange(arr, 0, arr.length - 1));
    }

    public boolean and(boolean[] arr) {
        if (arr.length == 0) return true;
        return arr[0] && and(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public boolean or(boolean[] arr) {
        if (arr.length == 0) return false;
        return arr[0] || or(Arrays.copyOfRange(arr, 1, arr.length));
    }

    public static int[] reverseArr(int[] arr){
        // TODO: 1234
        if (arr.length ==0) return new int[0];
        int[] Max = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] temp = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));
        int[] answer =new int[Max.length+temp.length];
        System.out.println("HEAD ="+Arrays.toString(Max)
                +" "+Max.length +" TAIL ="+Arrays.toString(temp)+" "+temp.length);
        System.arraycopy(Max,0,answer,0,1);
        System.arraycopy(temp,0,answer,1,temp.length);
        return answer;
    }
    public static void main(String[] args) {
        String[] arrEx = new String[]{"A", "B", "C", "D"};
        int[] iarrEx = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArr(iarrEx)));
    }
}

