class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] right = new int[n];
        int[] left = new int[n];
        int ans = 0;
        Stack <Integer> s = new Stack<>();

        for(int i = n-1; i >= 0; i--){

            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                right[i] = n;

            }else{
                right[i] = s.peek();
            }

            s.push(i);
        }

        s.clear(); 

        for(int i = 0; i < n; i++){

            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = s.peek();
            }

            s.push(i);
        }

        for(int i = 0; i < n; i++){
        int width = right[i] - left[i] - 1;
        int area = heights[i] * width;

        ans = Math.max(ans, area);
        }

        return ans;











    }   
}
