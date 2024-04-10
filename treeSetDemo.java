package april10;
import java.util.*;
public class treeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
linkedset.add("Maruti");
linkedset.add("BMW");
linkedset.add("Honda");
linkedset.add("Audi");
linkedset.add("Maruti");
linkedset.add("WalksWagon");
System.out.println("Size of LinkedHashSet=" + linkedset.size());
System.out.println("Original LinkedHashSet=" + linkedset);
System.out.println("Removing Audi from LinkedHashSet:" + linkedset.remove("Audi"));
System.out.println("Trying to remove Z which is not present: " + linkedset.remove("Z"));
System.out.println("Checking if Maruti is present=" + linkedset.contains("Maruti"));
System.out.println("Updated LinkedHashSet: " + linkedset);

	}

}
