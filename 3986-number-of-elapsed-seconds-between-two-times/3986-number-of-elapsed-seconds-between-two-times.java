class Solution {
    public int secondsBetweenTimes(String s, String e) {
        int hr1=Integer.parseInt(""+s.charAt(0)+s.charAt(1));
        int hr2=Integer.parseInt(""+e.charAt(0)+e.charAt(1));

        int min1=Integer.parseInt(""+s.charAt(3)+s.charAt(4));
        int min2=Integer.parseInt(""+e.charAt(3)+e.charAt(4));

        int sec1=Integer.parseInt(""+s.charAt(6)+s.charAt(7));
        int sec2=Integer.parseInt(""+e.charAt(6)+e.charAt(7));

        int temp1=hr1*3600+min1*60+sec1;
        int temp2=hr2*3600+min2*60+sec2;

        return temp2-temp1;

    }
}