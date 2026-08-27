class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int left = 0;
        int right = 0;
        int count = 0;
        while(left<arr1.length){
        boolean found = true;
            while(right<arr2.length){
                if(Math.abs(arr1[left]-arr2[right])<=d){
                    found = false;
                    break;
                }
                right++;
            }
            right = 0;
            if(found){
                count++;
            }
            left++;
        }
        return count;
    }
}