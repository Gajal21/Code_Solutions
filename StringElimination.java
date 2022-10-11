import java.util.Scanner;
public class Solution {

	public static void eliminateChars(String s) {
	

//string is empty and also have 1 char
        if(s.length()<=1){
System.out.println(s);
        }
String result = "";
		char ch = s.charAt(0);
		result =result + ch;
		for(int i = 1;i < s.length();i++) {
			if(s.charAt(i) == ch); // if  the current curr is equal to the ch equal do nothing
			else 
				result =result+ s.charAt(i);
			ch =s.charAt(i);
		}
        System.out.println(result);
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string");
	String s = sc.nextLine();
    eliminateChars(s);

	}
}    
