package Exercise6;

class Book {

    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(bookId + " "
                + title + " "
                + author);
    }
}
public class LibraryManagement {

    static Book linearSearch(Book books[],
                             String key) {

        for(Book b : books) {

            if(b.title.equalsIgnoreCase(key)) {
                return b;
            }
        }

        return null;
    }
    static Book binarySearch(Book books[],
                             String key) {

        int low = 0;
        int high = books.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int compare =
                    books[mid].title
                            .compareToIgnoreCase(key);

            if(compare == 0) {
                return books[mid];
            }

            else if(compare < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }
    public static void main(String[] args) {

        Book books[] = {

                new Book(101,
                        "Algorithms",
                        "Thomas Cormen"),

                new Book(102,
                        "Clean Code",
                        "Robert Martin"),

                new Book(103,
                        "Data Structures",
                        "Mark Allen"),

                new Book(104,
                        "Java Programming",
                        "Herbert Schildt"),

                new Book(105,
                        "Python Basics",
                        "John Smith")

        };


        System.out.println("Linear Search");

        Book b1 = linearSearch(
                books,
                "Clean Code");

        if(b1 != null)
            b1.display();
        else
            System.out.println("Book Not Found");



        System.out.println("\nBinary Search");

        Book b2 = binarySearch(
                books,
                "Clean Code");

        if(b2 != null)
            b2.display();
        else
            System.out.println("Book Not Found");

        Book b3 = binarySearch(
                books,
                "Harry");


        if(b3 != null)
            b3.display();
        else
            System.out.println("Book Not Found");


    }
}
