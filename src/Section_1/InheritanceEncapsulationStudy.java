package Section_1;

class InheritanceEncapsulationStudy {
    public static void main(String[] args) {
        Bike bike = new Bike(); // 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();

        Vehicle bike2 = new Bike(); // 상위 클래스 타입으로 선언 + 각각 타입으로 객체 생성
        Vehicle car2 = new Car();
        Vehicle motorBike2 = new MotorBike();

        bike2.run();
        car2.run();
        motorBike2.run();
    }
}
class Vehicle {
    void run() { //메소드 오버라이딩
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() { //메소드 오버라이딩
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle {
    void run() { //메소드 오버라이딩
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle {
    void run() {
        System.out.println("MotorBike is running");
    }
}

class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) { //포함관계
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Employee e = new Employee(1, "김코딩", address1);
        Employee e2 = new Employee(2, "박해커", address2);

        e.showInfo();
        e2.showInfo();
    }
}
class Address {
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

///super
class Super {
    public static void main(String[] args) {
        Lower l = new Lower();
        l.callNum();
    }
}

class Upper {
    int count = 20; // super.count
}

class Lower extends Upper {
    int count = 15; // this.count

    void callNum() {
        System.out.println("count = " + count);
        System.out.println("this.count = " + this.count);
        System.out.println("super.count = " + super.count);
    }
}

