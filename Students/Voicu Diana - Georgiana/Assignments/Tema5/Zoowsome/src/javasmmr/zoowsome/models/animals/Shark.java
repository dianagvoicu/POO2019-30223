package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {
	public Shark(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,avgSwimDepth,livingWater);
	}
	
	public Shark() {
		super(0,"Speedy",(double) 8,1,1200,waterType.saltWater);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
