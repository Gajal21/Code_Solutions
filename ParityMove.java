import java.util.* ;
import java.io.*; 
public class Solution {
  public static int[] parityMove(int a[], int n) {
    // Write your code here.
      
          int i = 0, j = n - 1;
        while (i < j)
        {
            
            while (a[i]%2 == 0 && i < j)
                i++;
 
           
            while (a[j]%2 == 1 && i < j)
                j--;
 
            if (i < j)
            {
               
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
    
    
    return arr;


  }
}
