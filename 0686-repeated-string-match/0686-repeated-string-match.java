class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int ans=0;
        int n=b.length();
        while(sb.length()<n){
            sb.append(a);
            ans++;
        }

        if(sb.indexOf(b)!=-1) return ans;
        sb.append(a);
        ans++;
        if(sb.indexOf(b)!=-1) return ans;
        return -1;
    }
}