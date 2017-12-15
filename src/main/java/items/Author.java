package items;

public class Author {

    public int id;
    public String name;
    public int numofBooks;
    public int series;

    public Author() { }
    public Author(int id, String name, int numofBooks, int series) {
        this.id = id;
        this.name = name;
        this.numofBooks = numofBooks;
        this.series = series;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String authorname) {
        this.name = authorname;
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
        if(author.getId() == this.getId() && author.getName().equals(this.getName()) && author.getNumofBooks() == (this.getNumofBooks())
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
        return String.format("|Id: %d|Name: %s|NumberOfBooks: %d|Series: %d", id, name, numofBooks,series);
    }
}
