package hm4;

public class book {
	protected String bookName;
	protected String author;
	protected int pages;
	
	public book(String bookName, String author, int pages){
		setBookName(bookName);
		setAuthor(author);
		setPages(pages);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
}
