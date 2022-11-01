class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> s= new Stack<Integer>();
        s.push(arr[n- 1]);
 
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= s.peek()) {
                s.push(arr[i]);
            }
        }
 
       
        while (s.size()!=0) {
           ans.add(s.pop());
        }
        return ans;
    }
}
