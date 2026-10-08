public class Date {
    int d;
    int m;
    int y;

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }


    public String toString() {
        return String.format("%d-%d-%d", this.d, this.m, this.y);
    }
}