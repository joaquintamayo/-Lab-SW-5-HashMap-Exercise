import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {

    private HashMap<String, Author> authorMap;
    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }

    public AuthorDA() {
        authorMap = new HashMap<>();
        
        try {
        
            Scanner scanner = new Scanner(new File("Author.csv"));
        
            while (scanner.hasNextLine()) {
                String[] authorSplitData = scanner.nextLine().split(",");
                Author author = new Author();
                author.setName(authorSplitData[0].trim());
                author.setBio(authorSplitData[1].trim());
                authorMap.put(author.getName(), author);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}