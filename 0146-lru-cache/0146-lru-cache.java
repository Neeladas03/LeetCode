class Node{
    int key,val;
    Node prev,next;
    Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}

class LRUCache {

    private int capacity;
    private Map<Integer,Node>cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.cache=new HashMap<>();
        this.head=new Node(0,0);
        this.tail=new Node(0,0);
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            remove(node);
        }

        Node newnode=new Node(key,value);
        cache.put(key,newnode);
        insert(newnode);

        if(cache.size()>capacity){
            Node lru=head.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }

    public void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }

    public void insert(Node node){
        Node prev=tail.prev;
        Node next=tail;
        prev.next=next.prev=node;
        node.prev=prev;
        node.next=next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */