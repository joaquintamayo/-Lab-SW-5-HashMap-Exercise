import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BookDA {

    private HashMap<String, Book> bookMap;
    public HashMap<String, Book> getBookMap() {
        return bookMap;
    }

    public BookDA() {
        bookMap = new HashMap<>();
        
        try
        
        { Scanner scanner = new Scanner(new File("Book.csv"));
           
            while (scanner.hasNextLine()) {
                String[] splitData = scanner.nextLine().split(",");
                Book book = new Book();
                book.setIsbn(splitData[0].trim());
                book.setTitle(splitData[1].trim());
                book.setAuthorName(splitData[2].trim()); 
                bookMap.put(book.getIsbn(), book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}