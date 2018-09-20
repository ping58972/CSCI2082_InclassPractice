package InClas09182018s;

public class Node {
	private int data;
	private Node link;
	
	public Node(int data) {
		this.data = data;
		this.link = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
}
