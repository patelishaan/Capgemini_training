package dependencyinjection;
import java.util.List;
public class Library1 {
    private int id;
    private String name;
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Library1"+
                "id="+id+
                ", name="+name+'\''+
                "books = "+books;
    }
}
