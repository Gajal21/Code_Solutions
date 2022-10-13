
import java.util.*;
import java.io.*;
import java.lang.*;



class Solution
{
    public static long numberOfSquares(long base)
    {
        //code here
        long n = (base/2)-1;
        long ans= (n*(n+1))/2;
        return ans;
    }
}
