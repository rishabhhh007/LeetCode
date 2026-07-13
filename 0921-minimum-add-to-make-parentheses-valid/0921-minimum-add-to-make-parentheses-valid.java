class Solution {
    public int minAddToMakeValid(String s) {
        int opencnt=0;
        int closecnt=0;
        boolean close=false;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                opencnt++;
            }else{
                if(opencnt>0) opencnt--;
                else ans++;
            }
        }
        return ans+opencnt;
    }
}