class Solution {
    public int resilientSubarray(int[] nums, int k) {
        long max=1;
        long count=1;
        long sum=nums[0];
        long r=nums[0]%k;
        for(int i=1;i<nums.length;i++){
            if(nums[i]%k==r){
                count++;
                sum+=nums[i];
            }else{
                count=1;
                sum=nums[i];
                r=nums[i]%k;
            }
            if(sum%k==r){
                max=Math.max(max,count);
            }
        }
        return (int)max;
    }
}