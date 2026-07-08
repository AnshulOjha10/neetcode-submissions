/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;

        // creating new nodes btw existing nodes

        while (current != null) {
            Node temp = current.next;
            current.next = new Node(current.val);
            current.next.next = temp;
            current = temp;
        }

        current = head;

        // setting up random pointers

        while (current != null) {
            current.next.random = (current.random != null) ? current.random.next : null;

            current = current.next.next;
        }

        // now separating both list
        Node orgList = head;
        Node copyList = (head != null) ? head.next : null;
        Node temp = copyList;

        while (orgList != null) {
            orgList.next = orgList.next.next;

            if (copyList.next == null) {
                break;
            }else{

            copyList.next = copyList.next.next;
            }

            orgList = orgList.next;
            copyList = copyList.next;
        }

        return temp;
    }
}
