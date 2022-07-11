package Section_1;


import java.awt.geom.NoninvertibleTransformException;
import java.util.Arrays;
import java.util.Scanner;

class ArrayPractice {
    static Scanner myInput = new Scanner(System.in);
    static int getLastElement(int[] arr) {
        int arr1 = -1;
        if (arr.length != 0) {
            arr1 = arr[arr.length-1];
        } return arr1;
    }
    static String[] getAllWords(String str) {
        int strNum = str.split(" ").length;
        String[] str1 = new String[strNum];
        if (strNum != 0){
            str1 = str.split(" ");
        } return str1;
    }
    char[] getAllLetters(String str) {
        char[] letterGet = new char[str.length()];
        for (int i = 0;i< str.length(); i++) {
            letterGet[i] = str.charAt(i);
        } return letterGet;
    }
    int getLargestElement(int[] arr) {
        int eleGet = arr[0];
        for (int i =0; i< arr.length; i++) {
            eleGet = Math.max(eleGet,arr[i]);
        } return eleGet;
    }
    static String getLongestWord(String str) {
        String result = "";
        String[] wordGet = str.split(" ");
        for (int i=0; i < wordGet.length;i++) {
            if (wordGet[i].length() > result.length())
                result = wordGet[i];
            } return result;
        }

    int[] getEvenNumbers(int[] arr) {
        int[] evenNums =new int[] {};

        for (int i = 0; i<arr.length; i++){
            if (arr[i] %2 ==0) {
                evenNums = Arrays.copyOf(evenNums, evenNums.length +1);
                evenNums[evenNums.length -1] =arr[i];
            } else {
                continue;
            }
        } return evenNums;
    }
    int[] addToFront(int[] arr, int el) {
        int[] result = new int[arr.length +1];
        result[0] = el;
        System.arraycopy(arr, 0,result,1,arr.length);//시스템 값을 직접 바꿨으므로 변수 설정할 필요가 없다.
        return result;
    }
    int[] addToBack(int[] arr, int el) {
        int[] result = new int[arr.length +1];
        System.arraycopy(arr, 0,result,0,arr.length);
        result[result.length-1] = el;
        return result;
        //반복문도 사용해보기
    }
    int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2,0,result, arr1.length, arr2.length);
        return result;
    }
    int[] getElementsAfter(int[] arr, int n) {
        int[] result = new int[arr.length - n];
        if (arr.length == 0 || arr.length <= n) return new int[] {};
        System.arraycopy(arr, n, result, 0, arr.length -n);
        return result;
    }
    int[] getElementsUpTo(int[] arr, int n) {
        int[] result = new int[n];
        if (arr.length ==0 || arr.length <=n) return new int[] {};

        System.arraycopy(arr, 0,result, 0, n);
        return result;
    }
    static int[] getAllElementsButNth(int[] arr, int n) {

        int index = 0;
        int[] result = (arr.length == 0) ? new int[0] : arr.length <= n ? arr: new int[arr.length-1];
        for (int i=0; i < arr.length; i++) {
            if (i != n) result[index++] = arr[i];

        } return result;
    }
    static String createPhoneNumber(int[] arr) {
        String result = "";
        final int LENGTH = arr.length;
        String head = "010";
        String body = Arrays.toString(Arrays.copyOfRange(arr, LENGTH - 8, LENGTH - 4))
                .replace("[", "").replace("]", "")
                .replace(",", "").replace(" ", "");
        String tail = Arrays.toString(Arrays.copyOfRange(arr, LENGTH - 4, LENGTH))
                .replace("[", "").replace("]", "")
                .replace(",", "").replace(" ", "");
        if (arr.length != 8) {
            head = Arrays.toString(Arrays.copyOfRange(arr, 0, 3))
                    .replace("[", "").replace("]", "")
                    .replace(",", "").replace(" ", "");
        }
        result = String.format("(%s)%s-%s", head, body, tail);
        return result;
    }
    static int[] fibonacci(int num) {
        int[] num3 = new int[num+1];
        num3[0] = 0;
        if (num >0) num3[1] = 1;
        for (int i = 3; i <= num+1; i++) {
            num3[i-1] += num3[i-2] + num3[i-3];
        } return num3;
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
                String allWordsGet = myInput.nextLine();
                System.out.print(Arrays.toString(getAllWords(allWordsGet)));
                break;
            case "getLongestWord":
                String longWordGet = myInput.nextLine();
                System.out.print(getLongestWord(longWordGet));
                break;
            case "getAllElementsButNth": //배열크기 안받고 만들수 있을까
                System.out.print("배열크기입력:");
                int numArray2 = myInput.nextInt();
                int[] elementButNth = new int[numArray2];
                System.out.print("배열입력:");
                for (int num=0; num<numArray2;num++) {
                    elementButNth[num] = myInput.nextInt();
                }
                System.out.print("없앨인덱스입력:");
                int num1= myInput.nextInt();
                System.out.print(Arrays.toString(getAllElementsButNth(elementButNth, num1)));
                break;
            case "createPhoneNumber":
                System.out.print("배열크기입력:");
                int numArray3 = myInput.nextInt();
                System.out.print("배열입력:");
                int[] phoneNum = new int[numArray3];
                for (int num=0; num<=numArray3;num++) {
                    phoneNum[num] = myInput.nextInt();
                }
                System.out.print(createPhoneNumber(phoneNum));
                break;
            case "fibonacci":
                int num2 = myInput.nextInt();
                System.out.print(Arrays.toString(fibonacci(num2)));
                break;
            default:
                System.out.println("Method Not Found!");
        }
    }
}
