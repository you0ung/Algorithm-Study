package Baekjoon;

import java.util.Scanner;

public class _10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); // 테스트 케이스 개수 입력
        int a, b;
        for (int i = 0; i < t; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a + b);
        }
    }
}
