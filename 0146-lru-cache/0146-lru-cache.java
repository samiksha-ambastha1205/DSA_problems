class LRUCache {
    class Node
    {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value)
    {
        this.key=key;
        this.value=value;

    }
}
int capacity;
Node head;
Node tail;
HashMap<Integer,Node> map;
    public LRUCache(int capacity) 
    {
         this.capacity = capacity;
         map = new HashMap<>();
         head = new Node(0,0);
         tail = new Node(0,0);
    
         head.next=tail;
         tail.prev=head;

        
    }
    public void remove(Node node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;

    }
    public void insert(Node node)
    {
      //we have to insert before tail
      Node prevNode = tail.prev;
      prevNode.next = node;
      node.prev=prevNode;

      node.next=tail;
      tail.prev=node;

    }
    
    public int get(int key) 
    {
      if(map.containsKey(key))
      {
        Node node = map.get(key);
          remove(node);
          insert(node);
          map.put(key,node);
          return node.value;       
      }      
      return -1;
    }
    public void put(int key, int value) 
    {
      //case1 : does contain the key
      if(map.containsKey(key))
      {
       
        Node node = map.get(key);
        node.value=value;
        remove(node);
        insert(node);
        return;

       
      } 
      //case 2 : doesnt contain but there is space 
      if(!map.containsKey(key))
      {
        if(map.size()==capacity)
        {
            Node node = head.next;
            remove(node);
            map.remove(node.key);
            Node newNode = new Node(key,value);
            insert(newNode);
            map.put(key,newNode);
        }
        else if(map.size()!=capacity)
        {
            Node newNode = new Node(key,value);
            insert(newNode);
            map.put(key,newNode);
        }

      }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */