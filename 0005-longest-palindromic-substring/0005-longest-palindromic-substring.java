class Solution {
    public String longestPalindrome(String s) {

        TreeSet<String> ans = new TreeSet<>(
            (a, b) -> {
                if (a.length() != b.length())
                    return a.length() - b.length();
                return a.compareTo(b);
            });

        int n = s.length();

        for (int i = 0; i < n; i++) {

            int l = i;
            int r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                ans.add(s.substring(l, r + 1));
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                ans.add(s.substring(l, r + 1));
                l--;
                r++;
            }
        }

        return ans.last();
    }
}