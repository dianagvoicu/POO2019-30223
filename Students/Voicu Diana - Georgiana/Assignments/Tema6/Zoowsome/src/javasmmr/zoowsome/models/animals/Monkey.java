package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {
	public Monkey(Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		 super(nrOfLegs, name, maintenanceCost,dangerPerc, normalBodyTemp ,percBodyHair);
	}
	public Monkey() {
		super(2,"Rami",7.5,0.5,37.5f,95.55f);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
