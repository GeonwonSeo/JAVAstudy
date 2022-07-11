package Section_1;
import java.util.Arrays;
import java.util.Random;
class ArrayStudy {
    public static void main(String[] args) {
        int[] odd = {1,3,5,7,9,11};
        System.out.printf("%d\n", odd[0]);
        System.out.printf("%d\n", odd[1]);
        ///1차원배열
        double[] temperatureOfJuly;
        temperatureOfJuly = new double[31];

        for (int num = 0; num < 31;num++) {
            temperatureOfJuly[num] = (int) (Math.random()*20);
        }
        int[][] ages = {
                { 30, 32, 39, 59, 23 },
                { 31, 41, 52, 56, 72, 13 },
                { 45, 32, 84, 23, 13, 42, 55 },
                { 23, 41, 62, 64, 23, 51, 67, 98 },
                { 13, 14, 17, 84, 52, 37, 68, 66, 33 }
        };

        System.out.println("Arrays.toString(ages[0]) = " + Arrays.toString(ages[0]));
        System.out.println("Arrays.toString(ages[1]) = " + Arrays.toString(ages[1]));
        System.out.println("Arrays.toString(ages[2]) = " + Arrays.toString(ages[2]));
        System.out.println("Arrays.toString(ages[3]) = " + Arrays.toString(ages[3]));
        System.out.println("Arrays.toString(ages[4]) = " + Arrays.toString(ages[4]));
        ///2차원배열
        int [][] kcal;
        kcal = new int[31][3];// 2개 합칠시 int [][] kcal = new int[31][3];


        }
    }

