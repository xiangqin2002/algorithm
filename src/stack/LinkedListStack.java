package stack;

public class LinkedListStack<E> implements Stack<E> {
	private LinkedList<E> list;
	
	public LinkedListStack(){
		list = new LinkedList<>();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		list.addFirst(e);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return list.removeFirst();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Stack: top ");
		res.append(list);
		return res.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack<Integer> stack = new LinkedListStack<>();
		for(int i = 0; i < 5; i++){
			stack.push(i);
			System.out.println(stack);
		}
		stack.pop();
		System.out.println(stack);
	}
}
