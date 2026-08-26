class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=1;
        int n=nums.length;
        int h=n;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(nums,k,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    boolean check(int[] nums,int k,int ws){
        int sum=0;
        for(int i=0;i<ws;i++){
            sum+=nums[i];
        }
        if(sum+k>=ws) return true;
        int p=0;
        for(int i=ws;i<nums.length;i++){
            sum-=nums[p++];
            sum+=nums[i];
            if(sum+k>=ws) return true;
        }
        return false;
    }
}