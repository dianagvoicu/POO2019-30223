package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect {
	public Cockroach(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,canFly,isDangerous);
	}
	public Cockroach() {
		super(6,"Joe",0.7,0.1,true,false);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
