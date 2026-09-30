class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left = 0;
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[left++] = nums[i];
            }
        }
         for(int i = 0;i<nums.length;i++){
            if(nums[i]==pivot){
                arr[left++] = nums[i];
            }
        }
         for(int i = 0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[left++] = nums[i];
            }
        }
        return arr;
    }
}