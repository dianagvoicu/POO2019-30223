package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;


public abstract class Insect extends Animal {
	boolean canFly;
	boolean isDangerous;
	
	public boolean ifCanFly() {
		return this.canFly;
	}
	
	public void setIfCanFly(boolean newCanFly) {
		this.canFly = newCanFly;
	}
	
	public boolean ifIsDangerous() {
		return this.isDangerous;
	}
	
	public void setIfIsDangerous(boolean newIsDangerous) {
		this.isDangerous= newIsDangerous;
	}
	
	public Insect (Integer nrOfLegs, String name,Double maintenanceCost, double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name, maintenanceCost,dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(ifCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(ifIsDangerous()));
		
	}
	
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setIfCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIfIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
