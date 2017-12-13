package items;

public class Author {

    public int id;
    public String authorname;
    public int numofBooks;
    public int series;

    public Author() { }
    public Author(int id, String authorname, int numofBooks, int series) {
        this.id = id;
        this.authorname = authorname;
        this.numofBooks = numofBooks;
        this.series = series;
    }

    public int getAuthorId() {
        return id;
    }
    public void setAuthorId(int id) {
        this.id = id;
    }
    public String getAuthorName() {
        return authorname;
    }
    public void setAuthorName(String authorname) {
        this.authorname = authorname;
    }
    public int getNumofBooks() {
        return numofBooks;
    }
    public void setNumofBooks(int numofBooks) {
        this.numofBooks = numofBooks;
    }

    public int getSeries() {
        return series;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public boolean equals(Author author) {
        boolean bool;
        if(author.getAuthorId() == this.getAuthorId() && author.getAuthorName().equals(this.getAuthorName()) && author.getNumofBooks() == (this.getNumofBooks())
                && author.getSeries() == (this.getSeries())) {
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return String.format("|Id: %d|Name: %s|NumberOfBooks: %d|Series: %d", id, authorname, numofBooks,series);
    }
}
