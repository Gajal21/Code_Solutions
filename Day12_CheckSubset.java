import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {
        // Write your code here.  
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(n<m){
            return false;
        }
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
            i++;
            j++;
        }
        else if(arr1[i]>arr2[j]){
            return false;
        }
        else{
            i++;
        }
        
        }
        if(j==m){
            return true;
        }
        return false;
    }
}
