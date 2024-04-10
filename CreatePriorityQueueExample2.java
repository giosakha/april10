package april10;
import java.util.PriorityQueue;
import java.util.*;
public class CreatePriorityQueueExample2 {
//call comparator
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a priority queue
		Comparator<String> lengthComp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
				
			}
		}	;
		
		PriorityQueue<String> string = new PriorityQueue<>();
		//add items
		string.add("Lisa");
		string.add("Robert");
		string.add("John");
		string.add("Chris");
		string.add("Angelina");
		string.add("Joe");
		//remove items (ENQUEUE(
		while (!string.isEmpty()) {
			System.out.println(string.remove());
		}
		
	}

}
