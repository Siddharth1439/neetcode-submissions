class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s0: strs){
        String s1 = s0;
        char[] s = s0.toCharArray();
        Arrays.sort(s);
        String s2 = new String(s);
        map.putIfAbsent(s2,new ArrayList<>());
        map.get(s2).add(s1);
    }
    return new ArrayList<>(map.values());
    } 
}
