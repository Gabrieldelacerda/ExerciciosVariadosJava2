package continuacaoExercicios;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {
	private LinkedList<T> list = new LinkedList<>();
	
	public void enqueue(T element) {
		list.addLast(element);
	}
	
	public T dequeue() {
		if (list.isEmpty()) {
			throw new NoSuchElementException("Fila vazia.");
		}
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public T peek() {
		if (list.isEmpty()) {
			throw new NoSuchElementException("Fila vazia.");
		}
		return list.getFirst();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		
		System.out.println(queue.isEmpty());
		
		queue.dequeue();
		System.out.println(queue.isEmpty());
	}
}
