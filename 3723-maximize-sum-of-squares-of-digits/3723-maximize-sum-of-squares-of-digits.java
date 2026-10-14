class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) return "";
        char[] ch=new char[num];
        int i=0;
        while(sum>0 && i<num){
            ch[i++]=(char)('0'+Math.min(sum,9));
            sum-=Math.min(sum,9);
        }
        while(i<num) ch[i++]='0';

        return String.valueOf(ch);
    }
}