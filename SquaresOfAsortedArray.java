import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
		// Write your code here.
         ArrayList<Integer> ans=new  ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            
            int square=(int)arr.get(i)*(int)arr.get(i);
            ans.add(square);
        }
        Collections.sort(ans);
        return ans;
	}
}
