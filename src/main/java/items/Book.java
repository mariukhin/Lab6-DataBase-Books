package items;

public class Book {

    public int id;
    public int authorId;
    public int editionId;
    public int screenadaptId;
    public String bookName;
    public int dateR;

    public Book() {}
    public Book(int id, int authorId, int editionId, int screenadaptId, String bookName, int dateR) {
        this.id = id;
        this.authorId = authorId;
        this.editionId = editionId;
        this.screenadaptId = screenadaptId;
        this.bookName = bookName;
        this.dateR = dateR;
    }

    public int getBookId() {
        return id;
    }
    public void setBookId(int id) {
        this.id = id;
    }
    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    public int getEditionId() {
        return editionId;
    }
    public void setEditionId(int editionId) {
        this.editionId = editionId;
    }
    public int getScreenAdaptationId() {
        return screenadaptId;
    }
    public void setScreenAdaptationId(int screenadaptId) {
        this.screenadaptId = screenadaptId;
    }
    public String getName() {
        return bookName;
    }
    public void setName(String bookName) {
        this.bookName = bookName;
    }
    public int getDateR() {
        return dateR;
    }
    public void setDateR(int dateR) {
        this.dateR = dateR;
    }

    public boolean equals(Book book) {
        boolean bool;
        if(book.getBookId() == this.getBookId() && book.getAuthorId() == this.getAuthorId() && book.getEditionId() == this.getEditionId()
                && book.getScreenAdaptationId() == this.getScreenAdaptationId() && book.getName().equals(this.getName())
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
        return String.format("|Id: %d|Name: %s|AuthorId: %d|DateR: %d|", id, bookName, authorId, dateR);
    }
}
