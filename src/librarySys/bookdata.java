package librarySys;
import java.util.*;
public class bookdata {
    private String bookdatalib;
    private List<String> book;

    public bookdata(String bookdatalib) {
        this.bookdatalib = bookdatalib;
        this.book = new ArrayList<>();
    }

    public void addbook(String bookadd) {
        book.add(bookadd);
    }

    public List<String> getBook() {
        return Collections.unmodifiableList(book);
    }

    public void showbook() {
        System.out.println("===LIST BOOK===");
        for (var list : getBook()) {
            System.out.println(list);
        }
    }
}
