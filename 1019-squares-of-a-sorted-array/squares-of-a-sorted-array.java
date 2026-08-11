class Solution {
    public int[] sortedSquares(int[] nums) {
        //int ans[]= new int[nums.length];
        //int index = 0;
        for(int i = 0;i<nums.length;i++){
           nums[i] = nums[i]*nums[i];
            
        }
        Arrays.sort(nums);
        return nums;
    }
}