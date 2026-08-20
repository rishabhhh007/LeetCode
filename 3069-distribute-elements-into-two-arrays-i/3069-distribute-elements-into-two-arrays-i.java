class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] temp1=new int[n];
        int[] temp2=new int[n];
        temp1[0]=nums[0];
        temp2[0]=nums[1];
        int i=2;
        int t1=1;
        int t2=1;
        while(i<n){
            if(temp1[t1-1]>temp2[t2-1]){
                temp1[t1++]=nums[i++];
            }else{
                temp2[t2++]=nums[i++];
            }
        }
        int p=0;
        for(int j=0;j<t1;j++) {
            ans[p++] = temp1[j];
        }
        for(int j=0;j<t2;j++) {
            ans[p++] = temp2[j];
        }
        return ans;
    }
}