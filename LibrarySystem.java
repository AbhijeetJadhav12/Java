import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return id + " - " + title + " by " + author + (isAvailable ? " (Available)" : " (Not Available)");
    }
}

class User {
    private int id;
    private String name;
    private Book[] borrowedBooks;
    private int borrowedCount;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new Book[3]; 
        this.borrowedCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (borrowedCount >= 3) {
            System.out.println("Borrowing limit reached for " + name + "!");
            return;
        }
        if (book.isAvailable()) {
            borrowedBooks[borrowedCount++] = book;
            book.setAvailable(false);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is not available.");
        }
    }

    public void returnBook(int bookId) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i].getId() == bookId) {
                borrowedBooks[i].setAvailable(true);
                System.out.println(name + " returned the book: " + borrowedBooks[i].getTitle());
                borrowedBooks[i] = borrowedBooks[--borrowedCount]; 
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " is not borrowed by " + name + ".");
    }
}

public class LibrarySystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input number of books
        System.out.println("Enter Number of Books:");
        int noBook = sc.nextInt();
        Book[] books = new Book[noBook];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter book ID:");
            int bId = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.println("Enter book title:");
            String bTitle = sc.nextLine();
            System.out.println("Enter book author:");
            String author = sc.nextLine();

            books[i] = new Book(bId, bTitle, author);
        }

        // Input number of users
        System.out.println("Enter Number of Users:");
        int nUser = sc.nextInt();
        User[] users = new User[nUser];
        for (int i = 0; i < users.length; i++) {
            System.out.println("Enter user ID:");
            int uId = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.println("Enter user name:");
            String uName = sc.nextLine();

            users[i] = new User(uId, uName);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Books in Library:");
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;

                case 2:
                    System.out.println("Enter user ID:");
                    int userId = sc.nextInt();
                    User userToBorrow = findUserById(users, userId);

                    if (userToBorrow != null) {
                        System.out.println("Enter book ID to borrow:");
                        int bookId = sc.nextInt();
                        Book bookToBorrow = findBookById(books, bookId);

                        if (bookToBorrow != null) {
                            userToBorrow.borrowBook(bookToBorrow);
                        } else {
                            System.out.println("Book with ID " + bookId + " not found.");
                        }
                    } else {
                        System.out.println("User with ID " + userId + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter user ID:");
                    int userIdReturn = sc.nextInt();
                    User userToReturn = findUserById(users, userIdReturn);

                    if (userToReturn != null) {
                        System.out.println("Enter book ID to return:");
                        int bookIdReturn = sc.nextInt();
                        userToReturn.returnBook(bookIdReturn);
                    } else {
                        System.out.println("User with ID " + userIdReturn + " not found.");
                    }
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
        sc.close();
    }

    private static User findUserById(User[] users, int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    private static Book findBookById(Book[] books, int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
