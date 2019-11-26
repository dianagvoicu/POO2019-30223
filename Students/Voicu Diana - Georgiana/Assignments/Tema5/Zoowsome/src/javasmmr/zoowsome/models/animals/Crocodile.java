package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile {
	public Crocodile (Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost,dangerPerc, laysEggs);
	}
	
	public Crocodile() {
		super(4,"Croc",3.9,1,true);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Crocodile);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
