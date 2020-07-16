package javasem5;
import java.util.*;
public class BinarySearch {
	  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);
            }else{  
            return binarySearch(arr, mid+1, last, key);
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
       Scanner scan = new Scanner(System.in);
       System.out.println("pls enter sorted array"); 
        int n = scan.nextInt();
        int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i]=scan.nextInt();
      }
      System.out.println("Element wanted to fine"); 
       int key = scan.nextInt();
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    } 

}
