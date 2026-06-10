public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a : nums){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            System.out.println(list);
            Collections.sort(list , (a, b) -> b.getValue() - a.getValue());
             System.out.println(list);

             int[] ans = new int[k];

                for(int i = 0; i < k; i++){
                    ans[i] = list.get(i).getKey();
                }

                System.out.println(Arrays.toString(ans));

                return ans;
    }
}