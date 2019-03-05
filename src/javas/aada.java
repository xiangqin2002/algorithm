package javas;

public class aada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array<Integer> arr = new Array<>();
		for(int i = 0; i < 10; i++)
			arr.addLast(i);
		System.out.println(arr);
		arr.add(1, 100);
		System.out.println(arr);
		arr.removeLast();
		System.out.println(arr);
		arr.removeLast();
		System.out.println(arr);
		arr.removeLast();
		System.out.println(arr);
	}

}
