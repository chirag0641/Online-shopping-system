 package database;
public class BookDetails implements Comparable {
    private String bookId = null;
    private String title = null;
    private String firstName = null;
    private String surname = null;
    private float price = 0.0F;
    private int year = 0;
    private String description = null;
    
    public BookDetails(String bookId, String surname, String firstName, 
                       String title, float price, int year,
                       String description) {
        this.bookId = bookId;
        this.title = title;
        this.firstName =  firstName;
        this.surname = surname;
        this.price = price;
        this.year = year;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    
    public float getPrice() {
       return price;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getBookId() {
        return bookId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
    public int compareTo(Object o) {
			BookDetails n = (BookDetails)o;
			int lastCmp = title.compareTo(n.title);
				return (lastCmp);
    }		
}

