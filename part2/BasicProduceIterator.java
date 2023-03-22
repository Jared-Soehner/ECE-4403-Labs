package part2.iterator;

import java.util.ArrayList;
import java.util.List;

public class BasicProduceIterator implements Iterator{
  private List<Product> products = new ArrayList<>();
  private int position = -1;
  private int count = 0;

  public void add(Product product) {
    products.add(product);
    count++;
  }
  
  public int getMore() {
	  if(hasMore())
		return (products.get(position).getId());
  	return -1;
  }
  
  public void resetPostion() {
	  position = -1;
  }
  public boolean hasMore() {
	  try {
		  if(products.get(position + 1) != null) {
			  position++;
		  }
	  }catch (IndexOutOfBoundsException e) {
		  return false;
  		}
	  return true;
  }
  public int getCount() {
	  return count;
  }
}
