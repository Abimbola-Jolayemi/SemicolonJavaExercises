package dataStructures;

public class ArrayList {
    private String[] list;
    private int size;
    private int initialCapacity = 2;

    public ArrayList() {
        list = new String[initialCapacity];
    }
    public void add(String firstElement) {
        if(isFull()) {
            resize();
        }
        list[size] = firstElement;
        size++;
    }

    public int getSize() {
        return size;
    }

    private boolean isFull(){
        return size == initialCapacity;
    }

    private void resize(){
        if(isFull()){
            initialCapacity *= 2;
            String[] newList = new String[initialCapacity];
            for(int index = 0; index < size; index++){
                newList[index] = list[index];
            }
            list = newList;
        }
    }

    public String remove(int indexOfObject) {
        if (indexOfObject < 0 || indexOfObject >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        String removedItem = list[indexOfObject];
        for (int index = indexOfObject; index < size - 1; index++) {
            list[index] = list[index + 1];
        }
        list[size - 1] = null;
        size--;
        return removedItem;
    }


    public int remove(String element) {
        if (size == 0) {
            return -1;
        }
        int indexOfObject = getIndexOf(element);
        if (indexOfObject == -1) {
            return -1;
        }
        for (int index = indexOfObject; index < size - 1; index++) {
            list[index] = list[index + 1];
        }
        list[size - 1] = null;
        size--;
        return indexOfObject;
    }

    public int getIndexOf(String element) {
        int counter = 0;
        if (size == 0){
            return -1;
        }
        for(String item: list) {
            if(item.equals(element)){
                return counter;
            }
            counter++;
        }
        return counter;
    }

    public String getElementOf(int index) {
        return list[index];
    }

    public void removeAll(){
        if(size == 0){
            return;
        }
        for (int index = 0; index < size - 1; index++) {
            list[index] = null;
        }
        size = 0;
    }

    public void insert(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == list.length) {
            resize();
        }
        for (int count = size; count > index; count--) {
            list[count] = list[count - 1];
        }
        list[index] = element;
        size++;
    }

    public void replace(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        list[index] = element;
    }


    public boolean contains(String element) {
        for(String item: list){
            if(item.equals(element)){
                return true;
            }
        }
        return false;
    }
}
