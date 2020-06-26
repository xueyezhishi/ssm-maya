package com.MS;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Test {  
    public static void main(String[] args) {  
    //	String x = new Object();
    	Object y = new String("111");
 //   	String[] str = new String[3] {"1","1","1"};
    	
    	System.out.println("c".equals("c"));
    //	quiz(5);
   /* 	String str = new String();
    	int[] a = new int[]{1,2,3,4,5,6};
    	Scanner s = new Scanner(System.in);
    	a[0]=s.nextInt();
    	a[1]=1;
    	for(int i=0;i<6;i++) {
    		System.out.println(a[i]);
    	}*/
    //	System.out.println(WeekDay.Mon);
    //	System.out.println(5/2);
   // 	System.out.println('c'=='c');
    	
    }  
    public static void quiz(int m){
       if(m>1)
       {
           quiz(m/2);
           quiz(m/2);
       }
       System.out.println("*");
       
    }
    public enum WeekDay { 
        Mon("Monday"), Tue("Tuesday"), Wed("Wednesday"), Thu("Thursday"), Fri( "Friday"), Sat("Saturday"), Sun("Sunday"); 
        private final String day; 
        private WeekDay(String day) { 
               this.day = day; 
        } 
       public static void printDay(int i){ 
          switch(i){ 
              case 1: System.out.println(WeekDay.Mon); break; 
              case 2: System.out.println(WeekDay.Tue);break; 
              case 3: System.out.println(WeekDay.Wed);break; 
               case 4: System.out.println(WeekDay.Thu);break; 
              case 5: System.out.println(WeekDay.Fri);break; 
              case 6: System.out.println(WeekDay.Sat);break; 
               case 7: System.out.println(WeekDay.Sun);break; 
              default:System.out.println("wrong number!"); 
            } 
        } 
       public String getDay() { 
           return day; 
        } 
   }
}  
 