class Solution{
public int minimumCost(int[]nums,int k){
    long mod=1000000007L;
    long cost=0;
    long res=k;
    long cnt=1;
    for(int x:nums){
        if(res<x){
            long need=(x-res+k-1)/k;
            long first=cnt;
            long last=cnt+need-1;
            long sum;
            if((need&1)==0){
                sum=((need/2)%mod)*((first+last)%mod)%mod;
            }else{
                sum=(need%mod)*(((first+last)/2)%mod)%mod;
            }
            cost=(cost+sum)%mod;
            cnt+=need;
            res+=need*k;
        }
        res-=x;
    }
    return(int)cost;
    }
}