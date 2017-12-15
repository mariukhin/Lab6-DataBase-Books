package items;

public class ScreenAdaptation {

    public int id;
    public String name;
    public int year;
    public int mark;
    public int bookId;

    public ScreenAdaptation() {}
    public ScreenAdaptation(int id, String name, int year, int mark, int bookId) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.mark = mark;
        this.bookId = bookId;
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
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public boolean equals(ScreenAdaptation screenAdaptation) {
        boolean bool;
        if(screenAdaptation.getId() == this.getId() && screenAdaptation.getName().equals(this.getName())
                && screenAdaptation.getYear() == this.getYear() && screenAdaptation.getMark() == this.getMark()&& screenAdaptation.getBookId() == this.getBookId()) {
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return String.format("|Id: %d|Name: %s|Year: %d|Mark: %d|BookId: %d|", id, name, year, mark, bookId);
    }
}
