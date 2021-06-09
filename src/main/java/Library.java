import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name){
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCollectionSize() {
        return this.collection.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);
    }
}
