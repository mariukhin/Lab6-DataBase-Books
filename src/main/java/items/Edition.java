package items;

public class Edition {

    public int id;
    public int bookId;
    public int costId;
    public String name;
    public int numOfCopies;

    public Edition() { }
    public Edition(int id, int bookId, int costId, String name, int numOfCopies) {
        this.id = id;
        this.name = name;
        this.numOfCopies = numOfCopies;
        this.bookId = bookId;
        this.costId = costId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getCostId() {
        return costId;
    }
    public void setCostId(int costId) {
        this.costId = costId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfCopies() {
        return numOfCopies;
    }
    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }
    public boolean equals(Edition note) {
        boolean bool;
        if(note.getId() == this.getId() && note.getBookId() == this.getBookId() && note.getCostId() == this.getCostId()
                && note.getName().equals(this.getName())&& note.getNumOfCopies() == this.getNumOfCopies()) {
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return String.format("|Id: %d|BookId: %d|EditionName: %s|NumOfCopies: %d|CostId: %d", id, bookId, name, numOfCopies, costId);
    }
}
