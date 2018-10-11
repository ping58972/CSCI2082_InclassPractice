package InClass10092018;

public class Node<T> {
	private Node<T> link;
	private T data;
	
	public Node (T data, Node<T> link){
		this.data = data;
		this.link = link;
		
	}

	public Node<T> getLink() {
		return link;
	}

	public void setLink(Node<T> link) {
		this.link = link;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
