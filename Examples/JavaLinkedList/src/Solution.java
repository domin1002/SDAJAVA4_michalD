
public class Solution {

	public static void main(String[] args) {
		Node four = new Node(8);
		Node three = new Node(5, four);
		Node two = new Node(4, three);
		Node one = new Node(2, two);

		print(one);
		insertLast(one, 17);
		print(one);
		//Node zero = insertFirst(one, 1);
		//print(zero);
		//delete(zero, 1);
		//print(zero);
	}

	static void print(Node head) {
		//System.out.println(head.data); // wczytuje pierwszy
		//System.out.println(head.next.data); // wczytuje drugi

		if(head==null) return;
		Node node = head;
		while(node.next != null){ // dopóki nie trafimy na koniec
			System.out.println(node.data); // samo to wyswietlało by cały czas one. Pętla nieskończona
			node = node.next; // przejście do kolejnego elementu
		}
		System.out.println(node.data);
	}

	static Node insertLast(Node head, int data) {
		
		//usu� linijk� poni�ej i dodaj w�asn� implementacj�
		Node node = head;
		while(node.next != null){
			node = node.next;
		}
		node.next = new Node(data);
		return head; // zwracamy węzeł główny
	}
	
	static Node insertFirst(Node head,int x) {
		//usu� linijk� poni�ej i dodaj w�asn� implementacj�
		return new Node();
	}
	
	static Node delete(Node head, int position) {
		//usu� linijk� poni�ej i dodaj w�asn� implementacj�
		return new Node();
	}

}
