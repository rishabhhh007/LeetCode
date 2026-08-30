class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.putIfAbsent(nums[i],new ArrayList<>());
            m.get(nums[i]).add(i);
        }
        int ans=m.size();
        for(int i:m.keySet()){
            List<Integer> l=m.get(i);
            for(int j=0;j<l.size()-1;j++){
                if(l.get(j)!=l.get(j+1)-1) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}