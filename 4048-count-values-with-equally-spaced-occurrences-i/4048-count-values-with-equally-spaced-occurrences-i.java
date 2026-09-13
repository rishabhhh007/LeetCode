class Solution {
    public int countSpecialIntegers(int[] nums) {
         Map<Integer,List<Integer>> m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.putIfAbsent(nums[i],new ArrayList<>());
            m.get(nums[i]).add(i);
        }
        int ans=0;
        for(int i:m.keySet()){
            List<Integer> l=m.get(i);
            if(l.size()!=3) continue;
            int p=l.size()-1;
            if(l.get(p)-l.get(p-1)==l.get(p-1)-l.get(p-2)) ans++;
        }
        return ans;
    }
}