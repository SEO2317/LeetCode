class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int tmp = 0;
        
        for(int i =0; i<nums.length;i++){
            tmp+=nums[i];
            answer[i] = tmp;
        }
    return answer;
    }
}