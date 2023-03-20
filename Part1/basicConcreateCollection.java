package part1.iterator;

public class basicConcreateCollection implements iterableCollection{
	
	public Iterator createBasicIterator() {
		return new BasicProduceIterator();
	}

}
