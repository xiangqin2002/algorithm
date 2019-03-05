package stack;

public class ArrayStack<E> implements Stack<E> {
	Array<E> array;
	
	public ArrayStack(int capacity){
		array = new Array<>(capacity);
	}
	
	public ArrayStack(){
		array = new Array<>();
	}

	@Override
	public int getSize() {
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return array.isEmpty();
	}
	
	public int getCapacity(){
		return array.getCapacity();
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return array.removeLast();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return array.getLast();
	}
	
	@Override
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append("Stack: ");
		res.append('[');
		for(int i = 0; i < array.getSize(); i++){
			res.append(array.get(i));
			if(i != array.getSize() - 1)
				res.append(", ");
		}
		res.append("] top");
		return res.toString();
	}
}
