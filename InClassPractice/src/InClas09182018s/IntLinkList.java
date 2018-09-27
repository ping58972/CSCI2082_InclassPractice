package InClas09182018s;

public class IntLinkList {
	private Node head;
	private Node tail;
	private int numberOfNodes;
	public IntLinkList() {
		this.head = null;
		this.numberOfNodes = 0;
		
	}
/*	public IntLinkList(Node head, int numberOfNodes) {
		super();
		this.head = head;
		this.numberOfNodes = numberOfNodes;
	}*/
	public void add(int element) {
		if(head == null) {
		head = new Node(element);
		numberOfNodes++;
		} else {
			Node tmp = new Node(element);
			tmp.setLink(head);
			head = tmp;
		}
		if(numberOfNodes ==1) {
			tail = head;
		}
	}
	public void remove(int target) {
		Node cursor;
		Node perc;
		for(cursor = head, perc=null; cursor != null; perc = cursor.getLink()) {
			if(target == cursor.getData()) {
				head = cursor.getLink();
				numberOfNodes--;
			}else {
				perc.setLink(cursor.getLink());
				numberOfNodes--;
			}
		}
	}
	
	@Override
	public String toString() {
		Node cursor;// = head;
		String info = "";
		for(cursor = head; cursor != null;cursor = cursor.getLink()) {
			info += cursor.getData() + "->";
		}
		return info;
	}
	public static void main(String... args) {
		IntLinkList mylist = new IntLinkList();
		mylist.add(20);
		mylist.add(39);
		mylist.add(450);
		mylist.add(79);
		mylist.add(23);
		mylist.add(899);
		mylist.add(1299);
		System.out.println(mylist.toString());
		
	}
	
}
