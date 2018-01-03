public class App {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        for (int i = 0; i <= 10; i++) {
            list.unshift(i);
        }

        list.showList();
        list.pop();
        list.shift();
        list.showList();
        list.push(99);
        list.unshift(1987);
        list.showList();
        System.out.println("List has "+list.size()+" elements");
    }
}
