class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int l = 0;
        int r = ss.length() - 1;
        while (l < r) {
            if (ss.charAt(l) == ss.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}
