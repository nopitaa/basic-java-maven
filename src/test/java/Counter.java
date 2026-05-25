public class Counter {

    private int count;

    // Constructor default
    public Counter() {
        count = 0;
    }

    // Constructor dengan parameter
    public Counter(int count) {
        this.count = count;
    }

    // Getter
    public int getCount() {
        return count;
    }

    // Increment +1
    public void increment() {
        count++;
    }

    // Decrement -1
    public void decrement() {
        count--;
    }

    // Reset ke 0
    public void reset() {
        count = 0;
    }

    // Tambahan increaseBy
    public void increaseBy(int value) {
        count += value;
    }

    // Tambahan decreaseBy
    public void decreaseBy(int value) {
        count -= value;
    }
}