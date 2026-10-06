class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max = 0;
        for(int i = 0;i<k;i++){
            sum = sum + nums[i];
        }
       // max = Math.max(sum,max);
        max = sum;
        for(int i = k;i<nums.length;i++){
            sum = sum + nums[i];
            sum = sum - nums[i-k];

            max = Math.max(sum,max);
        }
        return max/k;
    }
}