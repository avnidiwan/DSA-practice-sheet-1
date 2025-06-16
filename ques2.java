//reverse an array in place
import java.util.*;
import java.util.Collections;
public class ques2 {
    public static void main (String[] args)
    {
        Scanner obj= new Scanner(System.in);
    int n= obj.nextInt();
    int[] arr= new int[n];
    for(int i=0; i < n; i++){
        arr[i]=obj.nextInt();
    }
    for(int i=0, j=n-1; i<=j; i++, j--){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    for(int i=0; i<n; i++){
        System.out.println(arr[i]+" ");
    }
}
}
