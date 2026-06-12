class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int productOfAll = 1;
        int count = 0;

        int[] output = new int[n];

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                count++;
            } else {
                productOfAll *= nums[i];
            }
        }


        for (int i = 0; i < n; i++) {


            if (count > 1) {
                output[i] = 0;
            }


            else if (count == 1) {

                if (nums[i] == 0) {
                    output[i] = productOfAll;
                } else {
                    output[i] = 0;
                }
            }


            else {
                output[i] = productOfAll / nums[i];
            }
        }

        return output;
    }
}