import java.util.ArrayList;

public class User {

    private String name;
    private int userId;
    private ArrayList<Book> borrowedBooks;
    
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    public void showBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");

        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
    
    
}