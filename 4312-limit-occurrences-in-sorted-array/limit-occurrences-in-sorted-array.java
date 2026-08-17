class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int count = 0;
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                count = 1;
            }else{
                count++;
            }
            if(count<=k){
                nums[index] = nums[i];
                index++;
            }
        }
        return Arrays.copyOf(nums,index);
    }
}