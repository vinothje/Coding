package Problem1;

public class LinkAdd {
	int val;
	LinkAdd next;
	LinkAdd(int val) {
		this.val=val;
	}
	
	LinkAdd() {}
	
	LinkAdd first;
	LinkAdd last;
	void add(int num) {
		if(first == null) {
			LinkAdd li = new LinkAdd(num);
			first = li;
			first.next = null;
			last = first;
		} else {
			LinkAdd li = new LinkAdd(num);
			last.next = li;
			last = li;
		}
	}
	
	void printList() {
		while(first != null) {
			System.out.println(first.val);
			first = first.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkAdd link = new LinkAdd();
		
		link.add(10);
		link.add(20);
		link.add(30);
		link.add(40);
		
		link.printList();
	}

}
