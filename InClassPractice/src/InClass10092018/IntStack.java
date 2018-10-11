package InClass10092018;

import java.util.Arrays;
import java.util.EmptyStackException;

public class IntStack {
	private int [] stack;
	private int count;
	
	public IntStack() {
		stack = new int[10];
		count = 0;
	}
	
	public void push(int element) {
		if(isFull()) {
			throw new StackOverflowError("Stack is Full!");
		}
		stack[count] = element;
		count++;
	}
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int element = stack[count-1];
		return element;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int element = stack[count-1];
		count--;
		return element;
	}
	public boolean isFull() {
		return count>= stack.length;
	}
	public boolean isEmpty() {
		return count ==0;
	}

	@Override
	public String toString() {
		String stackInfo = "";
		for(int i=count-1; i>=0; i--) {
			stackInfo +="| " + this.stack[i] + "\n";
		}
		return stackInfo;
	}
	
	public static void main(String[] args) {
		IntStack stack = new IntStack();
		stack.push(39);
		stack.push(20);
		stack.push(12);
		stack.push(7);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.peek();
		System.out.println(stack);
	}
	
}
