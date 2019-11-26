package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Bird extends Animal {
	boolean migrates;
	Integer avaFlightAltitude;
	
	public boolean ifMigrates() {
		return this.migrates;
	}
	
	public void setIfMigrates(boolean newMigrates) {
		this.migrates= newMigrates;
	}
	
	public Integer getAvaFlightAltitude() {
		return this.avaFlightAltitude;
	}
	
	public void setavaFlightAltitude(Integer newAvaFlightAltitude) {
		this.avaFlightAltitude= newAvaFlightAltitude;
	}
	
	public Bird(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost,dangerPerc);
		this.migrates= migrates;
		this.avaFlightAltitude = avaFlightAltitude;
	}
	
	@Override
	public void encodeToXml (XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(ifMigrates()));
		createNode(eventWriter, "avaFlightAltitude", String.valueOf(getAvaFlightAltitude()));
		
	}

	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setIfMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setavaFlightAltitude(Integer.valueOf(element.getElementsByTagName("avaFlightAltitude").item(0).getTextContent()));
	}
}
