class Solution {
    public int[] twoSum(int[] nums, int tar) {
        for(int i=0;i<nums.length;i++){
            int rem=tar-nums[i];
            int l=i+1;
            int r=nums.length-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(nums[mid]==rem){
                    return new int[]{i+1,mid+1};
                }else if(nums[mid]>rem){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
