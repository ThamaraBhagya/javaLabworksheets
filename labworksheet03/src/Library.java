import java.util.ArrayList;
import java.util.List;
class Library {
    private List<BorrowableItems> borrowableItemsList = new
            ArrayList<>();
    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }
    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equals(title) &&
                        book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Checked out: " +
                            title);
                    return;
                }
            }
        }
        System.out.println("Book not found: " + title);
    }
    public void listAvailableItems() {
        System.out.println("Available items :");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }
    public void displayLibraryInfo() {
        System.out.println("Total number of items : " + borrowableItemsList.size());
    }
}