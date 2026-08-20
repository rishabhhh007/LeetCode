class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        int left=n-k+1; 
        int i=0;
        while(i<left){
            Set<Integer> set = new HashSet<>();
            for(int j=i;j<i+k;j++) {
                set.add(nums[j]);
            }
            for(int num:set) {
                m.put(num, m.getOrDefault(num, 0) + 1);
            }
            i++;
        }
        int ans=-1;
        for(int ii:m.keySet()){
            int val=m.get(ii);
            if(val==1 && ii>ans){
                ans=ii;
            }
        }
        return ans;
    }
}