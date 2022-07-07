package Section_1;

class ClassObjectFieldMethodStudy {
    static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println("인스턴스 변수: " + staticExample.num1); // static 키워드가 없는 인스턴스 변수
        System.out.println("클래스 변수: " + StaticExample.num2); //static 키워드가 있는 클래스 변수

        StaticField staticField1 = new StaticField(); // 객체 생성
        StaticField staticField2 = new StaticField();

        staticField1.num1 = 100;
        staticField2.num1 = 1000;
        System.out.println(staticField1.num1);
        System.out.println(staticField2.num1);

        staticField1.num2 = 150;
        staticField2.num2 = 1500;
        System.out.println(staticField1.num2);
        System.out.println(staticField2.num2);

        Shape s = new Shape();

        s.area(); //메서드 호출
        s.area(5);
        s.area(10,10);
        s.area(6.0, 12.0);

        CarEx1 BMW = new CarEx1();
        CarEx1 tesla = new CarEx1();

        BMW.model = "530 i";
        BMW.color = "블루";

        tesla.model = "Model Y";
        tesla.color = "화이트";

        System.out.println(BMW.model + BMW.color + CarEx1.doors);
        System.out.println(tesla.model + tesla.color + CarEx1.doors);

        System.out.println(BMW);
        System.out.println(tesla);

        CarEx1 car1 = new CarEx1();
        CarEx1 car2 = new CarEx1();

        CarEx1.classMethod();
        //Car.instaceMethod();
    }
}

class StaticExample {
    int num1 = 10;
    static int num2 = -10;
}
class StaticField {
    int num1 = 10;
    static int num2 = 15;
}
class Shape {
    void area() {
        System.out.println("넓이");
    }
    void area(int r) {
        System.out.println("원 넓이 = "+3.14*r*r);
    }
    void area(int w,int l) {
        System.out.println("직사각형 넓이 =" +w*l);
    }
    void area(double b, double h) {
        System.out.println("삼각형 넓이 =" + 0.5*b*h);
    }
}
class CarEx1 {
    String model;
    String color;
    static int doors =4;
    void start() {
        System.out.println("시동");
    }
    void accelerate() {
        System.out.println("가속");
    }
    void stop() {
        System.out.println("정지");
    }
    public String instanceVar ="나는 인스턴스 변수";
    static String classVar = "나는 클랴스 변수";

    void instanceMethod() {
        System.out.println(instanceVar);
        System.out.println(classVar);
    }
    static void classMethod() {
        //System.out.println(instanceVar);
        System.out.println(classVar);
    }
}

