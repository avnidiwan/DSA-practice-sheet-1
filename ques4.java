//sort an array of 0s, 1s, 2s ( Dutch National Flag Problem)
import java.util.*;
public class ques4 {
   public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
         arr[i]=obj.nextInt();
      }
      Arrays.sort(arr);
      int c0, c1, c2;
      c0 = c1 = c2 = 0;
      for(int i=0;i<n;i++){
         if(arr[i]==0){
            c0++;
         }else if(arr[i]==1){
            c1++;
         }else if(arr[i]==2){
            c2++;
         }
      }
      System.out.println("0s: " + c0);
      System.out.println("1s: " + c1); 
      System.out.println("2s: " + c2);
   } 
}
