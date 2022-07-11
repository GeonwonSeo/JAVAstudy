package Section_1;

import java.lang.reflect.Constructor;
///생성자
class ConstructorInnerClassStudy {
    public static void main(String[] args) {
        Constructors constructor1 = new Constructors();
        Constructors constructor2 = new Constructors("Hello World");
        Constructors constructor3 = new Constructors(5,10);

        CarEx2 c = new CarEx2("Model X", "빨간색", 250);
        System.out.println(c.getModelName() + c.getColor());
    }
}
class Constructors {
    Constructors() {
        System.out.println("1번 생성자");
    }
    Constructors (String str) {
        System.out.println("2번 생성자");
    }
    Constructors (int a, int b) {
        System.out.println("3번 생성자");
    }
}

class CarExample {
    String model;
    String color;
    CarExample(){} // 기본생성자. 생성자가 없는 경우 자동 생성
    // 생성자 오버로딩
    CarExample(String model, String color) { // 매개변수가 있는 생성자
        this.model = model;
        this.color = color;
    }
    void power() {
        System.out.println("시동을 걸었습니다.");
    }
    void accelerate() {
        System.out.println("더 빠르게!");
    }
    void stop(){
        System.out.println("멈춤");
    }
}
class CarEx2 {
    private String modelName;
    private String color;
    private int maxSpeed;

    CarEx2(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    String getModelName() {
        return modelName;
    }

    String getColor() {
        return color;
    }
}
class Test {
    public static void main(String[] args) {
        Example example = new Example();
        Example example2 = new Example(5);
    }
}
class Example  {
    Example() {
        System.out.println("Example의 기본 생성자 호출!");
    }
    Example(int x) {
        this();
        System.out.println("Example의 두 번째 생성자 호출!");
    }
}
class Outer1 { //외부 클래스
    private int num = 1; //외부 클래스 인스턴스 변수
    private static int sNum = 2; // 외부 클래스 정적 변수

    private InClass inClass; // 내부 클래스 자료형 변수 선언

    Outer1() {
        inClass = new InClass(); //외부 클래스 생성자
    }
    class InClass { //인스턴스 내부 클래스
        int inNum = 10; //내부 클래스의 인스턴스 변수
        void Test() {
            System.out.println("Outer num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
    }
    static void getPrintStatic() {
        System.out.println("스태틱 메서드");
    }
    void testClass() {
        inClass.Test();
    }
}
class Outer2 { //외부 클래스
    private int num = 3; //내부 클래스의 인스턴스 변수
    private static int sNum = 4;

    void getPrint() {
        System.out.println("인스턴스 메서드");
    }

    static void getPrintStatic() {
        System.out.println("스태틱 메서드");
    }

    static class StaticInClass { // 정적 내부 클래스
        void test() {
            System.out.println("Outer num = " +sNum + "(외부 클래스의 정적 변수)");
            getPrintStatic();
            // num 과 getPrint() 는 정적 멤버가 아니라 사용 불가.
        }
    }
}
class Outer3 { //외부 클래스
    int num = 5;
    void test() {
        int num2 = 6;
        class LocalInClass { //지역 내부 클래스
            void getPrint() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}
class Main {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
        outer1.testClass(); // 내부 클래스 기능 호출
        Outer2.StaticInClass a = new Outer2.StaticInClass(); //정적 이너 클래스의 객체 생성
        a.test();
        Outer3 outer3 = new Outer3();
        outer3.test();
    }
}