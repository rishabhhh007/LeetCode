class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> ans=new ArrayList<>();

        boolean[][] temp=new boolean[numCourses][numCourses];

        for(int[] e: prerequisites){
            temp[e[0]][e[1]]=true;
        }

        for(int k=0;k<numCourses;k++){
            for(int i=0;i<numCourses;i++){
                for(int j=0;j<numCourses;j++){
                    if(temp[i][k] && temp[k][j]){
                        temp[i][j]=true;
                    }
                }
            }
        }

        for(int[] e:queries){
            ans.add(temp[e[0]][e[1]]);
        }

        return ans;

    }
}