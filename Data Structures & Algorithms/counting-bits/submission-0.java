class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            ans[i]=cntBits(i);
        }
        return ans;
    }
    private static int cntBits(int n){
        int cnt=0;
        for(int i=0;i<32;i++){
            if(((n>>i)&1)==1){
                cnt++;
            }
        }
        return cnt;
    }
}
