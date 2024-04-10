package april10;
import java.util.*;
class Book {
	int id; 
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	
	}
	
	
}
public class linkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Book> hs = new LinkedHashSet<Book>();
Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar" , "BPB" , 8);
Book b2 = new Book(102, "Data Communications & Networking", "Forouzan" , "Mc Graw Hill" , 4);
Book b3 = new Book(103, "Operating System", "Galvin" , "BPB" , 6);
//Adding books to hash table
hs.add(b1);
hs.add(b2);
hs.add(b3);
//traversing hash table
for (Book b:hs) {
System.out.println(b.id+ " "  +b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
}
String[] values = new String[10];
hs.toArray(values);
}

}
