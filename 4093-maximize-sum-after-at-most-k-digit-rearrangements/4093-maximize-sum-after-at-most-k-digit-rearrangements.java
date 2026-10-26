class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=nums[i];
        }   
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=tosort(nums[i])-nums[i];
        }
        Arrays.sort(temp);
        for(int i=n-1;i>=0 && k>0;i--){
            if(temp[i]>0){
                ans+=temp[i];
                k--;
            }
        }
        return ans;

    }
    int tosort(int n){
        String s=String.valueOf(n);
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i <ch.length/2;i++) {
           char temp =ch[i];
           ch[i] =ch[ch.length - 1 - i];
           ch[ch.length - 1 - i] = temp;
        }
        return Integer.parseInt(new String(ch));

    }
}