package Section_1;

class Foo {
    static String classVar = "I class var";
    String instanceVar = "I instance var";
    static void classMethod() {
        System.out.println(classVar);
        //System.out.println(instanceVar);
    }
    void instanceMethod() {
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}
class ClassObjectFieldMethodPractice {
    ///static키워드
    public static void main(String[] args) {
        System.out.println(Foo.classVar);
        //System.out.println((Foo.instanceVar));
        Foo.classMethod();
        //Foo.instanceMethod();

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);
        System.out.println((f1.instanceVar));

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);
    }
}
class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0);

        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
//        Accounting.valueOfSupply =10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        Accounting.valueOfSupply = 20000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        Accounting.valueOfSupply =10000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//        Accounting.valueOfSupply = 20000.0;
//        System.out.println("VAT : " + Accounting.getVAT());
//        Accounting.valueOfSupply =10000.0;
//        System.out.println("Total : " + Accounting.getTotal());
//        Accounting.valueOfSupply = 20000.0;
//        System.out.println("Total : " + Accounting.getTotal());
    }
}
class Accounting{
    double valueOfSupply;
    // 부가가치세율
    static double vatRate = 0.1;
    Accounting(double valueOfsupply) {
        this.valueOfSupply = valueOfsupply;
    }
    double getVAT() {
        return valueOfSupply * vatRate;
    }
    double getTotal() {
        return valueOfSupply + getVAT();
    }
}