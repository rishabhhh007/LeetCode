class Solution {
    int find(int x,int[] p){
        if(p[x]==x){
            return x;
        }
        return p[x]=find(p[x],p);
    }
    void union(int x,int y,int[] parent,int[] size){
        int rootX=find(x,parent);
        int rootY=find(y,parent);

        if(size[rootX]<size[rootY]){
            parent[rootX]=rootY;
            size[rootY]=rootX;
        }else{
            parent[rootY]=rootX;
            size[rootX]=size[rootY];
        }
         
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }

        int[] parent=new int[n+1];
        int[] size=new int[n+1];

        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }

        int temp=n;

        for(int[] e:connections){
            int u=find(e[0],parent);
            int v=find(e[1],parent);

            if(u!=v){
                union(u,v,parent,size);
                temp--;
            }
        }
        return temp-1;

    }
}