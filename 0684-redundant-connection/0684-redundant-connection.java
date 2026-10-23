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

        if(rootX<rootY){
            parent[rootX]=rootY;
            size[rootY]=size[rootX];
        }else{
            parent[rootY]=rootX;
            size[rootX]+=size[rootY];
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] parent=new int[n+1];
        int[] size=new int[n+1];

        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        } 

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            int rootU=find(u,parent);
            int rootV=find(v,parent);

            if(rootU==rootV){
                return e;
            }

            union(u,v,parent,size);
        }

        return new int[0];
    }
}