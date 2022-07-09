package Section_1;

class ConstructorInnerClassPractice {
    public static void main(String[] args) {
        Print p1 = new Print("----");
        p1.A();
        p1.A();
        p1.B();
        p1.B();

        Print p2 = new Print("****");
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.A();
        p2.A();
        p1.A();
        p2.A();
    }
}
class Print {
    String delimiter = "";
    Print(String delimiter) {
        this.delimiter = delimiter;
    }
    void A() {
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    void B() {
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

class Champion { //클래스정의
    String name; //변수정의
    int power;
    int defense;
    public static void main(String[] args) {
        Champion superman = new Champion();
        Champion batman = new Champion();

        superman.name = "SuperMan";
        superman.power = 70;
        superman.defense = 50;
        superman.powerDown();
        superman.getAbilityTest();

        batman.name = "batMan";
        batman.power = 45;
        batman.defense = 65;
        batman.powerUp();
        batman.getAbilityTest();

        Champion ironman = new Champion("ironman", 40,70);
    }
    //생성자정의
    private Champion() {
    }
    //this사용예시
    private  Champion(String name, int power,int defense) {
        this.name = name;this.power=power;this.defense=defense;
        this.getAbilityTest();
    }
    //메소드 정의
    private void powerUp() {
        power += 5;
    }
    private void powerDown(){
        power -= 5;
    }
    private int getCurrentPower(){
        return power;
    }
    private void getAbilityTest(){
        System.out.printf("%s이 %d의 공격력과 %d의 방어력을 가지고 있습니다.\n",name,power,defense);
    }

}
