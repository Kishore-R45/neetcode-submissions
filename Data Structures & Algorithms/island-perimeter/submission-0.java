class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        int n=grid.length;
        int m=grid[0].length;
        int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    for(int d[]:dir){
                        int nr=i+d[0];
                        int nc=j+d[1];
                        if(nr<0 || nr>=n || nc<0 || nc>=m || grid[nr][nc]==0){
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }
}