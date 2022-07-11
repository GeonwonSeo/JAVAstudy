package Section_1;


class VariableTypeStudy {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //예시
        ///변수
        int num1 = 1;
        ///상수
        final double CALCULATOR_PI = 3.14;
        int primitive = 1; //기본타입변수
        Object reference = new Object(); //참조타입변수 = 객체;
        ///출력
        System.out.println(primitive);
        System.out.println(reference);
        ///리터럴
        int currentAge = 20; //정수형 리터럴
        double pi = 3.141592; //실수형 리터럴
        boolean isGenius = true; //논리형 리터럴
        char firstAlphabet = 'A'; //문자형 리터럴
        String learnedAt = "Home"; //문자형 리터럴
        float weight = 74.5f;
        final long LIGHT_YEAR = 9460730472580L;
        float thing = 9460730472580.0F; //Float type 리터럴뒤F
        double thing2 = 9460730472580.0D; //double type 리터럴뒤D
        ///타입
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
        ///실수형
        float num2 = 31415.92f; //float형 리터럴
        double num3 = 3.141592d; //double형 리터럴 d는 필수는 아님
        ///실수형 오버플로우,언더플로우
        //최대 범위를 넘어갔을 때 -> 무한대
        //최소 범위를 넘어갔을 때 -> 0
        //논리타입
        boolean isRainy = true;
        boolean isAdult = false;
        ///문자타입 문자형리터럴
        char letter1 = 'a';
        //char letter2 = 'ab'; 에러 :하나의 문자만 할당
        char letter3 = 65;//유니코드인식후 숫자 일치하는 코드문자변환
        System.out.println(letter3);
        ///자동타입변환
        //byte(1) -> short(2)/char(2) -> int(4) -> long(8) -> float(4) -> double(8)
        long longValue = 1234L;
        float floatValue = longValue;
        System.out.println((floatValue));
        ///수동타입변환
        //메모리 용량이 더 작은 타입으로의 변경 = 캐스팅(casting)
        int intValue = 128;
        byte byteValue = (byte) intValue;
        System.out.println(byteValue);
    }
}


