package question1;

import java.util.Scanner;

/**
 * Created by vince on 2/9/17.
 */

/**
 * E01
 * 四位 加强版
 *
 * 概要: 用书输入一个四位数，程序输出每一位的数
 *
 * 交互效果:
 * >>  3192
 * <<  3
 * <<  1
 * <<  9
 * <<  2
 */

public class Q1E01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n4 = (n - n % 1000) / 1000;
        System.out.println(n4);
        int n3 = (n % 1000 - n % 100) / 100;
        System.out.println(n3);
        int n2 = (n % 100 - n % 10) / 10;
        System.out.println(n2);
        int n1 = n % 10;
        System.out.println(n1);
    }
}
