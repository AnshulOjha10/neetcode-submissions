class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sc = new Stack<>();

        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                int no = Integer.parseInt(s);
                sc.push(no);
            } else {
                if (sc.isEmpty()) {
                    return 0;
                }

                if (s.equals("+") && sc.size() >= 2) {
                    int first = sc.pop();
                    int sum = first + sc.pop();
                    sc.push(sum);
                }

                if (s.equals("*") && sc.size() >= 2) {
                    int first = sc.pop();
                    int product = first * sc.pop();
                    sc.push(product);
                }

                if (s.equals("-") && sc.size() >= 2) {
                    int first = sc.pop();
                    int sub = first - sc.pop();
                    sc.push(sub);
                }

                if (s.equals("/") && sc.size() >= 2) {
                    int first = sc.pop();
                    int second = sc.pop();
                         int division = second / first;
                    // if(){
                    // }
                    sc.push(division);
                }
            }

        }

        return sc.pop();
    }
}
