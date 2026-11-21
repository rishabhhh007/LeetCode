class Solution {
    int find(int x,int[] p){
        if(p[x]==x){
            return x;
        }

        return p[x]=find(p[x],p);
    }

    void union(int x,int y,int[] p,int[] size){
        int rootx=find(x,p);
        int rooty=find(y,p);
        if(rootx==rooty){
            return;
        }

        if(size[rootx]<size[rooty]){
            p[rootx]=rooty;
            size[rooty]+=size[rootx];
        }else{
            p[rooty]=rootx;
            size[rootx]+=size[rooty];
        }
    }
    public int findCircleNum(int[][] c) {
        int n=c.length;
        int[] p=new int[n+1];
        int[] s=new int[n+1];

        for(int i=0;i<n;i++){
            p[i]=i;
            s[i]=1;
        }
        int ans=n;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(c[i][j]==1){
                    int temp1=find(i,p);
                    int temp2=find(j,p);

                    if(temp1!=temp2){
                        ans--;
                        union(i,j,p,s);
                    }
                }
            }
        }
        return ans;
    }
}