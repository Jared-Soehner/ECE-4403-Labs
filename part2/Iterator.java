package part2.iterator;

public interface Iterator {
	public void add(Product product);
	public int getMore();
	public boolean hasMore();
	public int getCount();
	public void resetPostion();
}
