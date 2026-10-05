class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();
        int ocnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                st.push('(');
                ocnt++;
            }
            else{
                if(s.charAt(i-1) == '(') {
                    ans+=(int)Math.pow(2, ocnt - 1);
                }
                st.pop();
                ocnt--;
            }
        }
        return ans;
    }
}