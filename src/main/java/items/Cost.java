package items;

public class Cost {

    public int id;
    public int num;
    public int high;

    public Cost() { }
    public Cost(int id, int num, int high) {
        this.id = id;
        this.num = num;
        this.high = high;
    }

    public int getCostId() {
        return id;
    }
    public void setCostId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        this.high = high;
    }

    public boolean equals(Cost cost) {
        boolean bool;
        if(cost.getCostId() == this.getCostId()  && cost.getNum() == this.getNum() && cost.getHigh() == this.getHigh()) {
            bool = true;
        }
        else {
            bool = false;
        }
        return bool;
    }

    @Override
    public String toString() {
        return String.format("|Id: %d|Number: %d|High: %d|", id, num , high);
    }
}
