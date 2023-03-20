package part1.iterator;

import java.util.ArrayList;
import java.util.List;

public class BasicProduceIterator implements Iterator{
  private List<Product> products = new ArrayList<>();
  private int position = -1;

  public void add(Product product) {
    products.add(product);
  }
  
  public void getMore() {
	  while(hasMore())
		 System.out.println(products.get(position));
  		}
  
  public boolean hasMore() {
	  try {
		  if(products.get(position + 1) != null) {
			  position++;
			  return true;
		  }
	  }catch (IndexOutOfBoundsException e) {
		  return false;
  		}
	  return true;
  }
}
