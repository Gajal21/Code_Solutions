import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseVowels(String s){
        // Write your code here.
      Stack<Character> vowels=new Stack<>();
      char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if((c[i]=='a') || (c[i]=='i') || (c[i]=='e') || (c[i]=='o')
              ||  (c[i]=='u') )
            {
   vowels.add(c[i]);
            }
        }

        
        
  
    for(int i=0;i<c.length;i++){
         if((c[i]=='a') || (c[i]=='i') || (c[i]=='e') || (c[i]=='o')
              ||  (c[i]=='u') )
         {
             char v=(char)vowels.pop();
              c[i]=v;
         }
      
    }
        return new String(c);
    }
}
