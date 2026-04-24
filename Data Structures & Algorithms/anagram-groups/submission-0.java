class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String t=new String(arr);
            if(map.containsKey(t)){
                map.get(t).add(s);
            }else{
                List<String> l=new ArrayList<>();
                l.add(s);
                map.put(t,l);
            }
        }
        for(List<String> list:map.values()){
            ans.add(list);
        }
        return ans;
    }
}
