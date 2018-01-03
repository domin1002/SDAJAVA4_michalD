public class DoublyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node next;
        Node previous;

        public Node(T data) {
            this.data = data;
        }
    }


    public Node first = null;
    public Node last = null;

    //insert value at back
    public void push(T item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            first.previous = newNode;
            newNode.next = first;
            newNode.previous = null;
            first = newNode;
        }
    }

    //remove value at back
    public T pop() {
        Node temp = first;

        if (!isEmpty()) {
            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.previous = null;
            }
        }
        return (T) temp.data;
    }

    //remove value at front
    public T shift() {
        Node temp = last;

        if (!isEmpty()) {
            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.previous;
                last.next = null;
            }
        }
        return (T) temp.data;
    }

    //insert value at front
    public void unshift(T item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            newNode.next = null;
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }
}

