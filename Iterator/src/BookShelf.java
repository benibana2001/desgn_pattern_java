public class BookShelf implements Aggregate {
    private Book[] books;

    // A Length Of books
    private int last = 0;

    // Constructor
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    // Get(=PickUp) A Book Instance.
    public Book getBookAt(int index) {
        return books[index];
    }

    // Add A Book.
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


}
