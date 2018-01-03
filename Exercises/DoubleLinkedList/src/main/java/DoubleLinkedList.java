public class DoubleLinkedList<T>{

    public Node first;
    public Node last;
    private int size = 0;

    //insert value at back
    public void  push(T item){
        Node newNode = new Node(item);

        if(isEmpty()){
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
        size++;
    }

    //insert value at front
    public void unshift(T item) {
        Node newNode = new Node(item);

        if(isEmpty()){
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
        size++;
    }

    //remove value at back
    public void pop(){
        Node temp = first;

        if(!isEmpty()){
            if(first.next == null){
                first = null;
                last = null;
            } else{
                first = first.next;
                first.previous = null;
            }
            System.out.println("Usunięto wartość: "+temp.data);
        } else {
            throw new NullPointerException("Lista jest pusta!");
        }
        size--;
    }

    //remove value at front
    public void shift(){
        Node temp = last;

        if(!isEmpty()){
            if(first.next == null){
                first = null;
                last = null;
            } else {
                last = last.previous;
                last.next = null;
            }
            System.out.println("Usunięto wartość: "+temp.data);
        } else {
            throw new NullPointerException("Lista jest pusta!");
        }
        size--;
    }

    public void showList() {
        Node current = first;
        while(current != null) {
            current.display();
            current = current.next;
        }
        System.out.print("\n");
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (first == null);
    }
}
