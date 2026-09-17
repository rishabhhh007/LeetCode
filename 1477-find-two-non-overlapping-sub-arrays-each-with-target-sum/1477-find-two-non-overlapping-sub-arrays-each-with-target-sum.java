class Solution {
    public int minSumOfLengths(int[] nums, int target) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int l2=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        int[] temp=new int[n];
        // Arrays.fill(temp,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>target){
                sum-=nums[l];
                l++;
            }
            if(sum==target){
                int len=i-l+1;
                if(l>0&&temp[l-1]!=Integer.MAX_VALUE) {
                    ans=Math.min(ans,len+temp[l - 1]);
                }
                l2=Math.min(l2,len);
            }
            temp[i]=l2;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}