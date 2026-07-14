class Solution {
    public String convert(String s, int k) {
        if (k==1||s.length()<=k) return s;
        StringBuilder ans=new StringBuilder();
        Map<Integer,List<Character>> m = new HashMap<>();
        for (int i=0;i<k;i++)
            m.put(i,new ArrayList<>());
        boolean down=true;
        int temp=0;
        for (int i=0;i<s.length();i++) {
            m.get(temp).add(s.charAt(i));
            if(temp==0)
                down=true;
            else if(temp==k-1)
                down=false;
            if(down)
                temp++;
            else
                temp--;
        }
        for (int i=0;i<k;i++) {
            List<Character> l=m.get(i);
            for(char c:l)
                ans.append(c);
        }
        return ans.toString();
    }
}