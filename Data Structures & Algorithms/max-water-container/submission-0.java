class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0;
        int j = heights.length - 1;
        int maxWater = 0;

        while(i < j){

            int width = j - i;
            int length = Math.min(heights[i], heights[j]);
            int currentWater = length * width;  
            maxWater = Math.max(maxWater, currentWater);

            if(heights[i] <= heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxWater;
    }
}
