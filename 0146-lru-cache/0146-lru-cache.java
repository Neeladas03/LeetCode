class Node {
    int key;
    int value;
    Node next, prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
    int cap;
    Map<Integer, Node> cache;
    Node head, tail;

    public LRUCache(int capacity) {
        cap = capacity;
        cache = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newnode = new Node(key, value);
        insert(newnode);
        cache.put(key, newnode);
        if (cache.size() > cap) {
            Node lru = head.next;
            remove(lru);
            cache.remove(lru.key);
        }

    }

    public void insert(Node node) {
        Node next = tail;
        Node prev = tail.prev;
        prev.next = node;
        next.prev = node;
        node.prev = prev;
        node.next = next;
    }

    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */