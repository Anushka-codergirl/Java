// Java program to demonstrate
// working of FIFO
// using Queue interface in Java

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i = 0; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue-" + q);

		// To remove the head of queue.
		// In this the oldest element '0' will be removed
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue-" + head);

		// Rest all methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size of queue-" + size);
	}
}
