class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] result = new int[n];
        Stack <Integer> y = new Stack<>();
        
        for(int i = 0; i < n; i++){

            while(!y.isEmpty() && temperatures[i] > temperatures[y.peek()]){
                int old = y.pop();
               result[old] = i - old;
            }

            y.push(i);
        }

        return result;
    }
}
