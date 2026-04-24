class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[]:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans++;
                dfs(vis,i,adj);
            }
        }
        return ans;
    }
    private static void dfs(boolean[] vis,int node,List<List<Integer>> adj){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(!vis[i]){
                vis[i]=true;
                dfs(vis,i,adj);
            }
        }
    }
}
