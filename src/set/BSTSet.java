package set;

public class BSTSet<E extends Comparable<E>> implements Set<E>  {
	private BST<E> bst;
	
	public BSTSet(){
		bst = new BST<>();
	}

	@Override
	public void add(E e) {
		// TODO Auto-generated method stub
		bst.add(e);
	}

	@Override
	public void remove(E e) {
		// TODO Auto-generated method stub
		bst.remove(e);
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return bst.contains(e);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return bst.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return bst.isEmpty();
	}
	
	
}
