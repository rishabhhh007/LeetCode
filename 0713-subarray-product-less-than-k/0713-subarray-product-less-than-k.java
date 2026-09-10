class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n=nums.length;
        int l=0;
        long prod=1;
        long ans=0;
        for(int i=0;i<n;i++){
            prod*=nums[i];
            while(prod>=k){
                prod/=nums[l];
                l++;
            }
            ans+=i-l+1;

        }
        return (int)ans;
    }
}