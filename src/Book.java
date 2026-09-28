public class Book {

    private String title;
    private String author;
    private boolean available;
    
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return available;
    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("This book is already borrowed.");
        }
    }
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
}