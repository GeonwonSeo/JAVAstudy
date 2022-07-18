package Section_1;
///enum열거형
//문제1에 대한 해답1.인터페이스를 사용하여 상수를 구분하여 해결
///annotation
//표준 애너테이션
//@Override	컴파일러에게 메서드를 오버라이딩하는 것이라고 알림
//@Deprecated	앞으로 사용하지 않을 대상을 알릴 때 사용
//@FunctionalInterface	함수형 인터페이스*라는 것을 알릴 때 사용
//@SuppressWarning	컴파일러가 경고메세지를 나타내지 않음
//메타 애너테이션
//@Target	애너테이션을 정의할 때 적용 대상을 지정하는데 사용한다.
//@Documented	애너테이션 정보를 javadoc으로 작성된 문서에 포함시킨다.
//@Inherited	애너테이션이 하위 클래스에 상속되도록 한다.
//@Retention	애너테이션이 유지되는 기간을 정하는데 사용한다.
//@Repeatable	애너테이션을 반복해서 적용할 수 있게 한다.
//그외 사용자 정의 애너테이션가 있다.
interface Seasons {
    int SPRING = 1, SUMMER = 2, FALL = 3, WINTER = 4;
}
interface Frameworks {
    int DJANGO = 1, SPRING = 2, NEST = 3, EXPRESS = 4;
}
public class EnumAnnotationStudy implements Frameworks {
    public static final int SPRING = 1;
    public static final int SUMMER = 2;
    public static final int FALL = 3;
    public static final int WINTER = 4;

    public static final int DJANGO = 1;
    //public static final int SPRING  = 2; // 문제1.계절의 SPRING과 중복//상수의 이름이 중복된 경우 컴파일 에러
    public static final int NEST = 3;
    public static final int EXPRESS = 4;

    //문제1에 대한 해답2.enum을 이용한 상수 정의
    enum Seasons {SPRING, SUMMER, FALL, WINTER}

    enum Frameworks {DJANGO, SPRING, NEST, EXPRESS}

}

class Super2 {
    void run() {}
}
class Sub extends Super2 {
    @Override
    void run() {} // 컴파일 에러 발생, 오타가 난 것을 발견할 수 있음.
}

