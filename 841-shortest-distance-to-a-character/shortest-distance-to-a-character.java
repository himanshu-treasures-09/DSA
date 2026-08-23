class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int right[] = new int[n];
        int left[] = new int[n];
        Arrays.fill(right,Integer.MAX_VALUE);
        Arrays.fill(left,Integer.MAX_VALUE);
        int index = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)==c){
                index = 0;
                right[i] = index;
            }else{
                if(index!=Integer.MAX_VALUE){
                    index++;
                    right[i] = index;
                }
            }
        }
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i)==c){
                index = 0;
                left[i] = index;
            }else{
                if(index!=Integer.MAX_VALUE){
                    index++;
                    left[i] = index;
                }
            }
        }
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = Math.min(right[i],left[i]);
        }
        return ans;
    }
}