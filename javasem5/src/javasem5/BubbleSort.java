package javasem5;
import java.util.*;
public class BubbleSort {
	
	static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	            
	            for(int j=1; j < (n-i); j++){  
	                if(arr[j-1] > arr[j]){  
	                 temp = arr[j-1];  
	                 arr[j-1] = arr[j];  
	                 arr[j] = temp;	                 
	                }  
	            }  	           
	         }  
	    }
	    static void Sort(int[] arr) {  
	        Arrays.sort(arr);
	    }
	    public static void main(String[] args) {  
	         Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	        a[i]=scan.nextInt();
	    }       
	                bubbleSort(a);
	              //  Sort(a);
	                for(int i=0; i < a.length; i++){  
	                        System.out.print(a[i] + " ");  
	                }  
	   
	        }  
	  

}
