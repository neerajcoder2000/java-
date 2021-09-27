package day4;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// returns value based on priority
		// It doestnot allows null ,it throws nullpointer exception
		// It allows duplicate value
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(20);
		pq.add(50);
		pq.add(30);
		pq.add(40);
		pq.add(10);
	//	pq.add(null);
		pq.add(50);
		
		for(Integer i:pq) {
			System.out.println(i);
		}
		
		System.out.println("----------------Offer-------------");
		pq.offer(80);
		for(Integer i:pq) {
			System.out.println(i);
		}
		
		System.out.println("------------peek-----------------");
		
		System.out.println(pq.peek()); // after sorting based on priority, peek first element 
		
		System.out.println("--------------poll-----------");
		
		pq.poll();// after sorting based on priority, remove first element
		
		for(Integer i:pq) {
			System.out.println(i);
		}
		
		
			
	}
		
		
		
}


