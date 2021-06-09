import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name){
        this.name = name;
        this.collection = new ArrayList<>();
        this.capacity = 2;
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
        if (checkIfStockFull() == false) {
            this.collection.add(book);
        }
    }

    public boolean checkIfStockFull() {
        if (getCollectionSize() == getCapacity()) {
            return true;
        } else {
            return false;
        }
    }
}
