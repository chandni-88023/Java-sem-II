/*  Save StackException.java */
public class StackException extends Exception {
	final private String message;
	public StackException(String message) {
		this.message = message;
	}@Override
	public String getMessage() {
		return this.message;
	}
}

/*  Save Stack.java  */
public class Stack {
	private int tos;
	private int[] array;
	final private int size;
	public Stack(int size) {
		this.tos = -1;
		this.size = size;
		this.array = new int[this.size];
	}
	public void push(int e) throws StackException {
		if (tos == size - 1) throw new StackException("Stack Overflow: could not push " + e);
		else this.array[++this.tos] = e;
	}
	public int pop() throws StackException {
		if (this.tos < 0) {
			throw new StackException("Stack Underflow: could not pop");
		} else return this.array[this.tos--];
	}
	public int getTOS() {
		return this.tos;
	}
	@Override
	public String toString() {
		return "Stack<size=" + this.size + ">";
	}
}


/*  Save Main.java  */
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		int r;
		Stack stack = new Stack(10);
		Random random = new Random(1337);
		System.out.println("Created stack of size 10...");
		System.out.println("Pushing integers onto stack...");
		while (true) {
			r = random.nextInt(100);
			System.out.println("Pushing " + r + "...");
			try {
				stack.push(r);
				System.out.println("Elements in Stack = " + (stack.getTOS() + 1));
			} catch(StackException e) {
				System.err.println(e.getMessage());
				break;
			}
		}
		System.out.println("Popping integers from stack...");
		while (true) {
			System.out.println("Elements in Stack = " + (stack.getTOS() + 1));
			try {
				System.out.println("Popped " + stack.pop() + "...");
			} catch(StackException e) {
				System.err.println(e.getMessage());
				break;
			}
		}
	}
}