public class Organism {
	private static final int DNA_SIZE = 4;
	
	private String name; // player name or AI name
	private boolean isPlayer; // player or AI
	private boolean isAlive; // alive or dead status
	private Chromosome[] dna; // the Chromosomes contained (offensive, defensive, mobility, resistance)
	
	// constructors
	
	public Organism(){
		setName("_AI");
		setAI();
		setAlive();
		dna = new Chromosome[DNA_SIZE];
	}
	
	public Organism(String _name){
		setName(_name);
		setPlayer();
		setAlive();
		dna = new Chromosome[DNA_SIZE];
	}
	
	// accessors
	
	public String getName(){
		return name;
	}
	
	public boolean isPlayer(){
		return isPlayer;
	}
	
	public boolean isAlive(){
		return isAlive;
	}
	
	public int getDnaSize(){
		return DNA_SIZE;
	}
	
	public Chromosome getChromosome(int chromosomeId){
		return dna[chromosomeId];
	}
	
	// mutators
	
	public void setName(String _name){
		name = _name;
	}
	
	public void setAlive(){
		isAlive = true;
	}
	
	public void setDead(){
		isAlive = false;
	}
	
	public void setPlayer(){
		isPlayer = true;
	}
	
	public void setAI(){
		isPlayer = false;
	}
	
	public void setChromosome(int chromosomeId, Chromosome _chromosome){
		dna[chromosomeId] = _chromosome;
	}
}
