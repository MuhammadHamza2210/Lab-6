package ibrarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryBranch {
    private String branchName;
    private List<Book> books;

    public LibraryBranch(String branchName) {
        this.branchName = branchName;
        this.books = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }


    public void addBook(Book book) {
        books.add(book);
    }

   
    public void removeBook(Book book) {
        books.remove(book);
    }

   
    public void displayBooks() {
        System.out.println("Books in " + branchName + ":");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}
