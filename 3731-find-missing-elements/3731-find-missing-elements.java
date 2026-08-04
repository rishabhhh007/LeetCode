class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        Arrays.sort(nums);
        int m=0;
        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(nums[m]!=i) {
                ans.add(i);
                continue;
            }
            m++;
        }
        return ans;
    }
}