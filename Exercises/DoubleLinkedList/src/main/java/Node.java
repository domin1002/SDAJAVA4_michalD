public class Node<T> {
    T data;
    Node previous;
    Node next;

    public Node(T data) {
        this.data = data;
    }

    public void display(){
        System.out.print(data+" ");
    }
    @Override
    public String toString() {
        return data.toString();
    }
}