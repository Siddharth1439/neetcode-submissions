class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map = new HashMap<>();
      for(String s:strs){
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String s2 = new String(s1);
        map.putIfAbsent(s2, new ArrayList<>());
        map.get(s2).add(s);
      }
      return new ArrayList<>(map.values());
    } 
}
