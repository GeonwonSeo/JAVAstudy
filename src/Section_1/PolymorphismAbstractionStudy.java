package Section_1;
///다형성 하나의 객체가 여러가지 형태를 가질수 있는 것
//instanceof 참조변수의 타입 변환, 즉 캐스팅이 가능한 지 여부를 boolean 타입으로 확인
class PolymorphismAbstractionStudy {

    public static void main(String[] args) {
        Animals animal = new Animals();
        System.out.println(animal instanceof Object); //true
        System.out.println(animal instanceof Animals); //true
        System.out.println(animal instanceof Bat); //false

        Animals cat = new Cat();
        System.out.println(cat instanceof Object); //true
        System.out.println(cat instanceof Animals); //true
        System.out.println(cat instanceof Cat); //true
        System.out.println(cat instanceof Bat); //false
    }
}
class Animals {
};
class Bat extends Animals {
};
class Cat extends Animals {
};
///다형성 활용
class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}

class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class Americano extends Coffee {
    public Americano() {
        super(4000); // 상위 클래스 Coffee의 생성자를 호출
    }

    public String toString() {return "아메리카노";}; //Object클래스 toString()메서드 오버라이딩
};

class CaffeLatte extends Coffee {
    public CaffeLatte() {
        super(5000);
    }

    public String toString() {return "카페라떼";};
};

class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) { // 물건 가격보다 돈이 없는 경우
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price; // 가진 돈 - 커피 가격
        System.out.println(coffee + "를 구입했습니다.");
    }
}

///추상화 기존 클래스들의 공통적인 요소들을 뽑아서 상위 혹은 하위 클래스를 만들어 내는 것
//final 변경이 불가능 확장 불가
//인터페이스 내부 필드는 public static final로 정의, static,default외 메소드 public abstract로 정의

