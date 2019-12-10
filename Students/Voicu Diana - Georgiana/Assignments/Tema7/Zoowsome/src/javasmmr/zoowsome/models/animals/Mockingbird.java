package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Mockingbird extends Bird {
	public Mockingbird (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,maintenanceCost, dangerPerc,migrates,avaFlightAltitude);
	}
	
	public Mockingbird() {
		super(2,"Jewel",1.9,0.1,true,19);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Mockingbird);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
