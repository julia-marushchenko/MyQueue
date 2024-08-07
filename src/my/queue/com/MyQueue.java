package my.queue.com;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	
	public static void main(String [] str) {
		
		// Collection with priorities
		Queue<String> myQueue = new PriorityQueue<>();
		
		// Adding elements to myQueue
		myQueue.add("Peach");
		myQueue.add("Apple");
		myQueue.add("Pineapple");
		myQueue.add("Strawberries");
		myQueue.add("Grapes");
		
		// Printing myQueue to console
		System.out.println(myQueue.toString()); // [Apple, Grapes, Pineapple, Strawberries, Peach]
		
		// Method peek
		System.out.println(myQueue.peek()); // returns first element
		
		// Method poll
		System.out.println(myQueue.poll()); // returns first element and removes it
		
		// Printing myQueue to console
		System.out.println(myQueue.toString()); // [Grapes, Pineapple, Strawberries, Peach]
		
		// Adding element Apple back
		myQueue.add("Apple");
		
		// Printing myQueue to console
		System.out.println(myQueue.toString()); // [Apple, Grapes, Pineapple, Strawberries, Peach]
		
		// Printing size of myQueue to console
		System.out.println(myQueue.size()); // 5
		
		// Removing an element Pineapple
		System.out.println(myQueue.remove("Pineapple")); 
		
		// Printing myQueue to console
		System.out.println(myQueue.toString()); // [Apple, Grapes, Pineapple, Strawberries, Peach]
	}

}
