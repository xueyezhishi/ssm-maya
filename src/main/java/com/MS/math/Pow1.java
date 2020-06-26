package com.MS.math;

import java.util.Scanner;

public class Pow1 {
	public static void main(String[] args) {
		System.out.println("天朝有一个乞丐姓洪，去天桥要钱");
		System.out.println("请输入讨饭多少天");	
		//导入SC
		Scanner s= new Scanner(System.in);
		int D =s.nextInt();
		double m=1;
		double m2=0;
		for(int j=0;j < D;j++) {
			int n=j+1;
			m=Math.pow(2, j);
			m2+=m;
					System.out.println("第"+n+"天要了"+m+"块钱");
			
		}
		System.out.println("共计"+m2);
	}

}
