public class Main {


    public static void main(String[] args) {
        String[] titles = {
                "日本のデザイン",
                "THE CULTURE MAP",
                "フェルマーの最終定理",
                "ART & FEAR"
        };

        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book(titles[0]));
        bookShelf.appendBook(new Book(titles[1]));
        bookShelf.appendBook(new Book(titles[2]));
        bookShelf.appendBook(new Book(titles[3]));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
