package Problem1;

public class Link1 {
	int val;
	Link1 next;
	Link1(int val) {
		this.val = val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link1 node1 = new Link1(10);
		Link1 node2 = new Link1(20);
		node1.next = node2;
		Link1 node3 = new Link1(30);
		node2.next = node3;
		
		traverse(node1);
	}
	
	public static void traverse(Link1 head) {
		Link1 node = head;
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

}
