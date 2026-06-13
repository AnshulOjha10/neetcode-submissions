class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

           if (nums.length == 0) {
            return 0;
        }

        for (int num : nums) {
            set.add(num);
        }

        for(int s : set){
            if(!set.contains(s-1)){
                int length = 1;

                while(set.contains(s+length)){
                    length++;
                }

                count = Math.max(count, length);
            }
        }

        return count;
    }


}
