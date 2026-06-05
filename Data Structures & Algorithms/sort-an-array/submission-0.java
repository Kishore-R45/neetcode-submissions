class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    private static void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    private static void merge(int nums[],int low,int mid,int high){
        List<Integer> t=new ArrayList<>();
        int l=low;
        int r=mid+1;
        while(l<=mid && r<=high){
            if(nums[l]<=nums[r]){
                t.add(nums[l++]);
            }else{
                t.add(nums[r++]);
            }
        }
        while(l<=mid){
            t.add(nums[l++]);
        }
        while(r<=mid){
            t.add(nums[r++]);
        }
        for(int i=0;i<t.size();i++){
            nums[i+low]=t.get(i);
        }
    }
}