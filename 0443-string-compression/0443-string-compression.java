class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int c=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            if(chars[i+1]!=chars[i]){
                sb.append(chars[i]);
                if(c>1){
                    sb.append(c);
                }
                c=1;
            }else{
                c++;
            }
        }
        if(n==1) return 1;
        if(chars[n-1]==chars[n-2]){
            sb.append(chars[n-1]);
            if(c>1){
                sb.append(c);
            }
        }else{
            if(c>1) {
                sb.append(c);
            }
            sb.append(chars[n-1]);
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.toString().length();
    }
}