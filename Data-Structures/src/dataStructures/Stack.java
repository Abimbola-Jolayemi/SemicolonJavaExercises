package dataStructures;

public class Stack {
    private int capacity;
    private int size;
    private boolean isEmpty= true;
    private String[] stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new String[capacity];
    }

    public boolean isEmpty() {
        if(size == 0)
            return true;
        else return false;
    }

    public void push(String item) {
        if(size < capacity) {
            stack[size] = item;
            size++;
            isEmpty= false;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int getSize() {
        return size;
    }

    public String pop() {
        if (isEmpty == true) {
            return null;
        } else{
            String item = stack[size - 1];
            size--;
            return item;
        }
    }

    public String peek() {
        if (isEmpty == true) {
            return null;
        } else{
            return stack[size - 1];
        }
    }

    public boolean isFull() {
        if(size == capacity){
            return true;
        } else {
            return false;
        }
    }
}