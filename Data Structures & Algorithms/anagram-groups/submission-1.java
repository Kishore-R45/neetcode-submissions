class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent((new String(arr)), x -> new ArrayList<>()).add(s);
        }
        for(List<String> list:map.values()){
            ans.add(list);
        }
        return ans;
    }
}
