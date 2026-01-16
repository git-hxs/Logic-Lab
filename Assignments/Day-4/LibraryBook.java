package capgtraining;

public class LibraryBook {
	
	private String title,author;
	private boolean issued;
	public static int totalBooks;
	
	public LibraryBook(String title, String author) {
		this.title=title;
		this.author=author;
		totalBooks++;
	}
	
	public void issue() {
		if(!isIssued())
			this.issued=true;
		else
			System.out.println("Already issued");
	}
	
	public void returnBook() {
		if(isIssued())
			this.issued=false;
		else
			System.out.println("This was never issued");
	}
	
	public boolean isIssued() {
		if(this.issued==true)
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryBook b = new LibraryBook("1984", "Orwell");
		b.issue();      // true path
		b.issue();      // should reject (already issued)
		b.returnBook(); // true path
		System.out.println(LibraryBook.totalBooks);
	}

}
