class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        // int ocnt=0;
        int ccnt=0;
        int ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(ccnt%2==1){
                    ans++;
                    ccnt--;
                }
                ccnt+=2;
            }else{
                ccnt--;
                if(ccnt<0){
                    ans++;
                    ccnt=1;
                }
            }
        }
        return ans+ccnt;
    }
}