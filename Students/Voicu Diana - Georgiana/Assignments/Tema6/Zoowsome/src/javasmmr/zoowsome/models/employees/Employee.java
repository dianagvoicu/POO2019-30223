package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Employee implements XML_Parsable {
	protected String name;
	protected Long id;
	protected BigDecimal salary;
	protected Boolean isDead = false;
	
	public Employee(String name,BigDecimal salary) {
		this.name = name;
		this.id = (long) Math.floor(Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
		this.salary = salary;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary=salary;
	}
	
	public Boolean getIfIsDead() {
		return this.isDead;
	}
	
	public void setIfIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter,"id" ,String.valueOf(this.id));
		createNode(eventWriter,"name" ,String.valueOf(this.name));
		createNode(eventWriter,"salary" ,String.valueOf(this.salary));
		createNode(eventWriter,"isDead" ,String.valueOf(this.isDead));
	}
	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(new BigDecimal(element.getElementsByTagName("salary").item(0).getTextContent()));
		setIfIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
