package question1;

import java.util.Scanner;

/**
 * Created by vince on 2/9/17.
 */

/**
 * E00
 * 基础版
 *
 * 概要: 用户输入一个三位数，程序输出每一位的数
 *
 * 约束: 假设用户输入的一定是一个合法三位数, 输出时按从高位到低位输出
 *
 * 交互效果:
 * >>  319
 * <<  3
 * <<  1
 * <<  9
 */
public class Q1E00 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n3 = (n-n%100)/100;
        System.out.println(n3);
        int n2 = (n%100 - n%10)/10;
        System.out.println(n2);
        int n1 = n%10;
        System.out.println(n1);
    }
}
