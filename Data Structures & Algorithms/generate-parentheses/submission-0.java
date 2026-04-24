class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(ans,n,0,0,"");
        return ans;
    }
    private static void backtrack(List<String> ans,int n,int o,int c,String cur){
        if(2*n == c+o){
            ans.add(cur);
            return;
        }
        if(o<n){
            backtrack(ans,n,o+1,c,cur+"(");
        }
        if(c<o){
            backtrack(ans,n,o,c+1,cur+")");
        }
    }
}
