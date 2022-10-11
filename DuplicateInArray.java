import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
        Collections.sort(arr);
        int ans=0;
        for(int i=0;i<arr.size()-1;i++){
            if((int)arr.get(i)==(int)arr.get(i+1))
            {
                ans=arr.get(i);
}
        }
        return ans;
	}
}
