package stackInterface;

import java.util.Arrays;

interface stack  {
	void push(int value);
	void pop();
}

class FixedStack implements stack {
	private int[] stackArray;
	private int top;

	FixedStack(int size) {
		stackArray = new int[size];
		top = -1;

	}
	@Override
	public void push(int value) {

		if((stackArray.length-1) == top) {
			System.out.println("Stack Overflow");
		}
		else {
			stackArray[++top] = value;
			System.out.println("Element pushed");
			for(int i = 0; i <= top; i++){
				System.out.println("in Stack " + stackArray[i]);
			}
		}
	}

	@Override
	public void pop() {
		if(top < 0) {
			System.out.println("None to pop");
		}
		else {
			stackArray[top--] = 0;
			System.out.println("Element poped");
			for(int i = 0; i <= top; i++){
				System.out.println("in Stack " + stackArray[i]);
			}
		}
		
	}

}

class DynamicStack implements stack {
	private int[] stackArray;
	private int top;

	DynamicStack(int size) {
		stackArray = new int[size];
		top = -1;
	}

	@Override
	public void push(int value) {

		if((stackArray.length-1) == top) {
		System.out.println("Stack before " + stackArray.length);
		stackArray = Arrays.copyOf(stackArray, (2 * stackArray.length));
		System.out.println("Resized Stack" + stackArray.length);
		}
		stackArray[++top] = value;
		System.out.println("Element pushed");
		for(int i = 0; i <= top; i++){
			System.out.println("in Stack " + stackArray[i]);
		}

	}

	@Override
	public void pop() {
		if(top < 0) {
			System.out.println("None to pop");
		}
		else {
			top--;
			System.out.println("Element poped");
			for(int i = 0; i <= top; i++){
				System.out.println("in Stack " + stackArray[i]);
			}
		}
		
	}
}


public class StackInterface {

	public static void main(String[] args) {
		
		DynamicStack obj = new DynamicStack(3);
		FixedStack fobj = new FixedStack(2);

		System.out.println("\n\nFixed stack\n\n");


		fobj.push(1);
		fobj.push(2);
		fobj.push(3);
		fobj.pop();

		System.out.println("\n\nDynamic stack\n\n");
		
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.pop();

	}

}
