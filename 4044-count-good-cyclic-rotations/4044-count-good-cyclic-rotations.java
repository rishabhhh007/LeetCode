class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long tsum=0;
        long leftsum=0;
        for(int i=0;i<n;i++){
            if(i<n/2){
                leftsum+=nums[i];
            }
            tsum+=nums[i];
        }

        int i=n/2;
        int cnt=0;
        int p=0;
        for(int temp=0;temp<n;temp++){
            if(leftsum>tsum-leftsum) cnt++;
            leftsum-=nums[p];
            leftsum+=nums[i];
            p++;
            i++;
            if(i==n){
                i=0;
            }

        }
        return cnt;

    }
}