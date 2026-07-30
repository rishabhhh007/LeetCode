class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=series1.length;
        int m=series2.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            List<Integer> temp=new ArrayList<>();
            int a=series1[i][0];
            int b=series2[j][0];
            int c=series1[i][1];
            int d=series2[j][1];
            int sum=0;

            if(a==b){
                sum=c+d;
                temp.add(a);
                temp.add(sum);
                sum=0;
                i++;
                j++;
            }else{
                int min=Math.min(a,b);
                if(a==min){
                    sum=c+d;
                    temp.add(a);
                    temp.add(sum);
                    sum=0;
                    i++;
                }else{
                    if(i==n){
                        temp.add(b);
                        temp.add(d);
                        j++;
                    }else{
                        sum=c+d;
                        temp.add(b);
                        temp.add(sum);
                        sum=0;
                        j++;
                    }
                }
            }
            ans.add(temp);
        }
        if(j==m){
            while(i<n){
                ans.add(Arrays.asList(series1[i][0],series1[i][1]));
                i++;
            }
            
        }
        if(i==n){
            while(j<m){
                ans.add(Arrays.asList(series2[j][0],series2[j][1]));
                j++;
            }
        }
        return ans;
    }
}