class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        if(strs.size() == 0){
            return "";
        }

        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }

        String encoded_string = sb.toString();

        return encoded_string;

    }

    public List<String> decode(String encoded_string) {

        List<String> ans = new ArrayList<>();
        

        int i = 0;

        while(i < encoded_string.length() ){

            
            //finding #
            int j = i;
            while(encoded_string.charAt(j) != '#'){
                j++;
            }

            //finding length

            int n = Integer.parseInt(encoded_string.substring(i, j));

            String word = encoded_string.substring(j+1, j+1+n);

            ans.add(word);

            i = j + 1 + n;

        }


        return ans;
        




    }








}
