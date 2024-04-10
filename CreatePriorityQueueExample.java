package april10;
import java.util.*;
public class CreatePriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		//add items to the queue
		numbers.add(700);
		numbers.add(500);
		numbers.add(900);
		numbers.add(100);
		//remove items from the priority queue
		while (!numbers.isEmpty()) {
			System.out.println(numbers.remove());
		}
		
	}

}
