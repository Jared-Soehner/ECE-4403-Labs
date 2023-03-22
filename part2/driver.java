package part2.iterator;

public class driver {
	
	public static void main(String[] args) {
		basicConcreateCollection collection = new basicConcreateCollection();
		Iterator iterator = collection.createBasicIterator();
		Product pd1 = new Product(5123);
		Product pd2 = new Product(321);
		Product pd3 = new Product(1213);
		iterator.add(pd1);
		iterator.add(pd2);
		iterator.add(pd3);
		collection.getMaxFromIterator(iterator);
		collection.getMinFromIterator(iterator);
	}

}
