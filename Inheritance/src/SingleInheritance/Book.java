package singleinheritance;

/**
 * Represents a book with a title and author.
 * Provides a method to display these details.
 * 
 * @author C Sandeep Aithal
 */
class Book {
    String title;
    String author;

    /**
     * Displays the details of the book.
     */
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

/**
 * Represents an eBook, which is a subclass of Book.
 * Demonstrates single inheritance.
 * 
 * @author C Sandeep Aithal
 */
class EBook extends Book {
    public static void main(String[] args) {
        EBook ebook = new EBook();
        ebook.title = "Java";
        ebook.author = "XYZ";
        ebook.displayDetails();
    }
}
