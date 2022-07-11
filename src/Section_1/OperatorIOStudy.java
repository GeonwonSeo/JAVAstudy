package Section_1;
import java.util.Scanner;                 // Scanner 클래스를 가져옵니다.

class OperatorIOStudy {
    public static void main(String[] args) {
        ///산술연산자
        int num1 = 1;
        double num2 = num1 + 2;
        int num3 = (int) (num2 - 1);
        double num4 = num3 * 3;
        int num5 = (int) (num4 / 2);
        int num6 = num5 % 3;
        System.out.printf("%f %d %d", num4, num5, num6);
        //0으로 나눌수 없다
        //int    num1 = 9 / 0;    에러
        //num2 = 9.0 / 0;  Infinity
        //num3 = 9 % 0;    에러
        //num4 = 9.0 % 0;  에러
        ///증산연산자
        //전위연산자
        int num7 = 1;
        int prefix = ++num7; // prefix = num7 + 1;과 같습니다. 값이 참조된후 증가
        //후위연산자
        int num8 = 1;
        int postfix = num8++; // (postfix = num8) + 1;과 같습니다. 값이 참조된후 증가
        //복합 대입 연산자 - 연산 간단 표현
        num8 *= 3;
        num8 %= 3;
        ///비교연산자
        boolean text1, text2, text3;
        //대소비교
        text1 = 5>3; text2 = 2>=3;
        //등가비교
        text1 = 5 == 3;
        text2 = 3 != 2;
        ///논리연산자
        //OR연산자||
        text3 = text1 || text2;
        //AND연산자&&
        text3 = text1 && text2;
        ///연산자 우선순위
        int num = (1 + 2 == 3 && 4 + 1 * 2 == 6) ? 3 + 4 : 5 + 6; //괄호 곱셈 덧셈 등가 AND 조건?:
        System.out.println(num);
        ///콘솔출력
        System.out.print("Hello JAVA"); System.out.println("Hello JAVA"); System.out.printf("Hello JAVA");
        ///콘솔입력
        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 인스턴스를 생성합니다.
        String inputValue = scanner.nextLine();   // 입력한 내용이 inputValue에 저장됩니다.
        System.out.println(inputValue);           // 입력한 문자열이 출력됩니다.
    }
}
