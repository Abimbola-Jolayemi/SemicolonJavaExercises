package dataStructures;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private Node<T>[] nodeArray;
    private int capacity;

    public LinkedList() {
        this.size = 0;
        this.capacity = 2;
        nodeArray = new Node[capacity]; // Store node references
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {
        if(this.size == this.capacity) {
            resetCapacity();
        }
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        nodeArray[size] = newNode;
        size++;
    }

    private void resetCapacity() {
        Node<T>[] newNodeArray = new Node[capacity * 2];
        for (int index = 0; index < nodeArray.length; index++) {
            newNodeArray[index] = nodeArray[index];
        }
        nodeArray = newNodeArray;
    }

    public void remove(int indexOfItem) {
        if (indexOfItem < 0 || indexOfItem >= size) {
            throw new IndexOutOfBoundsException("Index " + indexOfItem + " is out of bounds");
        }

        Node<T> nodeToRemove = nodeArray[indexOfItem];
        if (indexOfItem == 0) {
            head = head.getNextNode();
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> previousNode = nodeArray[indexOfItem - 1];
            previousNode.setNext(nodeToRemove.getNextNode());
            if (nodeToRemove == tail) {
                tail = previousNode;
            }
        }

        for (int index = indexOfItem; index < size - 1; index++) {
            nodeArray[index] = nodeArray[index + 1];
        }
        size--;
    }

    public boolean remove(T element) {
        if (head == null) {
            return false;

        }
        if (head.getElement().equals(element)) {
            head = head.getNextNode();
            size--;
            return true;
        }

        Node<T> currentNode = head;
        while (currentNode.getNextNode() != null) {
            if (currentNode.getNextNode().getElement().equals(element)) {
                currentNode.setNext(currentNode.getNextNode().getNextNode());
                size--;
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getElement() + " -> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("null");
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

}





