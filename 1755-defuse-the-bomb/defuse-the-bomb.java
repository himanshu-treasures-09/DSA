class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k==0){
            return ans;
        }

        // for(int i = 0;i<code.length;i++){
        //     if(k>0){
        //         for(int j = i+1;j<=i+k;j++){
        //             ans[i] += code[j%code.length];
        //         }
        //     }else{
        //         for(int j = i-Math.abs(k);j<i;j++){
        //             ans[i] += code[(j+code.length)%code.length];
        //         }
        //     }
        // }
        int start = 1, end = k, sum = 0;
        if(k<0){
            start = code.length-Math.abs(k);
            end = code.length-1;
        }

        for(int i = start;i<=end;i++){
            sum += code[i];
        }

        for(int i = 0;i<code.length;i++){
            ans[i] += sum;

            sum -= code[start%code.length];
            sum += code[(end+1)%code.length];

            start++;
            end++;
        }

        return ans;
    }
}