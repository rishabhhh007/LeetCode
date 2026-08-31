class Solution {
    public int minBishopMoves(int[] s, int[] t) {
        int temp1=(s[0]+t[0])%2;
        int temp2=(s[1]+t[1])%2;
        if(temp1!=temp2) return -1;
        else{
            if(Math.abs(s[0]-t[0])!=Math.abs(s[1]-t[1])) return 2;
        }
        return 1;
    }
}