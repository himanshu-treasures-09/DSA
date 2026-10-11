class Solution {
    public int maximumLengthSubstring(String s) {
       int max = 0;
       int i = 0;
       int j = 0;
       HashMap<Character,Integer> map = new HashMap<>();
       while(j<s.length()){
        char ch = s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch)>2){
            char left = s.charAt(i);
            map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                map.remove(left);
            }
            i++;
        }
        max = Math.max(max,j-i+1);
        j++;
       } 
       return max;
    }
}