//find the maximum and minimum elements in array
import java.util.*;
public class ques1 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = obj.nextInt();
      }
      int max=Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        if(arr[i]>max){
            max=arr[i];
        }
      }
      System.out.println("MAXIMUM ELEMENT: " + max);
      int min=Integer.MAX_VALUE;
      for(int i=0; i<n; i++){
        if(arr[i]<min){
            min=arr[i];
        }
      }
      System.out.println("MINIMUM ELEMENT: " + min);}
   }

