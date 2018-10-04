package Inclass10032018;

import java.util.Arrays;

public class Bag<T> {
	private Object[] data;
	private int count;
	
	public Bag(int size) {
		this.data = new Object[size];
		this.count = 0;
	}
	
	public <T> void add(T element) {
//		if(count == data.length){
//			//ensureCappacity();
//			
//		}
		data[count] = element;
		count+=1;
	}
	
	public <T>  boolean search(T target) {
		boolean isF = false;
		for(int i=0; i<count; i++) {
			if(target != null && target.equals(data[i])) {
				isF = true;
				break;
			}
		}
		return isF;
	}
	private void ensureCappacity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		String info = "count: " + count + "\n";
		for(int i=0; i<count; i++) {
			info += " "+data[i].toString();
		}
		return info;
	}
	
	
}
