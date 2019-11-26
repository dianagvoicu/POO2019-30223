package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Parrot extends Bird {
	public Parrot (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,migrates,avaFlightAltitude);
	}
	
	public Parrot() {
		super(2,"Cosmo",5.7,0.2,false,1135);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Parrot);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
