package Section_1;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ControlFlowStatementPractice {
    static Scanner myInput = new Scanner(System.in);

    public static int getRunCatDistance(int speed, int time) {
        int distance;
        distance = speed * time;
        return distance;
    }

    public static String computeDifference(int num1, int num2) {
        return Integer.toString(Math.abs(num1 - num2));
    }

    public static String FizzBuzz(int num) {
        StringBuilder result = new StringBuilder();
        if (num % 3 == 0) {
            result.append("a");
        }
        if (num % 5 == 0) {
            result.append("b");
        }
        switch (result.substring(0)) {
            case "":
                return "No FizzBuzz";
            case "a":
                return "Fizz";
            case "b":
                return "Buzz";
            default:
                return "FizzBuzz";
        }
    }

    public static long DaysInMonth(int month) {
        int daysToMonth = 0;
        StringBuilder result = new StringBuilder("121010110101");
        switch (result.charAt(month - 1)) {
            case '1':
                daysToMonth = 31;
                break;
            case '2':
                daysToMonth = 28;
                break;
            case '0':
                daysToMonth = 30;
                break;
            default:
                System.out.print("Invalid Month");
        }
        return daysToMonth;
    }

    public static StringBuilder hasAdd(StringTokenizer day) {
        StringBuilder dayInput = new StringBuilder();
        while (day.hasMoreTokens()) {
            String str = day.nextToken() + "요일";
            dayInput.append(str);
            break;
        }
        return dayInput;
    }

    public static String FollowingDay(String day) {
        StringTokenizer dayFollow = new StringTokenizer("월 화 수 목 금 토 일");
        StringBuilder stringToConvert = hasAdd(dayFollow);
        String result = "올바른 요일이 아닙니다";
        while (day.contains(stringToConvert) && day.length() == 3) {
            int dayIndex = stringToConvert.indexOf(day);
            result = stringToConvert.substring(dayIndex + 1);
        }
        return result;
    }
    public static boolean isPythagorean(int num1, int num2, int num3) {
        boolean result;
        int maxLeg = Math.max(Math.max(num1, num2), Math.max(num1, num3));
        int minLeg = Math.min(Math.min(num1, num2), Math.min(num1, num3));
        if (Math.pow(num1, 2) == Math.pow(num2, 2) + Math.pow(num3, 2)) {
            result = true;
        } else if (Math.pow(num2, 2) == Math.pow(num1, 2) + Math.pow(num3, 2)) {
            result = true;
        } else if (Math.pow(num3, 2) == Math.pow(num1, 2) + Math.pow(num2, 2)) {
            result = true;
        } else {
            result = false;
        } return result;
    }
    public static boolean isOdd(int num){
        boolean result = false;
        while ((num & 1)==1) {
            result = true;
            break;
        } return result;
    }
    public static StringBuilder repeatString(String str, int num) {
        String result = "";
        StringBuilder resultAppend = new StringBuilder(result);
        for (int countNum = 0; countNum < num; countNum++) {
            resultAppend.append(str);
        } return resultAppend;
    }
    public StringBuilder makeDigits2_1(int num) {
        StringBuilder digitAppend = new StringBuilder();
        int numcount = 1;
        while (numcount <= num) {
            if (numcount !=num){
                digitAppend.append(numcount).append("-");
                numcount++;
            } else {
                digitAppend.append(numcount);
                numcount++;
            }
        } return digitAppend;
    }
    public static String makeDigits2_2(int num) {
        StringBuilder digitAppend = new StringBuilder("1");
        int numcount = 2;
        while (numcount <= num) {
            digitAppend.append("-").append(numcount);
            numcount++;
        } return digitAppend.toString();
    }
    public static int makeMultiplesOfDigit2(int num1, int num2) {
        int numcount = 0;
        for (int numvalue = Math.min(num1,num2); numvalue <= Math.max(num1,num2);numvalue++) {
            int numDet = numvalue;
            while ((numDet & 1)==0 && numDet != 0) {
                numcount++;
                numDet++;
            }
        } return numcount;
    }
    public static int countCharacter(String word, char word2) {
        StringTokenizer wordToDiv = new StringTokenizer(word,Character.toString(word2),false);
        int bugCount = 0;
        int tokenCount = wordToDiv.countTokens();
        for (int count =1; count < tokenCount;count++){
            bugCount++;
        } return bugCount;
    }
    public int countCharacter2(String str, char letter) {
        int bugCount = 0;
        int numCount = 0;
        for (int count = 0; count < str.length(); count++) {
            if (str.charAt(numCount) == letter) {
                bugCount++;
            }
            numCount++;
        } return bugCount;
    }
    public static StringBuilder listPrimes(int num) {
        StringBuilder primeList = new StringBuilder("2");
        for (int count =3; count <= num; count++) {
            int num2 = 0;
            for (int count2 = 2;count2 <= Math.sqrt(count); count2++) {
                if (count % count2 ==0){
                    num2++;
                }
            }
            if (num2 ==0){
                primeList.append(-count);
            }
        } return primeList;
    }
    public String makePermutations(String str) {
        StringBuilder permutestr = new StringBuilder();
        for (int num1 = 0; num1< str.length(); num1++) {
            for (int num2 = 0; num2 < str.length();num2++) {
                permutestr.append(',').append(str.substring(num1,num1+1));
                permutestr.append(str.substring(num2,num2+1));
            }
        } return permutestr.delete(0,1).toString();
    }
    public boolean hasRepeatedCharacter(String str) {
        boolean reChar = false;
        for (int count1 = 0; count1<str.length();count1++){
            for (int count2 = str.length()-1; count2 > count1; count2--){
                if (str.substring(count1,count1+1).equals(str.substring(count2,count2+1))){
                    reChar = true;
                }
            }
        } return reChar;
    }
    public static String makeMarginalString(String str) {
        StringBuilder stringMar = new StringBuilder();
        for (int num1 = 0; num1< str.length();num1++){
            stringMar.append(str,0,num1+1);
        } return stringMar.toString();
    }

    public static void main (String[] args){
            System.out.println("method 입력:");
            String test = myInput.nextLine();
            switch (test) {
                case "Dist":
                    System.out.println("speed, time입력:");
                    int speed1 = myInput.nextInt();
                    int time1 = myInput.nextInt();
                    System.out.println(getRunCatDistance(speed1, time1));
                    break;
                case "Diff":
                    System.out.println("차이계산할 두 int 입력:");
                    int num1 = myInput.nextInt();
                    int num2 = myInput.nextInt();
                    System.out.println(computeDifference(num1, num2));
                    break;
                case "FizzBuzz":
                    System.out.println("3과 5의 fizzBuzz 계산");
                    int num3 = myInput.nextInt();
                    System.out.println(FizzBuzz(num3));
                    break;
                case "DaysInMonth":
                    System.out.println("Month 입력");
                    int num4 = myInput.nextInt();
                    System.out.println(DaysInMonth(num4));
                    break;
                case "FollowingDay":
                    System.out.println("요일 입력");
                    String data1 = myInput.nextLine();
                    //System.out.println(FollowingDay(data1));
                    StringTokenizer dayFollow = new StringTokenizer("월 화 수 목 금 토 일");
                    System.out.println(hasAdd(dayFollow));
                    break;
                case "isPythagorean":
                    System.out.println("삼각형 세변 입력");
                    int leg1 = myInput.nextInt();
                    int leg2 = myInput.nextInt();
                    int leg3 = myInput.nextInt();
                    System.out.println(isPythagorean(leg1,leg2,leg3));
                    break;
                case "isOdd":
                    System.out.println("짝수false홀수true\n입력:");
                    int oddEven = myInput.nextInt();
                    System.out.println(isOdd(oddEven));
                    break;
                case "repeatString":
                    System.out.println("문자열과 반복횟수입력:");
                    String repeatStr = myInput.nextLine();
                    int repeatNum = myInput.nextInt();
                    System.out.println(repeatString(repeatStr, repeatNum));
                    break;
                case "makeDigits2":
                    System.out.println("문자열만들 정수형입력");
                    int Digitnum1 = myInput.nextInt();
                    System.out.println(makeDigits2_2(Digitnum1));
                    break;
                case "makeMultiplesOfDigit2":
                    System.out.println("입력정수 사이 2의배수");
                    int Digitnum2 = myInput.nextInt();
                    int Digitnum3 = myInput.nextInt();
                    System.out.println(makeMultiplesOfDigit2(Digitnum2,Digitnum3));
                    break;
                case "countCharacter":
                    System.out.println("String입력:");
                    String stringToFind = myInput.nextLine();
                    System.out.println("찾을 char입력:");
                    char charToFind = myInput.next().charAt(0);
                    System.out.println(countCharacter(stringToFind, charToFind));
                    break;
                case "listPrime":
                    System.out.print("입력값까지의 소수:");
                    int listToPrime = myInput.nextInt();
                    System.out.print(listPrimes(listToPrime));
                    break;
                case "makeMarginalString":
                    System.out.print("부분완성 문자열 리턴");
                    String StringMar = myInput.nextLine();
                    System.out.print((makeMarginalString(StringMar)));
                    break;
                default:
                    System.out.println("Method Not Found!");
            }
        }
    }



