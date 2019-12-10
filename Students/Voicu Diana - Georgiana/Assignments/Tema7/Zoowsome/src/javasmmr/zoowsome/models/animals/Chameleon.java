package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Chameleon extends Reptile {
	public Chameleon (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost,dangerPerc, laysEggs);
	}
	
	public Chameleon() {
		super(4,"Transcendental",(double) 1,0.15,true);
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Chameleon);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
