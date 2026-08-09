class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count = 0;
        //int ans = 0;
        // for(int i = 0;i<players.length;i++){
        //     for(int j = 0;j<trainers.length;j++){
        //         if(players[i]<=trainers[j]){
        //             count++;
        //             break;
        //         }
        //     }
        // }
        // return ans = Math.max(ans,count);
        int left = 0;
        int right = 0;
        while(left<players.length && right<trainers.length){
            if(players[left]<=trainers[right]){
                count++;
                left++;
                right++;
            }else{
                right++;
            }
        }
        return count;
    }
}