package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Mammal extends Animal {
	float normalBodyTemp;
	float percBodyHair;
	
	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float newNormalBodyTemp) {
		this.normalBodyTemp= newNormalBodyTemp;
	}
	
	public float getPercBodyHair() {
		return this.percBodyHair;
	}
	
	public void setPercBodyHair(float newPercBodyHair) {
		this.percBodyHair = newPercBodyHair;
	}
	
	public Mammal (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs,name, maintenanceCost, dangerPerc);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
		
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
