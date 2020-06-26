package com.MS;

import java.util.LinkedList;
import java.util.Vector;


public class Test1 {  
    public static void main(String[] args) {  
    	double num=100;
    	int vi=0;
    	int vj=0;
    	for(int i=1;i<=20;i++) {
    		for(int j=1;j<=20;j++) {
    			double value = Math.abs(0.618-i*1.0/j);
    			if(num>value) {
    				num=value;
    				vi=i;
    				vj=j;
    			}
        	}
    	}
    	System.out.println(num);
    	System.out.println(vi);
    	System.out.println(vj);
    	System.out.println(vi*1.0/vj);
    }  
}  
 