package com.MS;

import java.util.LinkedList;
import java.util.Vector;


public class Test2 {  
    public static void main(String[] args) {  
    	try {
	    	for(int i=100;i<=999;i++) {
	    		 char[] chars=String.valueOf(i).toCharArray();
	    		 double sum=0;
	    		 for(char c:chars) {
	    			 Integer ic = Integer.valueOf(String.valueOf(c));
	    			 sum+=ic*ic*ic;
	    		 }
	    		 
	    		 if(i==sum)
	    			 System.out.println("水仙花："+i);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }  

    
    
    

}  
 