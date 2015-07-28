import java.util.*;

public class Chromosome {
	private int capacity; // denotes the number of genes that can be contained
	private Gene[] gene; // the array of genes contained within this chromosome
	
	// constructors
	
	public Chromosome(int _capacity){
		setCapacity(_capacity);
	}
	
	public Chromosome(Gene[] _gene){
		capacity = _gene.length;
		gene = _gene;
	}
	
	public Chromosome(int _capacity, Gene[] _gene){
		capacity = _capacity;
		gene = _gene;
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
	
	// functionalities
	
	public void mutate(float mutationRate){
		for (int i=0; i<capacity; i++){
			Random rand = new Random();
			if (rand.nextFloat() <= mutationRate){
				gene[i] = new Gene(); // assign a new random gene
			}
		}
	}
	
	public void crossOver(Chromosome pair){
		for (int i=0; i<capacity; i++){
			Random rand = new Random();
			if (rand.nextFloat() < 0.5f){ // 50% chance to assign the pair's gene
				gene[i] = pair.getGene(i);
			}
		}
	}
}
