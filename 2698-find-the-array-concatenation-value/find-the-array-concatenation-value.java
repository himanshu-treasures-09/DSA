class Solution {
    public long findTheArrayConcVal(int[] nums) {
       int left = 0;
       int right = nums.length-1;
       long conc = 0;
       long result = 0;
       while(left<right){
        result = Integer.parseInt(nums[left]+""+nums[right]);
        conc += result;
        left++;
        right--;
       }
       if(left==right){
        conc += nums[left];
       }
       return conc;
    }
}