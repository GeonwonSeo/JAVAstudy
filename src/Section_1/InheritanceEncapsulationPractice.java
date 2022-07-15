package Section_1;

import java.sql.SQLOutput;
import java.util.Arrays;

class InheritanceEncapsulationPractice {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));

        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}
class Cal {
    int sum(int v1, int v2) {
        return v1+v2;
    }
    int sum(int v1, int v2, int v3) {
        return this.sum(v1,v2)+v3; // this
    }
}
class Cal3 extends Cal{
    int minus(int v1, int v2){
        return v1-v2;
    }
    int sum(int v1,int v2){ //오버라이딩
        System.out.println("Cal3!!");
        return super.sum(v1,v2);
    }
}

class Print2 {
    String delimiter;
    void a() {
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    void b() {
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }
    static void c(String delimiter){
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }
}
class staticMethod {
    public static void main(String[] args) {
//        Print2.a("-");
//        Print2.b("-");
        Print2 t1 =new Print2();
        t1.delimiter = "-";
        t1.a();
        t1.b();
        //Print2.a();에러
        Print2.c("$");

//        Print2.a("*");
//        Print2.b("*");
        Print2 t2 = new Print2();
        t2.delimiter = "*";
        t2.a();
        t2.b();
    }
}


class Calculator1{
    int left, right;

    void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    void sum(){
        System.out.println(this.left+this.right);
    }

    void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
class CalculatorDemo4 {

    public static void main(String[] args) {

        Calculator1 c1 = new Calculator1();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        //c1.substract();//새로 함수 추가했다면 새로 상속 class 작성

        Calculator1 c2 = new Calculator1();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
}
class typePlus extends Calculator1 {
    void substract () {
        System.out.println(this.left - this.right);
    }
}
class CalculatorDemo1 {
    public static void main(String[] args) {
        typePlus c2 = new typePlus();
        c2.setOprands(20,10);
        c2.sum();
        c2.substract();
    }
}
class MultiplicationableCalculator extends typePlus{
    void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class CalculatorDemo2 {
    public static void main(String[] args) {
        MultiplicationableCalculator c3 = new MultiplicationableCalculator();
        c3.setOprands(10,20);
        c3.avg();
        c3.substract();
        c3.multiplication();
        System.out.println(c3);
        System.out.println(c3.toString());
    }
}

class objectStudy1 {//뒤에 extends Object가 생략된것
}
class objectStudy2 extends Object {
}
