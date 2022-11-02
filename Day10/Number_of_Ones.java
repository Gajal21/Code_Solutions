import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countOnBits(int num) {
		// Write your code here.
      int bits = 0;
        while (num>0) {
            bits=bits+(num&1);
            num = num>>1;
        }
        return bits;
	}
}
