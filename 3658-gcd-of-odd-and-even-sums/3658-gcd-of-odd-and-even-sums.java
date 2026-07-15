class Solution {
    public int gcd(int a,int b){
        int m=Math.abs(a);
        int k=Math.abs(b);
        while(k!=0){
            int temp=k;
            k=m%k;
            m=temp;
        }
        return m;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        int c=0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(i%2==0) {
                sumeven+=i;
                c++;
            }
            else{
                sumodd+=i;
                
            }
            if(c==n) break;
        }
        return gcd(sumodd,sumeven);
    }
}