class Solution {
    public static String recurssion(String s){
        StringBuilder sb=new StringBuilder();
        char[] temp=s.toCharArray();
        char curr=temp[0];
        int cnt=0;

        for(char c:temp){
            if(c==curr){
                cnt++;
            }else{
                sb.append(cnt);
                sb.append(curr);
                curr=c;
                cnt=1;

            }
        }
        sb.append(cnt);
        sb.append(curr);
        return sb.toString();

    }
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return recurssion(countAndSay(n-1));
        

    }
} 