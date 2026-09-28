import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<User> users;
    
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addUser(User user) {
        users.add(user);
    }
    
    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle()
                        + " - " + book.getAuthor());
                return;
            }
        }

        System.out.println("Book not found.");
    }
    
    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                if (book.isAvailable()) {
                    book.borrowBook();
                    user.borrowBook(book);
                    System.out.println(user.getName() + " borrowed " + book.getTitle());
                } else {
                    System.out.println("This book is already borrowed.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }
    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                user.returnBook(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }
    
}