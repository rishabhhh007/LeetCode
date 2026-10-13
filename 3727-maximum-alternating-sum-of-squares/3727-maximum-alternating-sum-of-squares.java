class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans=0;
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i]*nums[i];
        }
        Arrays.sort(temp);
        if(temp.length%2==0){
            int l=0;
            int h=temp.length-1;
            while(l<h){
                ans+=temp[h]-temp[l];
                l++;
                h--;
            }
        }else{
            ans+=temp[temp.length-1];
            int l=0;
            int h=temp.length-2;
            while(l<h){
                ans+=temp[h]-temp[l];
                l++;
                h--;
            }
        }
        return ans;
    }
}