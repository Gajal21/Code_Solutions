import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int freq=n/2;
       HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(arr[i]))
            {
              m.put(arr[i],m.get(arr[i])+1);  
            }
            else
            {
                           m.put(arr[i],1);  
            }
        }

        int maxkey=-1;
        for(Map.Entry e: m.entrySet())
        {
            int key=(int)e.getKey();
            int val=(int)e.getValue();
            if(val>freq)
            {
                maxkey=key;
            }
        }        
        
        
        return maxkey;
        
	}
}
