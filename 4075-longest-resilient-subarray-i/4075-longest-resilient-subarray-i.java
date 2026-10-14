class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n=nums.length;
        int ans=1;
        int l=0;
        while(l<n) {
            int temp=nums[l]%k;
            int r=l;
            while(r<n&&nums[r]%k==temp) {
                r++;
            }
            int len=r-l;
            int period=k/gcd(temp,k);
            ans=Math.max(ans,1+((len-1)/period)*period);
            l=r;
        }
        return ans;
    }
    int gcd(int a,int b) {
        while(b!=0) {
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}