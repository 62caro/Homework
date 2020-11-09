package hw_09_11_2020.hw_1;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParsing extends DefaultHandler {

    boolean bName = false;
    boolean bPosition = false;
    boolean bDepartment = false;
    boolean bExperience = false;

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes) {

        if (qName.equalsIgnoreCase("employee")) {
        } else if (qName.equalsIgnoreCase("name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase("position")) {
            bPosition = true;
        } else if (qName.equalsIgnoreCase("department")) {
            bDepartment = true;
        } else if (qName.equalsIgnoreCase("experience")) {
            bExperience = true;
        }
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) {

        if (qName.equalsIgnoreCase("student")) {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) {

        if (bName) {
            System.out.println("Name: " + new String(ch, start, length));
            bName = false;
        } else if (bPosition) {
            System.out.println("Position: " + new String(ch, start, length));
            bPosition = false;
        } else if (bDepartment) {
            System.out.println("Department: " + new String(ch, start, length));
            bDepartment = false;
        } else if (bExperience) {
            System.out.println("Experience: " + new String(ch, start, length) + "\n");
            bExperience = false;
        }
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("D:\\TMS\\Homework_1\\src\\hw_09_11_2020\\hw_1\\Employee.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            SaxParsing userhandler = new SaxParsing();
            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
