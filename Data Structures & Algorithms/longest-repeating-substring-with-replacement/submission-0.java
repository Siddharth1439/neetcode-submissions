class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int ans = 0;
        int maxfreq = 0;
        int[] count = new int[26];
        for(int right = 0;right < s.length();right++){
            count[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq,count[s.charAt(right)-'A']);

            if((right - left + 1)-maxfreq > k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
