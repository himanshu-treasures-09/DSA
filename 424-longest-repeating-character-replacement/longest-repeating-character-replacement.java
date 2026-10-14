class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxC = 0;
        int count[] = new int[26];
        int i = 0;
        int j = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            count[ch-'A'] = count[ch-'A'] + 1;
            maxC = Math.max(maxC,count[ch-'A']);

            while((j-i+1)-maxC > k){
                char d = s.charAt(i);
                count[d-'A'] = count[d-'A'] - 1;
                i++;

                // for(int l = 0;l<s.length();l++){
                //     maxC = Math.max(maxC,count[l]);
                // }
            }

            max = Math.max(max,j-i+1);
            j++;
        }
            return max;
    }
}