package ibrarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
       
        Library library = new Library("City Library");

       
        LibraryBranch branch1 = new LibraryBranch("Downtown Branch");
        LibraryBranch branch2 = new LibraryBranch("Uptown Branch");

        
        library.addBranch(branch1);
        library.addBranch(branch2);

  
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

       
        branch1.addBook(book1);
        branch1.addBook(book2);
        branch2.addBook(book3);

       
        library.displayBranches();

       
        System.out.println("\nBooks in Downtown Branch:");
        branch1.displayBooks();
        System.out.println("\nBooks in Uptown Branch:");
        branch2.displayBooks();

       
        branch1.removeBook(book1);
        System.out.println("\nAfter removing a book from Downtown Branch:");
        branch1.displayBooks();
    }
}
