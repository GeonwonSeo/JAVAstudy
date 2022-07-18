package Section_1;
///람다식(익명함수) - 반환타입과 이름을 생략
//함수형인터페이스에 추상형 메소드가 하나여야 하는 이유 - 1대1매칭 ,메소드가 2개 이상이면 무엇을 불러내야할지 모름

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

///stream
//선언형 프로그래밍 방식. 원본을 변경하지 않음. 일회용. 지연된 연산. 병렬 스트림 사용가능->내부 반복자 사용
//
class LambdaStreamStudy {

}
class LambdaStudy {
    public static void main(String[] args) {
		   /* Object obj = new Object() {
            int sum(int num1, int num2) {
                return num1 + num1;
            }
        };
			*/
        //ExampleFunction exampleFunction = (num1, num2) -> num1 + num2;
        //System.out.println(exampleFunction.sum(10, 15));
        ExampleFunction exampleFunction = (int num3 , int num4 ) -> num3 * num4;
        System.out.println(exampleFunction.sum(3,4));
        ExampleFunction exampleFunction2 = (int num1 , int num2 ) -> num1 + num2;
        System.out.println(exampleFunction2.sum(3,4));

        MyFunctionalInterface example;
        example = () -> {
            String str = "첫 번째 메서드 호출!";
            System.out.println(str);
        };
        example.accept();

        example = () -> System.out.println("두 번째 메서드 호출!");
        //실행문이 하나라면 중괄호 { }는 생략 가능
        example.accept();
    }

    interface ExampleFunction {
        public abstract int sum(int num1, int num2);
    }
}
interface MyFunctionalInterface {
    public void accept();
}
class StreamStudy {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::println); //스트림의 모든 요소를 출력.

        Stream<String> stream2 = Stream.of("a","b","c");
        stream2.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5,6};
        IntStream intStream = Arrays.stream(intArr);
        System.out.println(intStream.average());

        IntStream intStream2 = IntStream.rangeClosed(1,10);
        intStream2.skip(5).forEach(System.out::println);

        IntStream intStream3 = IntStream.of(1,2,2,3,3,4,5,5,7,7,7,8);
        intStream3.distinct()
                .filter((i -> i %2 ==0))
                .forEach(System.out::println);

        List<String> names = Arrays.asList("kimcoding", "javalee");
        names.stream()
                .map(s -> s.toUpperCase())
                .forEach(n-> System.out.println("names = " + n));
    }
}


