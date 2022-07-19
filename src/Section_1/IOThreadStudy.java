package Section_1;

import java.util.Arrays;

///스레드
//방법1.Runnable 인터페이스를 구현한 객체에서 run()을 구현하여 스레드를 생성하고 실행하는 방법
public class IOThreadStudy {}
class ThreadExample1{
    public static void main(String[] args) {
        //Runnable task1 = new ThreadTask1();
        //Thread thread1 = new Thread(task1);
        Thread thread1 = new Thread(new ThreadTask1());
        Thread thread2 = new Thread(new ThreadTask2());
        thread1.start();
        thread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.print("@");}
        System.out.println("thread2.getName() = " + thread1.getName());
        System.out.println("thread2.getName() = " + thread2.getName());
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
class ThreadTask1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}
//방법2.Thread 클래스를 상속 받은 하위 클래스에서 run()을 구현하여 스레드를 생성하고 실행하는 방법
//implements Runnable 대신 extends Thread
class ThreadTask2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("$");
        }
    }
}
//스레드의 동기화
class Account {
    private  int balance = 10000;

    public int getBalance() {
        return balance;
    }
    synchronized boolean withdraw(int money) {//synchronized메소드가 되어 동기화 메소드가 되었으므로 메소드부분이 임계염역이 됨
        // 임계영역을 가지고 있는 객체에 대한 접근권한 = lock - 임계영역을 수행하고 있는 스레드가 없을때 수행가능한 권한
        // 인출 가능 여부 판단 : 잔액이 인출하고자 하는 금액보다 같거나 많아야 합니다.
        if (balance >= money) {
            // if문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고,
            // 다른 스레드에게 제어권을 강제로 넘깁니다.
            // 일부러 문제 상황을 발생시키기 위해 추가한 코드입니다.
            try { Thread.sleep(1000); } catch (Exception error) {}
            // 잔액에서 인출금을 깎아 새로운 잔액을 기록합니다.
            balance -= money;
            return true;
        }
        return false;
    }
}
class ThreadTask3 implements Runnable {
    Account account = new Account();

    public synchronized void run() {
        while (account.getBalance() > 0) {
            // 100 ~ 300원의 인출금을 랜덤으로 정합니다.
            int money = (int)(Math.random() * 3 + 1) * 1000;
            // withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당합니다.
            boolean denied = !account.withdraw(money);
            // 인출 결과 확인
            // 만약, withraw가 false를 리턴하였다면, 즉 인출에 실패했다면,
            // 해당 내역에 -> DENIED를 출력합니다.
            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
            );
        }
    }
}

class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadTask3());
        Thread thread2 = new Thread(new ThreadTask3());
        thread1.setName("서건원");
        thread2.setName("SeoGeonWon");
        thread1.start();
        thread2.start();
    }
}
///
