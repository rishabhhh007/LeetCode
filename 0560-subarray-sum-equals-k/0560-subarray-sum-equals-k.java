class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int cnt=0;
        int sum=0;
        m.put(0,1);
        for(int i:nums){
            sum+=i;
            cnt+=m.getOrDefault((sum-k),0);
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}