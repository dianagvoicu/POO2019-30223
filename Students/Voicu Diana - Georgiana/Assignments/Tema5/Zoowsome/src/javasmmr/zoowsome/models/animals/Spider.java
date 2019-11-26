package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {
	public Spider(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,canFly,isDangerous);
	}
	public Spider() {
		super(8,"Vicentiu",2.3,0.7,false,true);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}


}
