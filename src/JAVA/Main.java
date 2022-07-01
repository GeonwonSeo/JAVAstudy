package JAVA;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //예시
        int num1 = 1; //변수
        final double CALCULATOR_PI = 3.14; //상수
        int primitive = 1; //기본타입변수
        Object reference = new Object(); //참조타입변수 = 객체;
        System.out.println(primitive); //출력
        System.out.println(reference);

        int currentAge = 20; //정수형 리터럴
        double pi = 3.141592; //실수형 리터럴
        boolean isGenius = true; //논리형 리터럴
        char firstAlphabet = 'A'; //문자형 리터럴
        String learnedAt = "Home"; //문자형 리터럴
        float weight = 74.5f;
        final long LIGHT_YEAR = 9460730472580L;
        float thing = 9460730472580.0F; //Float type 리터럴뒤F
        double thing2 = 9460730472580.0D; //double type 리터럴뒤D
        byte byteNum = 125;
        byte byteNum2 = -125;
        short shortNum = 12345;
        int intNum = 123456789;
        long longNum = 12345678910L; //long타입 리터럴뒤L
        long longNum2 = 12_345_678_910L; //길면 언더바로 구분가능
        byteNum = (byte) (byteNum + 10);
        byteNum2 = (byte) (byteNum2 - 10);
        System.out.println(byteNum); //오버플로우
        System.out.println((byteNum2)); //언더플로우
    }
}

