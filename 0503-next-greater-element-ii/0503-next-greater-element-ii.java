class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n*2;i++){
            int temp=i%n;
            while(!s.isEmpty() && nums[s.peek()]<nums[temp]){
                ans[s.pop()]=nums[temp];
            }
            s.push(temp);
        }
        return ans;
    }
}