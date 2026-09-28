import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	  Scanner scanner = new Scanner(System.in);

    	  Library library = new Library();
    	  
    	  User user1 = new User("Manar", 1);
    	  library.addUser(user1);
    	  

          Book book1 = new Book("Harry Potter", "J.K. Rowling");
          Book book2 = new Book("1984", "George Orwell");

          
        while (true) {

            System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Show books");
            System.out.println("2. Search book");
            System.out.println("3. Borrow book");
            System.out.println("4. Return book");
            System.out.println("5. Show my borrowed books");
            System.out.println("6. Add book");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {

            case 1:
            	library.showBooks();
            	break;

            case 2:
            	System.out.print("Enter book title: ");
            	scanner.nextLine();
            	String title = scanner.nextLine();

            	library.searchBook(title);
            	break;
        
            case 3:
            	System.out.print("Enter book title: ");
            	scanner.nextLine();
            	String borrowTitle = scanner.nextLine();

            	library.borrowBook(borrowTitle, user1);
            	break;
            
            case 4:
            	System.out.print("Enter book title: ");
            	scanner.nextLine();
            	String returnTitle = scanner.nextLine();

            	library.returnBook(returnTitle, user1);
            	break;  
            	
            case 5:
                user1.showBorrowedBooks();
                break;
               
            case 6:
                scanner.nextLine();

                System.out.print("Enter book title: ");
                String newTitle = scanner.nextLine();

                System.out.print("Enter author: ");
                String newAuthor = scanner.nextLine();

                Book newBook = new Book(newTitle, newAuthor);
                library.addBook(newBook);

                System.out.println("Book added successfully.");
                break;
                

            case 7:
                System.out.println("Goodbye!");
                scanner.close();
                return;	
            
            default:
            	System.out.println("Invalid option.");
            
            }
        }
    }
        
    
}