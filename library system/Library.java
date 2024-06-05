import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " added to the library users.");
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        System.out.println("User not found.");
        return null;
    }

    public void borrowBook(String userName, String bookTitle) {
        User user = findUserByName(userName);
        Book book = findBookByTitle(bookTitle);
        if (user != null && book != null) {
            user.borrowBook(book);
        }
    }

    public void returnBook(String userName, String bookTitle) {
        User user = findUserByName(userName);
        Book book = findBookByTitle(bookTitle);
        if (user != null && book != null) {
            user.returnBook(book);
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Mya Kyonn Nyo", "Tun Naing"));
        library.addBook(new Book("Slient", "Sayar Saw"));
        library.addBook(new Book("Ma Ma", " Aung Chaint"));

    

        // Add users
        library.addUser(new User("Tun Myat "));
        library.addUser(new User("Salai"));
        library.addUser(new User("Myat Thu"));

        // Borrow and return books
        library.borrowBook("Tun Myat", "May Kyonn Nyo");
        library.returnBook("Salai", "Slient");
        library.returnBook("Myat Thu", "Ma Ma");
        

        // Display books and users
        library.displayBooks();
        library.displayUsers();
    }
}

