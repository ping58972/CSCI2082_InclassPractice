package InClass10092018;

public class StackLinkL<T> {
	private Node<T> head;
	private int count;
	
	public StackLinkL() {
		count=0;
	}
	
	public void push(T data) {
		if(data == null) {
			throw new NullPointerException();
		}
		head = new Node<>(data, head);
		count++;
	}
}
