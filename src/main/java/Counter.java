public class Counter {

    private int count;

    // Constructor
    public Counter(int count) {
        this.count = count;
    }

    // Getter
    public int getCount() {
        return count;
    }

    // Menambah nilai
    public void increaseBy(int value) {
        count += value;
    }

    // Mengurangi nilai
    public void decreaseBy(int value) {
        count -= value;
    }
}