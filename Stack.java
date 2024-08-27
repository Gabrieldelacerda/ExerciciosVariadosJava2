package continuacaoExercicios;

import java.util.LinkedList;

class Stack <T>{
	private LinkedList<T> stack;
	
	public Stack() {
		stack = new LinkedList<>();
	}
	
	public void push (T value) {
		stack.addFirst(value);
	}
	
	public T pop() {
		if (stack.isEmpty()) {
			throw new RuntimeException("Stack está vazio");
		}
		return stack.removeFirst();
	}
	
	public T peek() {
		if (stack.isEmpty()) {
			throw new RuntimeException("Stack está vazio");
		}
		return stack.getFirst();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}

}

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Elemento do topo: " + stack.peek());
		System.out.println("Tamanho do stack" + stack.size());
		System.out.println("Elemento removido do topo: " + stack.pop());
		System.out.println("Elemento removido do topo: " + stack.pop());
		System.out.println("Tamanho do stack agora: " + stack.size());
	}
}
