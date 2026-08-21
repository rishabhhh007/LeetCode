class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m=new HashMap<>();
        Map<Character,Character> m2=new HashMap<>();

        if (s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            if (!m.containsKey(s.charAt(i))) {
                if (m2.containsKey(t.charAt(i))) return false;
                m.put(s.charAt(i),t.charAt(i));
                m2.put(t.charAt(i),s.charAt(i));
            } 
            else if(m.get(s.charAt(i))!=t.charAt(i)) {
                return false;
            }
        }
        return true;
    
    }
}