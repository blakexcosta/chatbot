package hello;

import org.python.core.PyException;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /*
        //page 193 Utilizing PythonInterpreter
        PythonInterpreter interp = new PythonInterpreter();
        interp.exec("import sys");
        //line below doesn't work because it has not been imported to /Lib / is unknown to jython. easy_install? pip?
        //interp.exec("from chatterbot import ChatBot");
        interp.exec("print sys");

        interp.set("a", new PyInteger(42));
        interp.exec("print a");
        interp.exec("x = 2+2");
        interp.exec("p = sys.path");

        PyObject x = interp.get("x");
        PyObject p = interp.get("p");
        System.out.println("x: " + x);
        System.out.println("path: " + p);

        // Create factory and coerce Jython calculator object

        //run the spring application
        //SpringApplication.run(Application.class, args);
        */
        JythonObjectFactory factory = JythonObjectFactory.getInstance();
        BuildingType building = (BuildingType) factory.createObject(
                BuildingType.class, "Building");
        // Populate the object with values using the setter methods
        building.setBuildingName("BUIDING-A");
        building.setBuildingAddress("100 MAIN ST.");
        building.setBuildingId(1);
        System.out.println(building.getBuildingId() + " " + building.getBuildingName() + " " +
                building.getBuildingAddress());
    }

}