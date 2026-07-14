

class LRUCache {
    public class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node head;
    Node last;
    int capacity;

    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0, 0);
        last = new Node(0, 0);

        head.next = last;
        last.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            Node temp = map.get(key);
             removeFromLast(temp);
            insertAtFirst(temp);
            return temp.value;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            removeFromLast(node);
            insertAtFirst(node);

        } else {
            if (map.size() == capacity) {
                Node lru = head.next;

                removeFromLast(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);

            insertAtFirst(newNode);
            map.put(key, newNode);
        }
    }
private void insertAtFirst(Node node) {
    Node temp = last.prev;
    temp.next = node;

    node.next = last;
    node.prev = temp;

    last.prev = node;
}

private void removeFromLast(Node node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
}
}
