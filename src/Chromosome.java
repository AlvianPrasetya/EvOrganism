public class Chromosome {
	private int capacity; // denotes the number of genes that can be contained
	private Gene[] gene;
	
	public Chromosome(int _capacity){
		setCapacity(_capacity);
	}
	
	// accessors
	
	public int getCapacity(){
		return capacity;
	}
	
	public Gene getGene(int geneId){
		return gene[geneId];
	}
	
	// mutators
	
	public void setCapacity(int _capacity){
		capacity = _capacity;
	}
	
	public void setGene(int geneId, Gene _gene){
		gene[geneId] = _gene;
	}
}
