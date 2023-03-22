package part2.iterator;

import java.util.Arrays;
import java.util.Collections;

public class basicConcreateCollection implements iterableCollection{
	
	public Iterator createBasicIterator() {
		return new BasicProduceIterator();
	}

	public void getMaxFromIterator(Iterator aIterator) {
		aIterator.resetPostion();
		int[] intArray = new int[aIterator.getCount()];
		int index = 0;
		while(true) {
			int num = aIterator.getMore();
			if(num == -1)
				break;
			intArray[index++] = num;
		}
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	public void getMinFromIterator(Iterator aIterator) {
		aIterator.resetPostion();
		Integer[] intArray = new Integer[aIterator.getCount()];
		int index = 0;
		while(true) {
			Integer num = aIterator.getMore();
			if(num == -1)
				break;
			intArray[index++] = num;
		}
		Arrays.sort(intArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(intArray));
	}
}
