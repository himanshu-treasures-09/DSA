class Solution {
    public int countBinarySubstrings(String s) {
       int count = 0;
       int i = 1;
       int prev = 0;
       int curr = 1;
       while(i<s.length()){
        if(s.charAt(i-1)!=s.charAt(i)){
            count += Math.min(prev,curr);
            prev = curr;
            curr = 1;
        }else{
            curr++;
        }
        i++;
       }
       return count+=Math.min(prev,curr);
    }
}