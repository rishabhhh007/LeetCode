class Solution {
    public long maxPairStrength(int[] nums) {
        long ans=Long.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int gcd=GCD(nums[i],nums[j]);
                long a=(long)nums[i]*nums[j];
                long temp=(a/(long)(gcd*gcd));
                ans=Math.max(ans,temp);
            }
        }
        return ans;
        
    }
    public static int GCD(int a,int b) {
        if(b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}
