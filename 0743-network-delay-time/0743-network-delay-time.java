class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adjlist=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            adjlist.add(new ArrayList<>());
        }

        for(int[] e:times){
            adjlist.get(e[0]).add(new int[]{e[1],e[2]});
            // adjlist.get(e[1]).add(new int[]{e[0],e[2]});

        }

        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;

        PriorityQueue<int[]> p=new PriorityQueue<>((a,b)->a[0]-b[0]);
        p.offer(new int[]{k,0});

        while(!p.isEmpty()){
            int[] temp=p.poll();
            int a=temp[0];
            int b=temp[1];

            if(b>dist[a]) continue;

            for(int[] next:adjlist.get(a)){
                int v=next[0];
                int w=next[1];

                if(b+w<dist[v]){
                    dist[v]=b+w;
                    p.offer(new int[]{v,b+w});
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++) {
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            max=Math.max(max,dist[i]);
        }
        return max;

    }
}