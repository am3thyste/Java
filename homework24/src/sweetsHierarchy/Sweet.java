package sweetsHierarchy;

public abstract class Sweet {
	String name;
	double weight;
	double sugarWeight;

	// getters & setters:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSugarWeight() {
		return sugarWeight;
	}

	public void setSugarWeight(double sugarWeight) {
		this.sugarWeight = sugarWeight;
	}

	// toString
	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
	}

}
