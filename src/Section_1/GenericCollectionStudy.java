package Section_1;

import java.util.ArrayList;
import java.util.List;

///제너릭 - 하나의 클래스만으로 다른 타입의 데이터 저장할수 있는 인스턴스 생성
//제한된 제너릭 클래스 - <T extends Flower>처럼 Flower클래스의 하위 클래스 혹은 Flower인터페이스만을 지정하도록 제한가능
//제너릭 메소드 - public <T> void add(T element) 제너릭 메소드의 타입 매개변수는 제너릭 클래스의 타입 매개변수와 별개의 것
///컬렉션 프레임워크 - list, set, map
//ArrayList - Array와 유사 but, 자동으로 저장용량 증가, 데이터가 연속적으로 존재
//LinkedList - 각 element는 연결된 이전 요소 및 다음 요소의 주소값과 데이터로 구성
// 삭제시 삭제 요소의 이전 요소와 다음 요소를 참조하도록 변경하고 배열처럼 데이터를 이동하기 위해 복사할 필요가 없기 때문에
// 처리 속도가 훨씬 빠름
//순차 읽기쓰기,랜덤읽기의 경우 ArrayList유리, 랜덤쓰기의 경우 LinkedList유리
// 랜덤읽기가 ArrayList가 유리한것은 ArrayList는 인덱스를 통해 바로 접근가능하지만 LinkedList는 element를 거쳐서 찾아야함
//Iterator - Collection 인터페이스에 정의된 iterator()를 호출하면, Iterator 타입의 인스턴스가 반환
//Set - 중복비허용, 저장순서미유지
//HashMap/TreeMap/LinkedHashMap
class GenericCollectionStudy<T> {
    private T item;
    List<String> container1 = new ArrayList<String>();
    List<String> container2 = new ArrayList<String>(30);
    GenericCollectionStudy(T item) {
        this.item = item;
    }
    T getItem() {
        return item;
    }
    void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericCollectionStudy<String> basket2 = new GenericCollectionStudy<String>("");
        GenericCollectionStudy<Boolean> basket3 = new GenericCollectionStudy<Boolean>(true);
        GenericCollectionStudy<Double> basket4 = new GenericCollectionStudy<Double>(3.0);
        basket4.setItem(3.14);
        System.out.println(basket4.getItem());
    }
}

class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList를 생성하여 list에 할당
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("is");
        list.add("coming");

        int size = list.size();

        String num1 = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
        }
        list.remove(0);
        System.out.println(list);
    }
}