package javasem5;
import java.util.*;
public class duplicate {
	static void printRepeating(int arr[], int size) 
    { 
        int i;   
        System.out.println("The repeating elements are : "); 
     
        for (i = 0; i < size; i++) 
        { 
            if (arr[ Math.abs(arr[i])] >= 0) 
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
          
        }          
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	        a[i]=scan.nextInt();
	    }       
	            printRepeating(a ,n); 
	               

	}

}
