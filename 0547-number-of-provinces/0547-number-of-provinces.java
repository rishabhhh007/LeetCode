class Solution {
    int find(int x,int[] p){
        if(p[x]==x){
            return x;
        }
        return p[x]=find(p[x],p);

    }

    void union(int x,int y,int[] parent, int[] size){
        int rootX=find(x,parent);
        int rootY=find(y,parent);

        if(size[rootX]<size[rootY]){
            parent[rootX]=rootY;
            size[rootY]+=size[rootX];
        }else{
            parent[rootY]=rootX;
            size[rootX]=size[rootY];
        }
    }
    public int findCircleNum(int[][] isConnected) {
        
        int n=isConnected.length;

        int[] parent=new int[n+1];
        int[] size=new int[n+1];

        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }
        int temp=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    int temp1=find(i,parent);
                    int temp2=find(j,parent);

                    if(temp1!=temp2){
                        union(temp1,temp2,parent,size);
                        temp--;
                    }
                }
            }
        }
        return temp;
    }
}