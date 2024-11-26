import library.books.FictionBook;
import library.utils.BookUtils;

public class question02 {
    public static void main(String args[]){
        FictionBook book = new FictionBook("12.12.12","Manjula Senarathne","Thriller");

        book.displayInfo();
        BookUtils.PrintBookDetails(book);
    }
}
