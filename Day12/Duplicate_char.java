

public class Solution {

    public static ArrayList<Pair> duplicate_char(String s, int n) {
        // Write your Code here
      HashMap<Character,Integer> h=new HashMap<>();
       char ch[]=s.toCharArray();
        for(char c:ch){
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
              h.put(c,1);  
            }
        }

        ArrayList<Pair> ans = new ArrayList<>();
        for(Map.Entry e: h.entrySet())
        {
            char ci=(char)e.getKey();
            int val=(int)e.getValue();
            if(val>1){
                 Pair p = new Pair(ci, val);
                ans.add(p);
            }
        }

        return ans;
    }
}
