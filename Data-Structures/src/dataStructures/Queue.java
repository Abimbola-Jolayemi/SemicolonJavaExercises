package dataStructures;

public class Queue {
    private String[] queue;
    private int capacity;
    private int size;
    private boolean isEmpty = false;
    private int firstItem;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
    }
    public boolean isEmpty() {
        if(size == 0){
            return isEmpty = true;
        } else {
            return false;
        }
    }

    public void enqueue(String firstString) {
        if(isFull() == false){
            queue[size] = firstString;
            size++;
            isEmpty = false;
        }
    }

    public int getSize() {
        return size;
    }

    public String dequeue() {
       if(isEmpty == true){
           return null;
       } else{
           String removedItem = queue[firstItem];
           size--;
           firstItem++;
           isEmpty = false;
           return removedItem;
       }
    }

    public boolean isFull() {
        if(size == capacity){
            return true;
        }
        return false;
    }
}
