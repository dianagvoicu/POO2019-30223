package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Flamingo extends Bird {
	public Flamingo (Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,maintenanceCost, dangerPerc,migrates,avaFlightAltitude);
	}
	
	public Flamingo() {
		super(2,"Cosco",2.5,0.3,true,3000);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Flamingo);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
