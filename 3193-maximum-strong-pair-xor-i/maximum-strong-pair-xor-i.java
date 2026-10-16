class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        //int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                int ans = nums[i] ^ nums[j];
                max = Math.max(max,ans);
                }
            }
        }
        return max;
    }
}