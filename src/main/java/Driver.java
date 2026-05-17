public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Hitung Hasil:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Hitung Hasil:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Hitung Hasil:" + counter.getCount());
		
	}

}
