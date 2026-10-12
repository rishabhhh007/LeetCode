class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans=new ArrayList<>();
        long sum=0;
        for(int i=2;i<=n;i++){
            if(prime(i)){
                if(sum+i>s) break;
                sum+=i;
                ans.add(i);
            }
        }
        return ans;

    }
    private boolean prime(int n){
        if(n<2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}