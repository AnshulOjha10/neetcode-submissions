class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> map = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){

            while(map.contains(s.charAt(right))){
                map.remove(s.charAt(left));
                left++;
            }

            map.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
