package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	public Tiger(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		 super(nrOfLegs, name,maintenanceCost,dangerPerc, normalBodyTemp ,percBodyHair);
	}
	
	public Tiger() {
		super(4,"Azul",7.3,0.8,37.5f,98.8f);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
