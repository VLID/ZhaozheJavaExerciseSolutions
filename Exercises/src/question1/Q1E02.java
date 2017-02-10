package question1;

import java.util.Scanner;

/**
 * Created by vince on 2/9/17.
 */

/**
 * E02
 * 循环 加强版
 *
 * 约束: 假定用户输入的是 [0, 9999] 之间任何一个数
 * (进阶：我使用了类型"Long"，可以使输入小于9223372036854775807的任何正整数）
 *
 * 交互效果:
 * >>  23
 * <<  2
 * <<  3
 *
 * >>  56478363
 * <<  5
 * <<  6
 * <<  4
 * <<  7
 * <<  8
 * <<  3
 * <<  6
 * <<  3
 *
 * >>  9793
 * <<  9
 * <<  7
 * <<  9
 * <<  3
 *
 * >>  684653774288490159
 * <<  6
 * <<  8
 * <<  4
 * <<  6
 * <<  5
 * <<  3
 * <<  7
 * <<  7
 * <<  4
 * <<  2
 * <<  8
 * <<  8
 * <<  4
 * <<  9
 * <<  0
 * <<  1
 * <<  5
 * <<  9
 */

public class Q1E02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int x = 1;
        long n1 = n;
        while(true) {
            if ((n1/10) >= 1) {
                n1 = n1/10;
                x++;
            } else {
                break;
            }
        }
        long list[] = new long[x];
        list[x-1] = n%10;
        list[0] = ((n-n%(long)Math.pow(10,x-1)))/(long)Math.pow(10,x-1);
        for (int i = 1; i < x-1; i++) {
            list[x-1-i] = (n%((long)Math.pow(10,(i+1)))-n%((long)Math.pow(10,i)))/(long)Math.pow(10,i);
        }
        for (int i = 0; i < x; i++) {
            System.out.println(list[i]);
        }
        /**
         * Sort the list
         */
//        System.out.println("*******************\nSorted:");
//        Arrays.sort(list);
//        for (int i = 0; i < x; i++) {
//            System.out.println(list[i]);
//        }
    }
}
