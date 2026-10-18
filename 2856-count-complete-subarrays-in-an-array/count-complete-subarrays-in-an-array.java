class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // int k = (int) Arrays.stream(nums).distinct().count();  
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        } 
        int k = set.size();
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()==k){
                count+= nums.length-j;
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                   // i++;
                }
                i++;
            }
            j++;
        }
        return count;
    }
}