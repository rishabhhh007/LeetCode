class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) return false;
        int n=t.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            freq[c-'a']++;
        }
        // if(n<t.length()) return false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c-'a']==0) return false;
            freq[c-'a']--;
        }
        return true;
    }
}