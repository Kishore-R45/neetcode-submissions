class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans=new int[k];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return a[0]-b[0];
            }
            return b[1]-a[1];
        });
        for(int i:map.keySet()){
            pq.offer(new int[]{i,map.get(i)});
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}
