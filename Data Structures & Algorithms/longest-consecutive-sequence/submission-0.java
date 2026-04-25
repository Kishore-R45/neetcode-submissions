class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            int cur=i;
            if(!set.contains(cur-1)){
                while(set.contains(cur)){
                    cur++;
                }
                max=Math.max(max,cur-i);
            }
        }
        return max;
    }
}
