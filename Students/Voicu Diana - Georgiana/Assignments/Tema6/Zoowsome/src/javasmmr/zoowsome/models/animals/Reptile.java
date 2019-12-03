package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Reptile extends Animal {
	boolean laysEggs;
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(boolean newLaysEggs) {
		this.laysEggs= newLaysEggs;
	}
	
	public Reptile (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.laysEggs = laysEggs;
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
		
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
