//find the kth maximun and minimum elements in array

import java.util.*;

public class ques3 {
    public static void main(String[] args) {
    Scanner obj= new Scanner(System.in);
    ArrayList<Integer> list= new ArrayList<>();
    int n= obj.nextInt();    
    for(int i=0; i < n; i++){
        list.add(obj.nextInt());
    }
    int k = obj.nextInt();
    if(k<=n/2)
   
    {while(k>0){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
        
        for(int i=0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        // Remove the found maximum and minimum elements
        list.remove(Integer.valueOf(max));
        list.remove(Integer.valueOf(min));
        if(k == 1) {
            System.out.println(n+"th Maximum Element: " + max);
            System.out.println(n+"th Minimum Element: " + min);
        }
        k--;
    }
       } else{
        System.out.println("Insufficient elements in the array to find the " + k + "th maximum and minimum elements.");
       }
    }
}

