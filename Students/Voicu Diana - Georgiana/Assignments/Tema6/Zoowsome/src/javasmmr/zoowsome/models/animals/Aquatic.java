package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

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
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "livingWater", String.valueOf(getWaterType()));
		
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(waterType.valueOf(element.getElementsByTagName("livingWater").item(0).getTextContent()));
	}
	
}
