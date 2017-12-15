package items;

public class Book {

    public int id;
    public int authorId;
    public String name;
    public int dateR;

    public Book() {}
    public Book(int id, int authorId, String name, int dateR) {
        this.id = id;
        this.authorId = authorId;
        this.name = name;
        this.dateR = dateR;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDateR() {
        return dateR;
    }
    public void setDateR(int dateR) {
        this.dateR = dateR;
    }

    public boolean equals(Book book) {
        boolean bool;
        if(book.getId() == this.getId() && book.getAuthorId() == this.getAuthorId()  && book.getName().equals(this.getName())
                && book.getDateR() == this.getDateR()) {
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return String.format("|Id: %d|Name: %s|AuthorId: %d|DateR: %d|", id, name, authorId, dateR);
    }
}
