package hw_09_11_2020.hw_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DOMParsing {

    private static ArrayList<Doctor> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        File inputFile = new File("D:\\TMS\\Homework_1\\src\\hw_09_11_2020\\hw_1\\Employee.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(inputFile);

        NodeList nodeList = document.getElementsByTagName("employee");
        for (int temp = 0; temp < nodeList.getLength(); temp++) {
            org.w3c.dom.Node node = nodeList.item(temp);

            if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                Element element = (Element) node;
                employees.add(new Doctor(element.getElementsByTagName("name").item(0).getTextContent(),
                        element.getElementsByTagName("position").item(0).getTextContent(),
                        element.getElementsByTagName("department").item(0).getTextContent(),
                        element.getElementsByTagName("experience").item(0).getTextContent()));
            }
        }

        for (Doctor employee : employees)
            System.out.println(String.format("Employee info: Name - %s, Position - %s, Department - %s, Experience - %s \n",
                    employee.getName(), employee.getPosition(), employee.getDepartment(), employee.getExperience()));

        System.out.println(filterEmployees(employees, isName("Петрова Мария Ивановна")));
    }

    public static Predicate<Doctor> isName(String name) {
        return p -> p.getName().equals(name);
    }

    public static List<Doctor> filterEmployees (List<Doctor> employees,
                                                  Predicate<Doctor> predicate) {
        return employees.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
