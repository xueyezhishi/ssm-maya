package com.MS.math;

import java.util.Scanner;
 
//求从键盘输入数，分解质因数，输出结果显示：如  135=3*3*3*5；
//当a能被k（质因数）整除时，输出k,当k不能被a整除时，继续循环k++.直到k值能被a整除，而且此时k==a。就停止了。break;
public class ZhiShu {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("请输入-----");
        int a = c.nextInt();
        // System.out.println(a+"=");
        int k = 2;
         System.out.print(a+"=");
        while (k <= a) {
            if (k == a) {
                System.out.println("" + a);
                break;
                // 如果这里不用break;则出现一个质因数循环到永远。。因为它在if循环里面。一直输出最后的一个质因数。
            }// 这是一个完整的if循环判断
            else if (a % k == 0) {
                System.out.print(k + "*");
                a = a / k;// 此时的a值作为下一次的a，之后分解
            } else {
                k++;
 
            }
        }
 
    }
}
//
