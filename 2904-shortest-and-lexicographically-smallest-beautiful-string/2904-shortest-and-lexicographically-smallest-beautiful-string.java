class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int sum=0;
        int l=0;

        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') sum++;
            while (sum > k) {
                if (s.charAt(l) == '1') sum--;
                l++;
            }
            while (sum == k && s.charAt(l) == '0') {
                l++;
            }
            if (sum == k) {
                String temp = s.substring(l, i + 1);
                if (ans.equals("") ||
                    temp.length() < ans.length() ||
                    (temp.length() == ans.length() && temp.compareTo(ans) < 0)) {

                    ans = temp;
                }
            }
        }

        return ans;
    }
}