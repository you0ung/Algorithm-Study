package Baekjoon;
// charAt() 을 몰랐다

import java.util.Scanner;

public class _27866 {
    public static void main(String[] args) {
        String[] array = new String[1000];
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        char c = str.charAt(n - 1);

        System.out.println(c);
    }
}
