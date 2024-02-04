package lv_0;

import java.util.Arrays;

public class 배열의_평균값 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    public static double solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return (double) sum / numbers.length;
    }
}
