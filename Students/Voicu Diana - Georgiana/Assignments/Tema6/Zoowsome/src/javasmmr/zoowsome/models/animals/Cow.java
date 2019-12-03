package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal {
	public Cow (Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		 super(nrOfLegs, name, maintenanceCost,dangerPerc, normalBodyTemp ,percBodyHair);
	}
	
	public Cow () {
		super(4,"Janine",3.5,0.1,38.33f,90.5f);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cow);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
