package items;

public class ScreenAdaptation {

    public int id;
    public String screenadaptationname;
    public int year;
    public int mark;
    public int bookId;

    public ScreenAdaptation() {}
    public ScreenAdaptation(int id, String screenadaptationname, int year, int mark,int bookId) {
        this.id = id;
        this.screenadaptationname = screenadaptationname;
        this.year = year;
        this.mark = mark;
        this.bookId = bookId;
    }

    public int getScreenAdaptationId() {
        return id;
    }
    public void setScreenAdaptationId(int id) {
        this.id = id;
    }
    public String getScreenadaptationname() {
        return screenadaptationname;
    }
    public void setScreenadaptationname(String screenadaptationname) {
        this.screenadaptationname = screenadaptationname;
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
        if(screenAdaptation.getScreenAdaptationId() == this.getScreenAdaptationId() && screenAdaptation.getScreenadaptationname().equals(this.getScreenadaptationname())
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
        return String.format("|Id: %d|Name: %s|Year: %d|Mark: %d|BookId: %d|", id, screenadaptationname, year, mark, bookId);
    }
}
