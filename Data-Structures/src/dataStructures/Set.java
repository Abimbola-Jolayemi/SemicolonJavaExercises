package dataStructures;

public class Set<T>{
    private int size;
    private T[] list;
    private int capacity;

    public Set(int capacity){
        this.capacity = capacity;
        this.size = 0;
        list = (T[]) new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public void add(T element){
        if(!contains(element) && !isFull()){
            list[size] = element;
            size++;
        }
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private boolean isFull(){
        return this.size == this.capacity;
    }


    public boolean contains(T element) {
        if(size == 0){
            return false;
        }
        for(int item = 0; item < size; item++){
            if(list[item].equals(element)){
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for(int index = 0; index < size; index++){
            list[index] = null;
        }
        size = 0;

    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        for(int index = 0; index < size; index++){
            array[index] = list[index];
        }
        return array;
    }
}
