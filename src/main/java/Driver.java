public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter(5);

        System.out.println("Count: " + counter.getCount());

        counter.increaseBy(10);

        System.out.println("Count: " + counter.getCount());

        counter.decreaseBy(6);

        System.out.println("Count: " + counter.getCount());

    }
}