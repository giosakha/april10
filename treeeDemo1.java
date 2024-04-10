package april10;
import java.util.*;

public class treeeDemo1 {
public static void main(String[] args) {
	//creating a set interface with reference to TreeSet
	Set<String> ts1= new TreeSet<>();
	//elements are added using add() method
	ts1.add("C");
	ts1.add("B");
	ts1.add("A");
	//duplicates will not get insert 
	ts1.add("C");
	//Elements get stored in default natural
	//SortingOrder(Ascending)
	System.out.println(ts1);
}
}
