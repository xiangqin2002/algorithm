package stack;

import java.util.Random;

import queue.ArrayQueue;
import queue.LoopQueue;
import queue.Queue;

public class Main {

	private static double testStack(Stack<Integer> q, int opCount){
		long startTime = System.nanoTime();
		Random random = new Random();
		for(int i = 0; i < opCount; i++)
			q.push(random.nextInt(Integer.MAX_VALUE));
		for(int i = 0; i < opCount; i++)
			q.pop();
		long endTime = System.nanoTime();
		return (endTime - startTime) / 1000000000.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opCount = 10000000;
		ArrayStack<Integer> arrayQueue = new ArrayStack<>();
		double time1 = testStack(arrayQueue, opCount);
		System.out.println("ArrayStack, time: " + time1 + " s");
		LinkedListStack<Integer> loopQueue = new LinkedListStack<>();
		double time2 = testStack(loopQueue, opCount);
		System.out.println("LinkedListStack, time: " + time2 + " s");	
	}

}
