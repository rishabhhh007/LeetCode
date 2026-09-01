class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int sum=0;
        int ans=0;
        for(int i:nums){
            if(i%2!=0){
                sum+=1;
            }
            ans+=m.getOrDefault((sum-k),0);
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return ans;

    }
}