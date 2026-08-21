class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] temp=new int[k];
        for(int i:arr){
            int ii=i%k;
            if(ii<0) ii+=k;
            
            temp[ii]++;
        }

        if(temp[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++){
            if(temp[i]!=temp[k-i]) return false;
        }
        return true;
    }
}