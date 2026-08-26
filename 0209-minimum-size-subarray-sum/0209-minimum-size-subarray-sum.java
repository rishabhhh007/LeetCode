class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=1;
        int h=n;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(nums,target,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean check(int[] nums,int t,int ws){
        int sum=0;
        for(int i=0;i<ws;i++){
            sum+=nums[i];
        }
        if(sum>=t) return true;
        int p=0;
        for(int i=ws;i<nums.length;i++){
            sum-=nums[p++];
            sum+=nums[i];
            if(sum>=t) return true;
        }
        return false;
    }
}