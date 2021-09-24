package L3Task;

import java.util.*;

public class LRUCache {
    class Node{
        int key;
        int value;
        Node prev, next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    HashMap<Integer,Node> mapList;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.mapList = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(mapList.containsKey(key)) {
            Node n= mapList.get(key);
             remove(n);
             addNode(n);
             return n.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(mapList.containsKey(key)) remove(mapList.get(key));
        if(mapList.size() == capacity) remove(tail.prev);
        addNode(new Node(key,value));
    }

    public void addNode(Node node){
        mapList.put(node.key,node);
        Node temp = head.next;
        node.next = temp;
        temp.prev = node;
        head.next = node;
        node.prev = head;
    }
    public void remove (Node node){
        mapList.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}
