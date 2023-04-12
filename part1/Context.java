package lab10;

public class Context {
	String message;
	Strategy strat;
	public Context(String aMessage) {
		this.message = aMessage;
	}
	
	public void doAlgorthim(String anAlgorithm) {
		if(anAlgorithm == "DES") {
			strat = new desAlgorithim();
			strat.alogrithmInterface(message);
		}		
		if(anAlgorithm == "AES") {
			strat = new aesAlgorithm();
			strat.alogrithmInterface(message);
		}
	}
}
