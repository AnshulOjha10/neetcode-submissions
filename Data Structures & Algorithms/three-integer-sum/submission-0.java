class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        int i =0;
        int j = nums[i];

        int l = 0;
        int r = n - 1;
        Arrays.sort(nums);

        while(l < r){

            if(l > 0 && nums[l] == nums[l-1]){
                continue;
            }

            if(nums[i] + nums[l] + nums[j] == 0){
                
            }




        }
    }
}
