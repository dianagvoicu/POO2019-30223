package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	Integer avgSwimDepth;
	enum waterType {saltWater, freshWater};
	waterType livingWater;
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public void setAvgSwimDepth(Integer newAvgSwimDepth ) {
		this.avgSwimDepth = newAvgSwimDepth;
	}
	
	public waterType getWaterType() {
		return this.livingWater;
	}
	
	public void setWaterType(waterType newLivingWater) {
		this.livingWater = newLivingWater;
	}
	
	public Aquatic(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs, name,maintenanceCost,dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.livingWater = livingWater;
	}
	
}
