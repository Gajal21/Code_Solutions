import java.util.* ;
import java.io.*; 
public class Solution {
	public static int ninjaCandidate(ArrayList<Integer> arr) {
		 //Write your code here
      
        
     
        Collections.sort(arr);
        
        int beg=arr.get(arr.size()-1)*arr.get(arr.size()-2)*arr.get(arr.size()-3);
        int last=arr.get(0)*arr.get(1)*arr.get(arr.size()-1);
        return Math.max(beg,last);
	}
}

