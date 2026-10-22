class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] temp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(temp[i],Integer.MAX_VALUE);
            temp[i][i]=0;
        }

        for(int e[]: edges){
            temp[e[0]][e[1]]=e[2];
            temp[e[1]][e[0]]=e[2];
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(temp[i][k]!=Integer.MAX_VALUE &&
                     temp[k][j]!=Integer.MAX_VALUE &&
                     temp[i][k]+temp[k][j]<temp[i][j]){
                        temp[i][j]=temp[i][k]+temp[k][j];
                    }
                }
            }
        }
        int city=-1;
        int ref=Integer.MAX_VALUE;
        int p=0;
        for(int[] i:temp){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(j!=p && i[j]<=distanceThreshold){
                    cnt++;
                }
            }
            if(cnt<=ref){
                city=p;
                ref=cnt;
            }
            p++;
        }
        return city;
    }
}