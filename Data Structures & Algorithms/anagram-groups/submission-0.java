class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String res = Arrays.toString(arr);
            map.putIfAbsent(res,new ArrayList<>());
            map.get(res).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
