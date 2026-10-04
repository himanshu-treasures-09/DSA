class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;

        Map<Integer,Integer> map = new HashMap<>();
        int dup = 0;

        for(int i = 0; i < k; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);
            sum = sum+nums[i];
            if(map.get(nums[i])>1){
                dup = dup + 1;
            }

        }
            if(dup == 0){
                max = Math.max(max,sum);
            }

        for(int i = k;i < nums.length;i++){
            int vnew = nums[i];
            int remove = nums[i-k];

            if(!map.containsKey(vnew)){
                map.put(vnew,0);
            }
            map.put(vnew,map.get(vnew)+1);
            if(map.get(vnew)>1){
                dup = dup +1;
            }
            sum = sum + vnew;
            
            if(map.get(remove)>1){
                dup = dup - 1;
            }
            map.put(remove,map.get(remove)-1);
            sum = sum - remove;
            if(dup==0){
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}