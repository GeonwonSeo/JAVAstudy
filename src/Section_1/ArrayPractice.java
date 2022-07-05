package Section_1;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    static Scanner myInput = new Scanner(System.in);
    public static int getLastElement(int[] arr) {
        int arr1 = -1;
        if (arr.length != 0) {
            arr1 = arr[arr.length-1];
        } return arr1;
    }
    public static String[] getAllWords(String str) {
        int strNum = str.split(" ").length;
        String[] str1 = new String[strNum];
        if (strNum != 0){
            str1 = str.split(" ");
        } return str1;
    }
    public char[] getAllLetters(String str) {
        char[] letterGet = new char[str.length()];
        for (int i = 0;i< str.length(); i++) {
            letterGet[i] = str.charAt(i);
        } return letterGet;
    }
    public int getLargestElement(int[] arr) {
        int eleGet = arr[0];
        for (int i =0; i< arr.length; i++) {
            eleGet = Math.max(eleGet,arr[i]);
        } return eleGet;
    }
    public String getLongestWord(String str) {
        String result = "";
        String[] wordGet = str.split(" ");
        int wordLen = 0;
        for (int i=0; i < wordGet.length;i++) {
            wordLen = Math.max(wordLen,wordGet[i].length());
        }
        for (int j = wordGet.length; j > 0 ;j--) {
            if (wordGet[j].length() == wordLen) {
                result = wordGet[j];
            }
        } return result;
    }
    public static void main(String[] args) {
        System.out.println("Method 입력:");
        String test = myInput.nextLine();
        switch (test) {
            case "getLastElement":
                System.out.print("배열크기입력:");
                int numArray = myInput.nextInt();
                int[] elementNew = new int[numArray];
                for (int num=0; num<numArray;num++) {
                    elementNew[num] = myInput.nextInt();
                }
                System.out.print(getLastElement(elementNew));
                break;
            case "getAllWords":
                String wordsGet = myInput.nextLine();
                System.out.print(Arrays.toString(getAllWords(wordsGet)));
                break;
            default:
                System.out.println("Method Not Found!");
        }
    }
}
