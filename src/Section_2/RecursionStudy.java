package Section_2;

import java.util.Arrays;

public class RecursionStudy {
    static int[] reverseArr(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
        int[] head = Arrays.copyOfRange(arr,arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));
        int[] dest = new int[head.length + tail.length];
        System.arraycopy(head, 0, dest, 0,head.length);
        System.arraycopy(tail, 0, dest,head.length,tail.length);
        return dest;
    }
    // 재귀 호출로 구현한 구구단 메서드
    static void Gugudan(int level, int count) {
        if(count > 9) {
            return;
        }
        System.out.printf("%d x %d = %d\n", level, count, level*count);
        Gugudan(level, ++count);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArr(new int[]{3, 2, 1})));
        Gugudan(5,7);
    }

}
