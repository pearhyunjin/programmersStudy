package lv_00;

import java.util.Scanner;

public class 덧셈식_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " +  (a+b));

        // 다른 풀이
//         System.out.printf("%d + %d = %d",a,b,a+b);
    }
}
