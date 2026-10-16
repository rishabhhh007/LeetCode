class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        // int ans=0;
        int total=0;
        int l=n-k;
        int lsum=0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
            if(i<l) lsum+=cardPoints[i];
        }
        int ans=total-lsum;
        for(int i=l;i<n;i++){
            lsum+=cardPoints[i];
            lsum-=cardPoints[i-l];
            ans=Math.max(ans,total-lsum);
        }
        return ans;
    }
}