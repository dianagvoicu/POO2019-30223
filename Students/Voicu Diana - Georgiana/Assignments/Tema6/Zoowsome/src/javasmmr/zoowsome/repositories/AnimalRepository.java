package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Clownfish;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Flamingo;
import javasmmr.zoowsome.models.animals.Mockingbird;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME,Constants.XML_TAGS.ANIMAL);
	}

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXMLFile = new File(XML_FILENAME);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXMLFile);

		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Animals.Mammals.Cow:
					Animal newCow = new Cow();
					newCow.decodeFromXml(element);
					animals.add(newCow);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animal newMonkey = new Monkey();
					newMonkey.decodeFromXml(element);
					animals.add(newMonkey);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animal newTiger = new Tiger();
					newTiger.decodeFromXml(element);
					animals.add(newTiger);
					break;
				case Constants.Animals.Birds.Flamingo:
					Animal newFlamingo = new Flamingo();
					newFlamingo.decodeFromXml(element);
					animals.add(newFlamingo);
					break;
				case Constants.Animals.Birds.Mockingbird:
					Animal newMockingbird = new Mockingbird();
					newMockingbird.decodeFromXml(element);
					animals.add(newMockingbird);
					break;
				case Constants.Animals.Birds.Parrot:
					Animal newParrot = new Parrot();
					newParrot.decodeFromXml(element);
					animals.add(newParrot);
					break;
				case Constants.Animals.Insects.Butterfly:
					Animal newButterfly = new Butterfly();
					newButterfly.decodeFromXml(element);
					animals.add(newButterfly);
					break;
				case Constants.Animals.Insects.Spider:
					Animal newSpider = new Spider();
					newSpider.decodeFromXml(element);
					animals.add(newSpider);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal newCockroach = new Cockroach();
					newCockroach.decodeFromXml(element);
					animals.add(newCockroach);
					break;
				case Constants.Animals.Aquatics.Clownfish:
					Animal newClownfish = new Clownfish();
					newClownfish.decodeFromXml(element);
					animals.add(newClownfish);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal newShark = new Shark();
					newShark.decodeFromXml(element);
					animals.add(newShark);
					break;
				case Constants.Animals.Aquatics.Whale:
					Animal newWhale = new Whale();
					newWhale.decodeFromXml(element);
					animals.add(newWhale);
					break;
				case Constants.Animals.Reptiles.Chameleon:
					Animal newChameleon = new Chameleon();
					newChameleon.decodeFromXml(element);
					animals.add(newChameleon);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal newSnake = new Snake();
					newSnake.decodeFromXml(element);
					animals.add(newSnake);
					break;
				case Constants.Animals.Reptiles.Crocodile:
					Animal newCrocodile = new Crocodile();
					newCrocodile.decodeFromXml(element);
					animals.add(newCrocodile);
					break;
				default:
					break;
				}
			}
		}

		return animals;
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
			
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;
		
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
			
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
			
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;
			
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
			
		case Constants.Animals.Birds.Flamingo:
			Animal flamingo = new Flamingo();
			flamingo.decodeFromXml(element);
			return flamingo;
			
		case Constants.Animals.Birds.Mockingbird:
			Animal mockingbird = new Mockingbird();
			mockingbird.decodeFromXml(element);
			return mockingbird;
			
		case Constants.Animals.Birds.Parrot:
			Animal parrot = new Parrot();
			parrot.decodeFromXml(element);
			return parrot;
			
		case Constants.Animals.Reptiles.Chameleon:
			Animal chameleon = new Chameleon();
			chameleon.decodeFromXml(element);
			return chameleon;
		
		case Constants.Animals.Reptiles.Crocodile:
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
			
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
			
		case Constants.Animals.Aquatics.Clownfish:
			Animal clownfish = new Clownfish();
			clownfish.decodeFromXml(element);
			return clownfish;
		
		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
			
		case Constants.Animals.Aquatics.Whale:
			Animal whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
		
		default:
			break;
		}
		return null;
	}
	
}
