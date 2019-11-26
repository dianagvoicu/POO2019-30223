package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;


public abstract class Animal implements Killer,XML_Parsable {
	protected Integer nrOfLegs;
	protected String name;
	Double maintenanceCost;
	double dangerPerc;
	Boolean takenCareOf= false;
	
	public Integer getNrOfLegs(){
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(int nrLegs){
		this.nrOfLegs= nrLegs; 
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getIfTakenCareOf() {
		return this.takenCareOf;
	}
	public void setIfTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public Double getMaintenanceCost(){
		return this.maintenanceCost;
	}
	
	public void setMaintenanceCost(Double maintenanceCost){
		this.maintenanceCost= maintenanceCost; 
	}
	public double getDancerPerc() {
		return this.dangerPerc;
	}
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}
	
	public Animal(Integer nrOfLegs,String name,Double maintenanceCost,double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	@Override
	public boolean kill() {
		Random r = new Random();
		double randomValue = 0 + (1 - 0) * r.nextDouble();
		if(randomValue < this.dangerPerc) {
			return true;
		}
		return false;
		
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(String.valueOf(element.getElementsByTagName("name").item(0).getTextContent()));
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setIfTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
}
