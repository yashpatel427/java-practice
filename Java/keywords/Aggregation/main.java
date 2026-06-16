



public class main{
    public static void main(String[] args) {
        
        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure, but the contained objects can exist 
        //               independently.

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);

        Book[] books = {book1, book2};

        Library library = new Library("Vapi public library", 2010, books);
        
       library.displayInfo();
    }
}