class Solution {
    public int gcd(int a,int b){
        while(b!=0){
          int temp=b;
        b=a%b;
        a=temp;  
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] prefix=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefix);
        int l=0;
        int r=prefix.length-1;
        long sum=0;
        while(l<r){
            sum+=gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return sum;

    }
}