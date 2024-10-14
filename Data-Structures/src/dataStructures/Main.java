package dataStructures;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        list.display();

        list.remove(1);
        list.display();
    }
}

