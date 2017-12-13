package items;

public class Edition {

    public int id;
    public int bookId;
    public int costId;
    public String editionname;
    public int numOfCopies;

    public Edition() { }
    public Edition(int id, int bookId, int costId,String editionname, int numOfCopies) {
        this.id = id;
        this.bookId = bookId;
        this.costId = costId;
        this.editionname = editionname;
        this.numOfCopies = numOfCopies;
    }

    public int getEditionId() {
        return id;
    }
    public void setEditionId(int id) {
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
    public String getEditionname() {
        return editionname;
    }
    public void setEditionname(String editionname) {
        this.editionname = editionname;
    }
    public int getNumOfCopies() {
        return numOfCopies;
    }
    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }
    public boolean equals(Edition note) {
        boolean bool;
        if(note.getEditionId() == this.getEditionId() && note.getBookId() == this.getBookId() && note.getCostId() == this.getCostId()
                && note.getEditionname().equals(this.getEditionname())&& note.getNumOfCopies() == this.getNumOfCopies()) {
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return String.format("|Id: %d|BookId: %d|EditionName: %s|NumOfCopies", id, bookId, editionname, numOfCopies);
    }
}
