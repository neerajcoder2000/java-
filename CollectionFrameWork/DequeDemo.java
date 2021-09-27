package day4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
         // It doest not allows null value
	     // It allows duplicat value
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<Integer>(); 
		
		deque.add(20);
		deque.add(50);
		deque.add(30);
		deque.add(40);
		deque.add(10);
	//	deque.add(null);
		deque.add(50);
		
		for(Integer i:deque) {
			System.out.println(i);
		}
		
		System.out.println("----------------Offer-------------");
		deque.offer(80);
		for(Integer i:deque) {
			System.out.println(i);
		}
		
        System.out.println("------------peek-----------------");
		
		System.out.println(deque.peek()); // after sorting based on priority, peek first element 
		
		System.out.println("---------------peek last ---------------");
		
		System.out.println(deque.peekFirst());
		
         System.out.println("--------------poll-----------");
		
		deque.poll();// after sorting based on priority, remove first element
		
		for(Integer i:deque) {
			System.out.println(i);
		}
	}

}
