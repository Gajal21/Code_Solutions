import java.util.ArrayList;
import java.util.*;
public class Solution {

   public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {

       int[] ans=new int[2];
       Collections.sort(arr);
       
       int i=1;
        while(i<=n)
        {
          if(!(arr.contains(i)))
          ans[0]=i;
    
           i++;
        }

         for(i=0;i<n-1;i++){

                if(arr.get(i)==arr.get(i+1))
                {
                    ans[1]=arr.get(i);
                    break;                  
                }
            }
   
       return ans;
   }
}
