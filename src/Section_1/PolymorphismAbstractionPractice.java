package Section_1;

class PolymorphismAbstractionPractice {

}

abstract class Calculator2{
    int left, right;
    void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    int _sum() {
        return this.left + this.right;
    }
    int _avg() {
        return (this.left + this.right)/2;
    }
    abstract void sum();
    abstract void avg();
        void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator2 {
    void sum(){
        System.out.println("+ sum :"+_sum());
    }
    void avg(){
        System.out.println("+ avg :"+_avg());
    }
}
class CalculatorDecoMinus extends Calculator2 {
    void sum(){
        System.out.println("- sum :"+_sum());
    }
    void avg(){
        System.out.println("- avg :"+(_avg()));
    }
}
class CalculatorDemo {
    static void excute(Calculator2 cal) {
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args) {
        Calculator2 c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        excute(c1);

        Calculator2 c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        excute(c2);
    }
}
///인터페이스
interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
//인터페이스도 상속가능
class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        System.out.println(obj.A());
        System.out.println(obj.B());

        System.out.println(objI2.A());
        //objI2.B();

        //objI3.A();
        System.out.println(objI3.B());
    }
}

abstract class A{
    abstract int b();
    //본체(내용)가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
    void d(){
        System.out.println("world");
    }
}
class B extends A{
    int b(){
        return 1;
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
    }
}
///인터페이스
class CalculatorDummy implements Calculatable2{
    public void setOprands(int first, int second, int third) {
    }

    public int sum () {
        return 60;
        }
    public int avg () {
        return 20;
    }
}
class CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}
interface Calculatable2 {
    default void setOprands(int first, int second, int third) {

    }
    int sum();
    int avg();
}
