import java.util.* ;
import java.io.*; 

public class Solution {
 static boolean  func(char[] s,int start ,int end){
    while(start <end){
        if(s[start] !=s[end])
            return false;
        start++;
        end--;
    }
    return true;
}
    
    static boolean check(char[] s){
    int start = 0,end = s.length-1;
    while(start <end){
        if(s[start ] != s[end]){
       
            return func(s,start +1,end) ||func(s,start ,end-1);
        }
        start ++;
        end--;
        }
    return true;
    }

	public static boolean validPalindrome(int n, String st) {
		// Write your code here
        char s[]=st.toCharArray();
        return check(s);
	}

}
