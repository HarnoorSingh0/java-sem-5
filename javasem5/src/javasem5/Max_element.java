package javasem5;
import java.util.*;
public class Max_element {

	
		static void max(int[] arr) {  
	       int max = arr[0]; 
	        int i;
	         for (i = 1; i < arr.length; i++) 
	             if (arr[i] > max) 
	                 max = arr[i];
	         System.out.print(max);       
	        
	    }
	    public static void main(String[] args) {  
	         Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	      for(int i = 0; i < n; i++){
	        a[i]=scan.nextInt();
	      }       
	        max(a);          
	            
	   
	        }  
	  
}
