package Stack;

public class stack {

	private Object[] elements;
	private int top;
	
	stack (int kapasite){
		elements = new Object[kapasite];
		top = -1;		
	}
	
	Object getElements() { // ASK THE LECTURER
		return elements;
		
	}
	
	
	boolean isFull() {
		return top+1 == elements.length;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	public void push(Object data) {
		
		if(isFull()) {
		System.out.println("List is Full..");
		}else {
			top++;
			elements[top] = data;
		}
	}
	
	public Object pop() {
		
		if(isEmpty()) {
			return "List is Empty..";
			
			}else {	
				
				Object data = elements[top];				
				elements[top] = null;
				top--;
				return data;
			}
	}
	
	public Object peek() {
		if(isEmpty()) {
			return "List is Empty..";
		}else {
		return elements[top];
		}
	}
		
	public int size() {
		return top+1;
	}
}
