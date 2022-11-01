
class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        // HashSet<Integer> h=new HashSet<>();
        // for(int i=0;i<N;i++){
        //     h.add(A[i]);
        // }
      //return h.size();
     
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N-1;i++)
        {
            if(A[i]!=A[i+1]){
              list.add(A[i]); 
            }
        }
        list.add(A[N-1]);
        return list.size();
    }
}
