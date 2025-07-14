import java.util.*;

public class BookShelf {

	public static void main(String[] args) {
		Shelf sh = new Shelf();
		
		System.out.println(sh.addBook("Comedy", "xyz"));
		System.out.println(sh.addBook("Comedy", "abc"));
		System.out.println(sh.removeBook("Comedy", "xyz"));
		System.out.println(sh.removeBook("Comedy", "xyz"));
	}

}


class book{
	String author;
	book next;
	
	public book(String author) {
		this.author = author;
	}
}

class Shelf{
	HashMap<String,book> map;
	HashMap<String,HashSet<String>> check;
	
	public Shelf() {
		map = new HashMap<>();
		check = new HashMap<>();
	}
	
	public String addBook(String genre,String author) {
		if(!map.containsKey(genre)) {
			map.put(genre, new book(author));
			check.put(genre, new HashSet<>());
			check.get(genre).add(author);
			return "Book Added";
		}
		else {
			if(check.get(genre).contains(author)) return "Book already Exists";
			check.get(genre).add(author);
			
			book curr = map.get(genre);
			
			book newb = new book(author);
			newb.next = curr;
			
			map.put(genre,newb);
			
			return "Book Added";
		}
	}
	
	public String removeBook(String genre,String Author) {
		if(!map.containsKey(genre)) return "No book is added in this genre";
		else if(!check.get(genre).contains(Author)) return "No book added of this author";
		else {
			check.get(genre).remove(Author);
			
			book curr = map.get(genre);
			if(curr.author.equals(Author)) {
				if(curr.next==null) map.remove(genre);
				else map.put(genre, curr.next);
			}
			else {
				book prev = null;
				book temp = curr;
				
				while(temp!=null) {
					if(temp.author.equals(Author)) {
						prev.next = temp.next;
						temp.next = null;
					}
					
					prev = temp;
					temp = temp.next;
				}
			}
			
			return "Book removed";
		}
	}
}
