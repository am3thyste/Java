package sweetsHierarchy;

public abstract class Cookie extends Sweet{
	
	double doughWeight;

	public double getDoughWeight() {
		return doughWeight;
	}

	public void setDoughWeight(double doughWeight) {
		this.doughWeight = doughWeight;
	}

	@Override
	public String toString() {
		return "Cookie [doughWeight=" + doughWeight + ", name=" + name + ", weight=" + weight + ", sugarWeight="
				+ sugarWeight + "]";
	}

	
	
}
