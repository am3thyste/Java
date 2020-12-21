package sweetsHierarchy;

import java.util.Arrays;

public class Present {
	private static final int DEFAULT_CAPACITY = 10;
	private int lastIndexAdded;
	private Sweet[] presentSweets;

	{
		presentSweets = new Sweet[DEFAULT_CAPACITY];
	}
	
	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		if (sweet == null) {
			return;
		}
		if (presentSweets.length<=lastIndexAdded) {
			presentSweets = Arrays.copyOf(presentSweets, presentSweets.length *2);				
		}
		presentSweets[lastIndexAdded++] = sweet;			
		}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {
		double totalWeight = 0.00;
		for (Sweet sweet : presentSweets) {
			if(sweet != null) {
				totalWeight = totalWeight + sweet.getWeight();
			}
		}
		return totalWeight;
	}
	
//	 the method filters sweets by sugar weight inclusively 
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		Sweet[] filteredSweetsArr;
		int counter =0;
		for (Sweet sweet : presentSweets) {
			if(sweet != null &&
					(sweet.getSugarWeight()>=minSugarWeight && 
					sweet.getSugarWeight() <=maxSugarWeight)) {
			counter++;
		}
	}
		filteredSweetsArr = new Sweet[counter];
		int index =0;
		for (Sweet sweet : presentSweets) {
			if (sweet != null &&
					(sweet.getSugarWeight()>=minSugarWeight && 
					sweet.getSugarWeight() <=maxSugarWeight)) {
				filteredSweetsArr[index++] = sweet;
			}
		}
		return filteredSweetsArr;
	}
	
	
	// the method returns copy of the Sweet[] array so that nobody could 
	// modify state of the present without addSweet() method. 
	// Also array shouldn’t contain null values.
	public Sweet[] getSweets() {
		int counter =0;
		for (Sweet sweet : presentSweets) {
			if (sweet != null) {
				counter ++;
			}
		}
		
		int index =0;
		Sweet [] nonNullSweets = new Sweet[counter];
		for (Sweet sweet : presentSweets) {	
			if (sweet != null) {
				nonNullSweets[index++] = sweet;
			}
		}
		return nonNullSweets; 
	}
	}
