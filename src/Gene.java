public class Gene {
	private String type; // denotes the type of gene (e.g.: speed, size, etc.)
	private int amount; // denotes the value carried by this gene (1 ~ 3)
	private int dominance; // denotes whether this gene is dominant or not (1 or 0)
	
	public Gene(){
	}
	
	public Gene(String _type, int _amount, int _dominance){
		setType(_type);
		setAmount(_amount);
		setDominance(_dominance);
	}
	
	// accessors
	
	public String getType(){
		return type;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public int getDominance(){
		return dominance;
	}
	
	// mutators
	
	public void setType(String _type){
		type = _type;
	}
	
	public void setAmount(int _amount){
		amount = _amount;
	}
	
	public void setDominance(int _dominance){
		dominance = _dominance;
	}
}
