class Solution {
    public int minSumOfLengths(int[] nums, int target) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        int[] temp=new int[n];
        Arrays.fill(temp,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>target){
                sum-=nums[l];
                l++;
            }
            if(sum==target){
                int len=i-l+1;
                if(l>0&&temp[l-1]!=Integer.MAX_VALUE){
                    ans=Math.min(ans,len+temp[l - 1]);
                }
            }
            if(i==0){
                temp[i]=(sum==target)?i-l+1:Integer.MAX_VALUE;
            }else{
                temp[i]=temp[i - 1];
                if(sum==target){
                    temp[i]=Math.min(temp[i],i-l+1);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;

    }
}