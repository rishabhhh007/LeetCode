class Solution {
    public int maximumLengthSubstring(String s) {
        int cnt=0;
        int k=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;

            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(k)-'a']--;
                k++;
            }
            cnt=Math.max(cnt,i-k+1);
        }


        return cnt;
    }
}

 