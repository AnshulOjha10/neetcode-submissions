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
                    int sum = first + sc.peek();
                    sc.push(sum);
                }

                if (s.equals("*") && sc.size() >= 2) {
                    int first = sc.pop();
                    int product = first * sc.peek();
                    sc.push(product);
                }

                if (s.equals("-") && sc.size() >= 2) {
                    int first = sc.pop();
                    int sub = first - sc.peek();
                    sc.push(sub);
                }

                if (s.equals("/") && sc.size() >= 2) {
                    int first = sc.pop();
                    int division = 0;
                    if(!sc.isEmpty()){
                         division = first / sc.peek();
                    }
                    sc.push(division);
                }
            }

        }

        return sc.pop();
    }
}
