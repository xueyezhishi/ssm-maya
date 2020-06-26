package com.MS.math;

import java.util.Scanner;
 
//求从键盘输入数，分解质因数，输出结果显示：如  135=3*3*3*5；
//当a能被k（质因数）整除时，输出k,当k不能被a整除时，继续循环k++.直到k值能被a整除，而且此时k==a。就停止了。break;
public class TEST {
    public static void main(String[] args) {
        
        int x=3,y=6,a=0;
        while(x++!=(y-=1)) {
        	a+=1;
        	if(y<x)break;
        	
        }
        System.out.println(x);
    	System.out.println(y);
    	System.out.println(a);
    }
}
//
