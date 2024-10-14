package dataStructures;

public class Node <T>{
        private T element;
        private Node<T> nextNode;

        public Node(T element) {
            this.element = element;
            this.nextNode = null;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T data) {
            this.element = data;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNext(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
}
