class Solution {
    public int firstpos(int[] nums,int target){
        int first = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                first = mid;
                right = mid-1;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return first;
    }
    public int lastpos(int[] nums,int target){
        int last = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                last = mid;
                left = mid+1;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[] {-1,-1};
        }

        int firstidx = firstpos(nums,target);
        int lastidx = lastpos(nums,target);

        return new int[] {firstidx, lastidx};
    }
}