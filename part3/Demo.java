package part3.facade;

public class Demo {
	public static void main(String[] args) {
		show();
	}
  public static void show() {
	  facade facade = new facade();
	  facade.getRecentTweets("anAppKey", "anAppSecret");
  }
}
